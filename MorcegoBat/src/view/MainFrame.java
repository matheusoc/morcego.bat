package view;

import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	private JLabel image;
	
	private MainPanel mainPanel;
	
	public MainFrame (Usuario usuario) {
		this.usuario = usuario;
		initialize();
		add(getMainPanel(), BorderLayout.CENTER);
		add(getImage(), BorderLayout.NORTH);
		setJMenuBar(getBar());
		setIconImage(getIcon());
		

	}
	
	public void initialize() {
		setSize(1000, 718);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Morcego.bat");
		setVisible(true);
		setResizable(false);
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
	
	
	
	public JLabel getImage() {
		if(image == null) {
			image = new JLabel();
			BufferedImage bi = null;
			URL icon = getClass().getResource("/images/logo.jpg");
		    try {
		        ImageIcon ii = new ImageIcon(icon);//path to image
		        bi = new BufferedImage(getWidth(), 150, BufferedImage.TYPE_INT_RGB);
		        Graphics2D g2d = (Graphics2D) bi.createGraphics();
		        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY));
		        g2d.drawImage(ii.getImage(), 0, 0, getWidth(), 150, null);
		    } catch (Exception e) {
		        e.printStackTrace();
		        return null;
		    }
			
			image.setIcon(new ImageIcon(bi));
		}
		return image; 
	}

	private Image getIcon(){
		URL iconURL = getClass().getResource("/images/batman.png");
		ImageIcon image = new ImageIcon(iconURL);
		return image.getImage();
	}

}
