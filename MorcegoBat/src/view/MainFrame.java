package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.EmptyBorder;

import model.Usuario;
import view.login.LoginFrame;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 8456560429229699542L;
	
	private Usuario usuario;
	
	private JMenuBar bar;
	private JMenu conta;
	private JMenuItem exit;
	
	private MainPanel mainPanel;
	
	public MainFrame (Usuario usuario) {
		this.usuario = usuario;
		initialize();
		add(getMainPanel(), BorderLayout.CENTER);
		setJMenuBar(getBar());
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

	public JMenuBar getBar() {
		if(bar == null) {
			bar = new JMenuBar();
			bar.add(getConta());
		}
		return bar;
	}

	public JMenu getConta() {
		if(conta == null) {
			conta = new JMenu(usuario.getNome());
			conta.add(getExit()); 
		}
		return conta;
	}

	public JMenuItem getExit() {
		if(exit == null) {
			exit = new JMenuItem("Sair");
			exit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					dispose();
					new LoginFrame();
				}
			});
		}
		return exit;
	}
	
	

}
