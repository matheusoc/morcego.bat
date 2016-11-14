package view.listar;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class Lista extends JList<String> {

	private static final long serialVersionUID = 3694195326470635936L;
	
	public Lista(DefaultListModel<String> model){
		setModel(model);
	}


}
