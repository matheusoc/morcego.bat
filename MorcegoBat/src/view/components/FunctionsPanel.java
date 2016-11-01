package view.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FunctionsPanel extends JPanel{

	private static final long serialVersionUID = 6291572996652705844L;
	
	private ArrayList<FunctionsListener> listeners = new ArrayList<FunctionsListener>();
	
	private JButton removeButton;
	private JButton editButton;
	
	public FunctionsPanel(){
		initialize();
	}
	public void initialize() {
		add(getRemoveButton());
		add(getEditButton());
	}
	public JButton getRemoveButton() {
		if(removeButton == null) {
			removeButton = new JButton("Remover");
			removeButton.setMnemonic(KeyEvent.VK_ENTER);
		}
		removeButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				removeClicked();
				
			}
		});
		return removeButton;
	}

	public JButton getEditButton() {
		if(editButton == null) {
			editButton = new JButton("Editar");
		}
		editButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				editClicked();
				
			}
		});
		return editButton;
	}
	
	public void removeClicked() {
		for(FunctionsListener listener: listeners) {
			listener.deletePerform();
		}
	}
	
	public void editClicked() {
		for(FunctionsListener listener: listeners) {
			listener.editPerform();
		}
	}
	
	public void addButtonsListener(FunctionsListener listener) {
		listeners.add(listener);
	}

}
