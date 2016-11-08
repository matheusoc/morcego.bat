package view.cadastro;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SavePanel extends JPanel{

	private static final long serialVersionUID = -4108685115202153261L;
	
	private JButton saveButton;
	
	public SavePanel(){
		add(getSaveButton());
	}
	
	protected JButton getSaveButton() {
		if(saveButton == null) {
			saveButton = new JButton("Salvar");
		}
		return saveButton;
	}

}
