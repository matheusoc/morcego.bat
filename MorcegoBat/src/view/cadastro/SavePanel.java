package view.cadastro;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SavePanel extends JPanel{

	private static final long serialVersionUID = -4108685115202153261L;
	
	private SaveButton saveButton;
	
	public SavePanel(){
		add(getSaveButton());
	}
	
	public JButton getSaveButton() {
		if(saveButton == null) {
			saveButton = new SaveButton("Salvar");
		}
		return saveButton;
	}

}
