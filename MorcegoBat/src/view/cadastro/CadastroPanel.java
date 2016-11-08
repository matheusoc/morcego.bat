package view.cadastro;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import view.components.VilainComponentsPanel;

public class CadastroPanel extends JPanel{

	private static final long serialVersionUID = -1127160331366301227L;
	
	private VilainComponentsPanel componentsPanel;
	private SavePanel savePanel;
	
	public CadastroPanel(){
		setLayout(new BorderLayout());
		add(getComponentsPanel(), BorderLayout.CENTER);
		add(getSavePanel(), BorderLayout.PAGE_END);
	}

	public VilainComponentsPanel getComponentsPanel() {
		if(componentsPanel == null) {
			componentsPanel = new VilainComponentsPanel();
		}
		return componentsPanel;
	}
	
	public SavePanel getSavePanel() {
		if(savePanel == null) {
			savePanel = new SavePanel();
			//savePanel.getSaveButton().addActionListener(l);
		}
		return savePanel;
	}
	
}
