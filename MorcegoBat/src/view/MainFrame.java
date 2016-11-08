package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import model.Usuario;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 8456560429229699542L;
	
	private Usuario usuario;
	private JLabel userName;
	
	private MainPanel mainPanel;
	
	public MainFrame (Usuario usuario) {
		this.usuario = usuario;
		initialize();
		add(getMainPanel(), BorderLayout.CENTER);
		add(getUserName(), BorderLayout.NORTH);
	}
	
	public void initialize() {
		setSize(830, 660);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Morcego.bat");
		setVisible(true);
	}

	public MainPanel getMainPanel() {
		if(mainPanel == null){
			mainPanel = new MainPanel(usuario);
			EmptyBorder empty = new EmptyBorder(5, 5, 5, 5);
			mainPanel.setBorder(empty);
		}
		return mainPanel;
	}

	public JLabel getUserName() {
		if(userName == null) {
			userName = new JLabel("   " + usuario.getNome());
		}
		return userName;
	}
	
	

}
