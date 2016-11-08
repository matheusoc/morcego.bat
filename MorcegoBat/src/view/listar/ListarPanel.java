package view.listar;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import model.Administrador;
import model.Usuario;
import view.components.FunctionsListener;
import view.components.FunctionsPanel;

public class ListarPanel extends JPanel{

	private static final long serialVersionUID = 2596783305277684735L;
	
	private JLabel buscarLabel;
	private GridBagConstraints buscarConstraints;
	
	private JTextField nomeLabel;
	private GridBagConstraints nomeConstraints;
	
	private JList<String> list;
	private GridBagConstraints listConstraints;
	private DefaultListModel<String> model;
	private JScrollPane listScroller; 
	
	private VilaoPanel vilaoPanel;
	private GridBagConstraints vilaoGridBagConstraints;
	
	private FunctionsPanel functionsPanel;
	private GridBagConstraints functionsGridBagConstraints;
	 
	private Usuario usuario;
	
	public ListarPanel(Usuario usuario){
		this.usuario = usuario;
		initialize();
	}
	
	public void initialize(){
		setLayout(new GridBagLayout());
		addComponent();
		setVisible(true);
	}
	
	public void addComponent(){
		add(getBuscarLabel(), getBuscarConstraints());
		add(getNomeLabel(), getNomeConstraints());
		add(getListScroller(), getListConstraints());
		add(getVilaoPanel(), getVilaoGridBagConstraints());
		if(usuario instanceof Administrador) {
			add(getFunctionsPanel(), getFunctionsGridBagConstraints());
		}
		
	}

	public JLabel getBuscarLabel() {
		if(buscarLabel == null){
			buscarLabel = new JLabel("Buscar");
		}
		return buscarLabel;
	}

	public GridBagConstraints getBuscarConstraints() {
		if(buscarConstraints == null){
			buscarConstraints = new GridBagConstraints();
			buscarConstraints.gridx = 0;
			buscarConstraints.gridy = 0;
			buscarConstraints.insets = new Insets(2, 2, 2, 2);
			buscarConstraints.anchor = GridBagConstraints.LINE_START;
		}
		return buscarConstraints;
	}

	public JTextField getNomeLabel() {
		if(nomeLabel == null) {
			nomeLabel = new JTextField();
			Dimension d = nomeLabel.getPreferredSize();
			d.width = 250;
			nomeLabel.setPreferredSize(d);
		}
		return nomeLabel;
	}

	public GridBagConstraints getNomeConstraints() {
		if(nomeConstraints == null){
			nomeConstraints = new GridBagConstraints();
			nomeConstraints.gridx = 1;
			nomeConstraints.gridy = 0;
			nomeConstraints.insets = new Insets(2, 2, 2, 2);
			nomeConstraints.anchor = GridBagConstraints.CENTER;
		}
		return nomeConstraints;
	}
	
	public DefaultListModel<String> getModel(){
		if(model == null) {
			model = new DefaultListModel<>();
		}
		return model;
	}
	
	public JList<String> getList() {
		if(list == null){
			list = new JList<>(getModel());
			list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			list.setLayoutOrientation(JList.VERTICAL);
			list.setVisibleRowCount(-1);			
		}
		return list;
	}

	public JScrollPane getListScroller() {
		if(listScroller == null) {
			listScroller = new JScrollPane(getList());
			listScroller.setPreferredSize(new Dimension(250, 450));
		}
		
		return listScroller;
	}
	
	public GridBagConstraints getListConstraints() {
		if(listConstraints == null){
			listConstraints = new GridBagConstraints();
			listConstraints.gridx = 1;
			listConstraints.gridy = 1;
			listConstraints.insets = new Insets(2, 2, 2, 2);
			listConstraints.anchor = GridBagConstraints.CENTER;
		}
		return listConstraints;
	}

	public VilaoPanel getVilaoPanel() {
		if(vilaoPanel == null) {
			vilaoPanel = new VilaoPanel();
		}
		return vilaoPanel;
	}

	public GridBagConstraints getVilaoGridBagConstraints() {
		if(vilaoGridBagConstraints == null){
			vilaoGridBagConstraints = new GridBagConstraints();
			vilaoGridBagConstraints.gridx = 2;
			vilaoGridBagConstraints.gridy = 0;
			vilaoGridBagConstraints.gridheight = 2;
			vilaoGridBagConstraints.insets = new Insets(2, 10, 2, 2);
			vilaoGridBagConstraints.anchor = GridBagConstraints.CENTER;
			vilaoGridBagConstraints.fill = GridBagConstraints.BOTH;
		}
		return vilaoGridBagConstraints;
	}

	public FunctionsPanel getFunctionsPanel() {
		if(functionsPanel == null) {
			functionsPanel = new FunctionsPanel();
			functionsPanel.addButtonsListener(new FunctionsListener() {
				
				@Override
				public void editPerform() {
					
					new EditFrame();
				}
				
				@Override
				public void deletePerform() {
					
					
				}
			});
		}
		return functionsPanel;
	}

	public GridBagConstraints getFunctionsGridBagConstraints() {
		if(functionsGridBagConstraints == null) {
			functionsGridBagConstraints = new GridBagConstraints();
			functionsGridBagConstraints.gridx = 2;
			functionsGridBagConstraints.gridy = 2;
			functionsGridBagConstraints.insets = new Insets(2, 2, 2, 2);
			functionsGridBagConstraints.anchor = GridBagConstraints.CENTER;
		}
		return functionsGridBagConstraints;
	}
	
	
	
}
