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
	
	public ListarPanel(){
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
	
}
