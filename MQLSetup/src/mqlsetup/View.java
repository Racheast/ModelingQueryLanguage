package mqlsetup;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import util.FileChooser;

public class View extends ViewPart {
	public static final String ID = "MQLSetup.view";
	
	@Override
	public void createPartControl(Composite parent) {
		new FileChooser(parent);
	}

	@Override
	public void setFocus() {
	}	
}