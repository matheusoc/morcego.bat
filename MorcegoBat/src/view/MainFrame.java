package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 8456560429229699542L;
	
	public MainFrame () {
		initialize();
		add(getMainPanel(), BorderLayout.CENTER);
	}
	
	private MainPanel mainPanel;
	
	public void initialize() {
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setVisible(true);
	}

	public MainPanel getMainPanel() {
		if(mainPanel == null){
			mainPanel = new MainPanel();
		}
		return mainPanel;
	}
	
	

}
