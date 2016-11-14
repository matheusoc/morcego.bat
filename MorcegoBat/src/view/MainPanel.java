package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

import model.Administrador;
import model.Usuario;
import model.Vilao;
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
			cadastroPanel.getSavePanel().getSaveButton().addActionListener(setSaveLister());				
		}
		return cadastroPanel;
	}

	public ListarPanel getListarPanel() {
		if(listarPanel == null){
			listarPanel = new ListarPanel(usuario);
		}
		return listarPanel;
	}
	
	public ActionListener setSaveLister(){
		return new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Vilao vilao = getCadastroPanel().getComponentsPanel().getVilain();
				if(getCadastroPanel().getComponentsPanel().checkEmpty()){
					usuario.cadastrar(vilao);
					getCadastroPanel().getComponentsPanel().setTextEmpty();
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
					getListarPanel().atualizaTabela(vilao);;
				}
				else JOptionPane.showMessageDialog(null, "Obrigatório preencher o campo nome!");
			}
		};
	}
	
	
}
