package view;

import javax.swing.JTabbedPane;

import view.cadastro.CadastroPanel;
import view.listar.ListarPanel;

public class MainPanel extends JTabbedPane{

	private static final long serialVersionUID = -8668618688820184387L;
	
	private CadastroPanel cadastroPanel;
	private ListarPanel listarPanel;
	
	public MainPanel(){
		initialize();
		setVisible(true);
	}
	
	private void initialize(){
		addTab("Lista", getListarPanel());
		addTab("Cadastro",  getCadastroPanel());
	}

	public CadastroPanel getCadastroPanel() {
		if(cadastroPanel == null){
			cadastroPanel = new CadastroPanel();
		}
		return cadastroPanel;
	}

	public ListarPanel getListarPanel() {
		if(listarPanel == null){
			listarPanel = new ListarPanel();
		}
		return listarPanel;
	}

	
	
	
	
}
