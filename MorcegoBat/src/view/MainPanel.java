package view;

import javax.swing.JTabbedPane;

import model.Administrador;
import model.Usuario;
import view.cadastro.CadastroPanel;
import view.listar.ListarPanel;

public class MainPanel extends JTabbedPane{

	private static final long serialVersionUID = -8668618688820184387L;
	
	private CadastroPanel cadastroPanel;
	private ListarPanel listarPanel;
	
	private Usuario usuario;
	
	public MainPanel(Usuario usuario){
		this.usuario = usuario;
		setVisible(true);
		initialize();
	}
	
	private void initialize(){
		addTab("Lista", getListarPanel());
		if(usuario instanceof Administrador) {
			addTab("Cadastro",  getCadastroPanel());
		}
		
	}

	public CadastroPanel getCadastroPanel() {
		if(cadastroPanel == null){
			cadastroPanel = new CadastroPanel();
		}
		return cadastroPanel;
	}

	public ListarPanel getListarPanel() {
		if(listarPanel == null){
			listarPanel = new ListarPanel(usuario);
		}
		return listarPanel;
	}

	
	
	
	
}
