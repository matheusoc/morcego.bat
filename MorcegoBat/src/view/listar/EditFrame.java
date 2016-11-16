package view.listar;

import java.awt.BorderLayout;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import model.Usuario;
import model.Vilao;
import view.components.ButtonsListener;
import view.components.ButtonsPanel;
import view.components.VilainComponentsPanel;

public class EditFrame extends JFrame{
	
	private static final long serialVersionUID = -1010664673891339038L;
	
	private VilainComponentsPanel componentsPanel;
	private ButtonsPanel buttonsPanel;
	
	private Vilao vilao;
	
	private Usuario usuario;

	public EditFrame(Vilao vilao, Usuario usuario){
		
		this.vilao = vilao;
		this.usuario = usuario;
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		
		initialize();
		
		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		
		setTitle("Morcego.bat");
		setIconImage(getIcon());
		
	}

	private void initialize() {
		add(getComponentsPanel(), BorderLayout.CENTER);
		add(getButtonsPanel(), BorderLayout.PAGE_END);
	}
	
	public Border createBorder() {
		EmptyBorder innerEmpty = new EmptyBorder(5, 5, 5, 5);
		TitledBorder titledBorder = new TitledBorder("Editar");
		EmptyBorder outerEmpty = new EmptyBorder(5, 5, 5, 5);
		CompoundBorder innerCompound = new CompoundBorder(titledBorder,
				innerEmpty);
		CompoundBorder totalCompound = new CompoundBorder(outerEmpty,
				innerCompound);
		return totalCompound;
	}

	protected VilainComponentsPanel getComponentsPanel() {
		if(componentsPanel == null) {
			componentsPanel = new VilainComponentsPanel(vilao);
			componentsPanel.setBorder(createBorder());
		}
		return componentsPanel;
	}

	public ButtonsPanel getButtonsPanel() {
		if(buttonsPanel == null) {
			buttonsPanel = new ButtonsPanel();
			buttonsPanel.addButtonsListener(new ButtonsListener() {
				
				@Override
				public void okPerform() {
					usuario.edit(vilao, getComponentsPanel().getVilain());
					JOptionPane.showMessageDialog(null, "Vilão editado com sucesso!");
					dispose();
				}
				
				@Override
				public void cancelPerform() {
					dispose();
				}
			});
		}
		return buttonsPanel;
	}
	
	private Image getIcon(){
		URL iconURL = getClass().getResource("/images/batman.png");
		ImageIcon image = new ImageIcon(iconURL);
		return image.getImage();
	}
	
}
