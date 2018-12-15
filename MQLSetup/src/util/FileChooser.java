package util;

import java.io.File;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.codegen.jet.JETException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Text;
import util.MMGenerators.DMMGenerator.DMMGenerator;
import util.MMGenerators.QMMGenerator.QMMGenerator;
import util.MMGenerators.QRMMGenerator.QRMMGenerator;

public class FileChooser extends Composite {

	private Text textarea;
	private Button selectEcoreButton;
	private Button genQLButton;
	private File ecoreFile = null;
	
	
	public FileChooser(Composite parent) {
		super(parent, SWT.NULL);
		createContent();
	}

	public void createContent() {
		GridLayout layout = new GridLayout(1, false);
		setLayout(layout);

		textarea = new Text(this, SWT.H_SCROLL | SWT.READ_ONLY);
		GridData gd1 = new GridData(GridData.FILL_BOTH);
		gd1.grabExcessHorizontalSpace = true;
		gd1.horizontalAlignment = GridData.FILL;
		textarea.setLayoutData(gd1);

		GridData gd2 = new GridData(GridData.HORIZONTAL_ALIGN_END);
		gd2.grabExcessHorizontalSpace = true;
		gd2.horizontalAlignment = GridData.FILL;
		selectEcoreButton = new Button(this, SWT.END);
		selectEcoreButton.setText("Select Domain-Metamodel Ecore-File");
		selectEcoreButton.setLayoutData(gd2);
		selectEcoreButton.addSelectionListener(new SelectionListener() {

			public void widgetDefaultSelected(SelectionEvent e) {
			}

			public void widgetSelected(SelectionEvent e) {
				FileDialog dlg = new FileDialog(selectEcoreButton.getShell(), SWT.OPEN);
				dlg.setText("Open");
				dlg.setFilterExtensions(new String[] { "*.ecore" });
				String path = dlg.open();
				if (path == null)
					return;
				textarea.setText(path);
				ecoreFile = new File(path);
				genQLButton.setEnabled(true);
			}
		});
		
		GridData gd3 = new GridData(GridData.HORIZONTAL_ALIGN_END);
		gd3.grabExcessHorizontalSpace = true;
		gd3.horizontalAlignment = GridData.FILL;
		genQLButton = new Button(this, SWT.END);
		genQLButton.setText("Generate DMM.ecore, QMM.ecore, QRMM.ecore, DMM2QRMM.atl, MQL.xtext");
		genQLButton.setEnabled(false);
		genQLButton.setLayoutData(gd3);
		genQLButton.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
			}

			public void widgetSelected(SelectionEvent e) {
				MQLConstantsWriter.writeConstantsFile(ecoreFile);
				//DMMGenerator.createDMMFile(ecoreFile);
				try {
					QMMGenerator.generateQMM(ecoreFile);
					QRMMGenerator.generateQRMM(ecoreFile);
					//ATLGenerator.writeATLFile();
					XTextGenerator.writeXTextFile();
				} catch (JETException e1) {
					e1.printStackTrace();
				} catch (Exception e2){
					e2.printStackTrace();
				}
				
				String dmmPath = Constants.WORKSPACE_PATH + "/model/DMM.ecore";
				String qmmPath = Constants.WORKSPACE_PATH + "/../QMM/model/QMM.ecore";
				String qrmmPath = Constants.WORKSPACE_PATH + "/../QRMM/model/QRMM.ecore";
				String xtextPath = Constants.WORKSPACE_PATH + "/../org.xtext.MQL/src/org/xtext/MQL.xtext";
				String atlPath = Constants.WORKSPACE_PATH + "/../org.xtext.MQL.ui/transformation";
				String constantsPath = Constants.WORKSPACE_PATH + "/../org.xtext.MQL.ui/src/org/xtext/ui/util/Constants.java";
				
				String infoMessage 	= "QMM.ecore has been generated into the project QMM (" + qmmPath + ").\nPlease run the \"Generate All\"-task of QMM.genmodel to update the QMM metamodel."
									+	"\n\n"
									+	"QRMM.ecore has been generated into the project QRMM (" + qrmmPath + ").\nPlease run the \"Generate All\"-task of QRMM.genmodel to update the QRMM metamodel."
									+	"\n\n"
									+ 	"MQL.xtext has been generated into the project org.xtext.MQL (" + xtextPath + ").\nPlease run the MWE2 Workflow to re-generate the XText-artifacts"
									+	"\n\n"
									+	"Constants.java has been generated into the project org.xtext.MQL.ui (" + constantsPath + ")"
									+	"\n\n";
									//+	"DMM2QRMM.atl has been generated into the project org.xtext.MQL.ui (" + atlPath + ").";
									//+	"\nDMM.ecore has been generated into the project MQLSetup (" + dmmPath + ")."
									//+	"\n\n"
				MessageDialog.openInformation(getShell(), "Information", infoMessage);
				getShell().close();
			}
		});
	}
}
