package view.listar;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import view.components.ButtonsListener;
import view.components.ButtonsPanel;
import view.components.VilainComponentsPanel;

public class RemoveFrame extends JFrame{
	
	private static final long serialVersionUID = -1010664673891339038L;
	
	private VilainComponentsPanel componentsPanel;
	private ButtonsPanel buttonsPanel;

	public RemoveFrame(){
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		
		initialize();
		
		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		
		setTitle("Editar");
		
	}

	private void initialize() {
		add(getComponentsPanel(), BorderLayout.CENTER);
		add(getButtonsPanel(), BorderLayout.PAGE_END);
	}

	protected VilainComponentsPanel getComponentsPanel() {
		if(componentsPanel == null) {
			componentsPanel = new VilainComponentsPanel();
		}
		return componentsPanel;
	}

	public ButtonsPanel getButtonsPanel() {
		if(buttonsPanel == null) {
			buttonsPanel = new ButtonsPanel();
			buttonsPanel.addButtonsListener(new ButtonsListener() {
				
				@Override
				public void okPerform() {
					
				}
				
				@Override
				public void cancelPerform() {
					dispose();
				}
			});
		}
		return buttonsPanel;
	}
	
	
	
}
