package view.login;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controller.LoginControl;
import model.Usuario;
import view.MainFrame;
import view.components.ButtonsListener;
import view.components.ButtonsPanel;

public class LoginFrame extends JFrame {
	
	private static final long serialVersionUID = 6597839756768366998L;
	
	private UserPanel userPanel;
	private ButtonsPanel buttonsPanel;
	
	public LoginFrame() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		initialize();
		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Morcego.bat");

	}
	
	public void initialize() {
		add(getUserLabel(), BorderLayout.CENTER);
		add(getConfirmLabel(), BorderLayout.PAGE_END);
	}
	
	public UserPanel getUserLabel() {
		if(userPanel == null) {
			userPanel = new UserPanel();
		}
		return userPanel;
	}
	
	public ButtonsPanel getConfirmLabel() {
		if(buttonsPanel == null) {
			buttonsPanel = new ButtonsPanel();
		}
	
		buttonsPanel.addButtonsListener(new ButtonsListener() {
			
			@Override
			public void okPerform() {
				
				okClicked();
				
			}
			
			@Override
			public void cancelPerform() {
				cancelCliked();
				
			}
		});
		return buttonsPanel;
	}
	
	private void okClicked() {
		
		String[] a = getUserLabel().getUser();
		Usuario usuario = LoginControl.checkLogin(a[0], a[1]);
		if(usuario != null) {
			new MainFrame(usuario);
			dispose();
		} else {
			JOptionPane.showMessageDialog(null, "Senha incorreta!");
		}
			
	}
	
	private void cancelCliked() {
		String message = "Deseja mesmo sair ?";
		int i = JOptionPane.showConfirmDialog(this, message, "Sair", JOptionPane.YES_OPTION);
		if(i == JOptionPane.YES_OPTION) {
			dispose();
			System.exit(0);
		}
	}
}