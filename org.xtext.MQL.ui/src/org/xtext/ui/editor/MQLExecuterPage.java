package org.xtext.ui.editor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.xml.sax.SAXException;
import org.xtext.ui.util.DomainModelTransformer;
//import org.xtext.ui.util.ATLLauncher;
import org.xtext.ui.util.VQLLauncher;
import qrmm.SearchableElement;

public class MQLExecuterPage extends EditorPart {
	private XtextDocumentBasedEditorInput xtextEditorInput;
	private ListViewer listViewer;
	private Text text;
	private Collection<SearchableElement> queryResult = new ArrayList<SearchableElement>();
	private Button selectDomainModelButton, executeQueryButton;
	
	@Override
	public void init(final IEditorSite site, final IEditorInput input) throws PartInitException {
		this.xtextEditorInput = (XtextDocumentBasedEditorInput) input;
		setSite(site);
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public void doSave(final IProgressMonitor monitor) {
	}

	@Override
	public void doSaveAs() {
	}

	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	@Override
	public void createPartControl(final Composite parent) {
		Composite mainComposite = new Composite(parent, SWT.NONE);
		mainComposite.setLayout(new GridLayout(2, false));  

		Label titleLabel = new Label(mainComposite, SWT.NONE);
		titleLabel.setFont(JFaceResources.getBannerFont());
		titleLabel.setText("MQL Query Results");
		titleLabel.setLayoutData(GridDataFactory.fillDefaults().span(2, 1).create());
		
		this.listViewer = new ListViewer(mainComposite, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		this.listViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).span(2, 1).create());
		this.listViewer.setContentProvider(new ArrayContentProvider());
		this.listViewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(final Object element) {
				if (element instanceof SearchableElement) {
					SearchableElement searchableElement = (SearchableElement) element;
					return searchableElement.toString();
				}
				return super.getText(element);
			}
		});

		Composite selectionComposite = new Composite(mainComposite, SWT.NONE);
		selectionComposite.setLayout(new RowLayout());
		selectionComposite.setLayoutData(GridDataFactory.fillDefaults().span(2, 1).create());
		/*
		 * Button addButton = new Button(buttonComposite, SWT.PUSH);
		 * addButton.setText("Add"); addButton.addListener(SWT.Selection, e ->
		 * addEvent());
		 * 
		 * Button editButton = new Button(buttonComposite, SWT.PUSH);
		 * editButton.setText("Edit"); editButton.addListener(SWT.Selection, e
		 * -> editEvent());
		 */
		/*
		 * Button removeButton = new Button(buttonComposite, SWT.PUSH);
		 * removeButton.setText("Remove");
		 * removeButton.addListener(SWT.Selection, e -> removeEvent());
		 */
		
		Label filepathLabel = new Label(selectionComposite, SWT.NONE);
		filepathLabel.setText("Selected domainmodel: ");
		
		text = new Text(selectionComposite, SWT.H_SCROLL | SWT.READ_ONLY);
		text.setText(" NO DOMAINMODEL SELECTED! PLEASE SELECT A DOMAINMODEL.");
		
		Composite buttonComposite = new Composite(mainComposite, SWT.PUSH);
		buttonComposite.setLayout(new FillLayout(SWT.VERTICAL));
		buttonComposite.setLayoutData(GridDataFactory.fillDefaults().span(2, 1).create());
		
		selectDomainModelButton = new Button(buttonComposite, SWT.PUSH);
		selectDomainModelButton.setText("Select Domain Model");
		selectDomainModelButton.addListener(SWT.Selection, e -> selectDomainModel());
		
		executeQueryButton = new Button(buttonComposite, SWT.PUSH);
		executeQueryButton.setText("Execute Query");
		executeQueryButton.setEnabled(false);
		executeQueryButton.addListener(SWT.Selection, e -> executeQuery());
	}

	/**
	 * Add a new event.
	 * 
	 * This initializes a new Event object, opens the dialog to let the user
	 * specify the event information and if the user closes the dialog by
	 * clicking ok, the new event is added to the Xtext document.
	 */
	/*
	 * protected void addEvent() { Event event =
	 * StatemachineFactory.eINSTANCE.createEvent(); event.setName("newEvent");
	 * event.setCode("CODE"); boolean result =
	 * EditEventDialog.editEvent(getSite().getShell(), event); if (result) {
	 * IXtextDocument doc = this.xtextEditorInput.getDocument(); doc.modify(res
	 * -> ((Statemachine) res.getContents().get(0)).getEvents().add(event)); }
	 * 
	 * refreshInput(); }
	 */
	/**
	 * Edit an event.
	 * 
	 * This method opens a dialog to let the user specify the new name and code
	 * for the event. If the user closes the dialog by clicking OK, we search
	 * for the event in the XtextDocument (using the original name) and change
	 * its name and code.
	 */
	/*
	 * protected void editEvent() { IStructuredSelection selection =
	 * (IStructuredSelection) this.listViewer.getSelection(); Event event =
	 * (Event) selection.getFirstElement(); String originalName =
	 * event.getName();
	 * 
	 * boolean result = EditEventDialog.editEvent(getSite().getShell(), event);
	 * if (result) { IXtextDocument doc = this.xtextEditorInput.getDocument();
	 * doc.modify(res -> { Statemachine statemachine = ((Statemachine)
	 * res.getContents().get(0)); Optional<Event> found =
	 * statemachine.getEvents().stream().filter(e -> Objects.equals(e.getName(),
	 * originalName)).findFirst(); if (found.isPresent()) { Event e =
	 * found.get(); e.setName(event.getName()); e.setCode(event.getCode()); }
	 * return null; }); }
	 * 
	 * refreshInput(); }
	 */

	protected void executeQuery() {
		try {
			this.queryResult = VQLLauncher.executeQueryPattern();
			refreshInput();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected void selectDomainModel(){
		FileDialog dlg = new FileDialog(selectDomainModelButton.getShell(),  SWT.OPEN );
		dlg.setText("Open");
		dlg.setFilterExtensions(new String[]{"*.xmi"});
		String path = dlg.open();
		if (path == null) return;
		if(this.text != null) this.text.setText(path);
		//ATLLauncher.launch(path);  //commented out on 15.12.2018 due to ATL/EMTFVM problems in different versions of Eclipse IDEs
		try {
			DomainModelTransformer.launch(path);
			executeQueryButton.setEnabled(true);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Delete an event.
	 * 
	 * This method searches for the selected event in the XtextDocument and
	 * deletes it.
	 */
	/*
	 * protected void removeEvent() { IStructuredSelection selection =
	 * (IStructuredSelection) this.listViewer.getSelection(); Event event =
	 * (Event) selection.getFirstElement();
	 * 
	 * IXtextDocument doc = this.xtextEditorInput.getDocument(); doc.modify(res
	 * -> { Statemachine statemachine = ((Statemachine)
	 * res.getContents().get(0)); Optional<Event> found =
	 * statemachine.getEvents().stream().filter(e -> Objects.equals(e.getName(),
	 * event.getName())).findFirst(); if (found.isPresent()) {
	 * statemachine.getEvents().remove(found.get()); } return null; });
	 * 
	 * refreshInput(); }
	 */
	/**
	 * Recalculates the input to the list viewer, so it is in sync with the
	 * source in the Xtext editor.
	 * 
	 * This is called - when the page becomes visible - after performing an edit
	 * operation
	 * 
	 */
	public void refreshInput() {
		IXtextDocument doc = this.xtextEditorInput.getDocument();
		this.listViewer.setInput(queryResult.toArray());
	}

	@Override
	public void setFocus() {
		this.listViewer.getControl().setFocus();
	}
}
