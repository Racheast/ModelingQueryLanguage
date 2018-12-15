package org.xtext.ui.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com.google.inject.Inject;

public class MQLMultiPageEditor extends MultiPageEditorPart {
	@Inject
	private XtextEditor sourceEditor;

	@Inject
	private MQLExecuterPage formEditor;

	private int sourcePageIndex;

	private int formPageIndex;

	@Override
	public void doSave(final IProgressMonitor monitor) {
		this.sourceEditor.doSave(monitor);
	}

	@Override
	public void doSaveAs() {
		this.sourceEditor.doSaveAs();
	}

	@Override
	public boolean isDirty() {
		return this.sourceEditor.isDirty();
	}

	@Override
	public boolean isSaveAsAllowed() {
		return this.sourceEditor.isSaveAsAllowed();
	}

	@Override
	protected void createPages() {
		try {
			this.sourcePageIndex = addPage(this.sourceEditor, getEditorInput());
			setPageText(this.sourcePageIndex, "Query Definition");
		} catch (PartInitException e) {
			throw new IllegalStateException("Failed to add Xtext editor", e);
		}

		try {
			this.formPageIndex = addPage(this.formEditor,
					new XtextDocumentBasedEditorInput(this.sourceEditor.getDocument()));
			setPageText(this.formPageIndex, "Query Execution & Results");
		} catch (PartInitException e) {
			throw new IllegalStateException("Failed to add State editor", e);
		}
	}

	@Override
	protected void pageChange(final int newPageIndex) {
		if (newPageIndex == this.formPageIndex) {
			this.formEditor.refreshInput();
		}
		super.pageChange(newPageIndex);
	}

}
