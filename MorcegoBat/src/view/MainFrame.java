package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 8456560429229699542L;
	
	private MainPanel mainPanel;
	
	public MainFrame () {
		initialize();
		add(getMainPanel(), BorderLayout.CENTER);
	}
	
	
	
	public void initialize() {
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setVisible(true);
	}

	public MainPanel getMainPanel() {
		if(mainPanel == null){
			mainPanel = new MainPanel();
			EmptyBorder empty = new EmptyBorder(5, 5, 5, 5);
			mainPanel.setBorder(empty);
		}
		return mainPanel;
	}
	
	

}
