package view.listar;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class VilaoPanel extends JPanel{

	private static final long serialVersionUID = 4765246606933577684L;
	
	private GridLayout gridLayout;
	private JLabel nullLabel;
	
	private JLabel showName;
	private JLabel inputApelido;
	
	public VilaoPanel() {
		setLayout(getGridLayout());
		setBorder(getBorder());
		add(getNullLabel());
		add(getShowName());
		add(getInputName());
	}
	
	private GridLayout getGridLayout(){
		if(gridLayout == null) {
			gridLayout = new GridLayout(9, 2);
		}
		return gridLayout;
	}
	
	public Border getBorder() {
		EmptyBorder innerEmpty = new EmptyBorder(5, 5, 5, 5);
		TitledBorder titledBorder = new TitledBorder("Vilão:");
		EmptyBorder outerEmpty = new EmptyBorder(5, 5, 5, 5);
		CompoundBorder innerCompound = new CompoundBorder(titledBorder,
				innerEmpty);
		CompoundBorder totalCompound = new CompoundBorder(outerEmpty,
				innerCompound);
		return totalCompound;
	}
	private JLabel getNullLabel(){
		if(nullLabel == null) {
			nullLabel = new JLabel();
			nullLabel.setPreferredSize(new Dimension(350, 0));
		}
		return nullLabel;
	}

	public JLabel getShowName() {
		if(showName == null){
			showName = new JLabel("Nome:");
		}
		return showName;
	}

	public JLabel getInputName() {
		if(inputApelido == null) {
			inputApelido = new JLabel("Apelido");
		}
		return inputApelido;
	}
	
	
	
	
}
