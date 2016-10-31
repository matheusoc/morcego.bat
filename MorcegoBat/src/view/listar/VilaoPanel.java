package view.listar;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class VilaoPanel extends JPanel{

	private static final long serialVersionUID = 4765246606933577684L;
	
	private GridBagLayout gridLayout;
	
	private JLabel nullLabel;
	private GridBagConstraints nullConstraints;
	
	private JLabel showName;
	private GridBagConstraints showNameConstraints;
	
	private JLabel inputApelido;
	private GridBagConstraints apelidoConstraints;
	
	private JLabel modeAcao;
	private GridBagConstraints modeConstraints;
	
	private JLabel status;
	private GridBagConstraints statusConstraints;
	
	private JLabel cat;
	private GridBagConstraints catConstraints;
	 
	private JLabel action;
	private GridBagConstraints actionConstraints;
	 
	private JLabel fisico;
	private GridBagConstraints fisicoConstraints;
	
	private JLabel obs;
	private GridBagConstraints obsConstraints;
	
	public VilaoPanel() {
		setLayout(getGridLayout());
		setBorder(getBorder());
		add(getNullLabel(), getNullConstraints());
		add(getShowName(), getShowNameConstraints());
		add(getInputApelido(), getApelidoConstraints());
		add(getModeAcao(), getModeConstraints());
		add(getStatus(), getStatusConstraints());
		add(getCat(), getCatConstraints());
		add(getAction(), getActionConstraints());
		add(getFisico(), getFisicoConstraints());
		add(getObs(), getObsConstraints());
		
	}
	
	private GridBagLayout getGridLayout(){
		if(gridLayout == null) {
			gridLayout = new GridBagLayout();
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
			nullLabel = new JLabel("A");
			nullLabel.setPreferredSize(new Dimension(350, 0));
		}
		return nullLabel;
	}
	
	private GridBagConstraints getNullConstraints(){
		if(nullConstraints == null) {
			nullConstraints = new GridBagConstraints();
			nullConstraints.gridx = 0;
			nullConstraints.gridy = 0;
			nullConstraints.gridwidth = 3;
			nullConstraints.anchor = GridBagConstraints.NORTHWEST;
		}
		return nullConstraints;
	}

	public JLabel getShowName() {
		if(showName == null){
			showName = new JLabel("Nome:");
		}
		return showName;
	}
	
	
	public GridBagConstraints getShowNameConstraints() {
		if(showNameConstraints == null) {
			showNameConstraints = new GridBagConstraints();
			showNameConstraints.gridx = 0;
			showNameConstraints.gridy = 1;
			showNameConstraints.anchor = GridBagConstraints.NORTHWEST;
			showNameConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return showNameConstraints;
	}

	public JLabel getInputApelido() {
		if(inputApelido == null) {
			inputApelido = new JLabel("Apelido:");
		}
		return inputApelido;
	}

	public GridBagConstraints getApelidoConstraints() {
		if(apelidoConstraints == null) {
			apelidoConstraints = new GridBagConstraints();
			apelidoConstraints.gridx = 0;
			apelidoConstraints.gridy = 2;
			apelidoConstraints.anchor = GridBagConstraints.NORTHWEST;
			apelidoConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return apelidoConstraints;
	}

	public JLabel getModeAcao() {
		if(modeAcao == null) {
			modeAcao = new JLabel("Modo de ação:");
		}
		return modeAcao;
	}

	public GridBagConstraints getModeConstraints() {
		if(modeConstraints == null) {
			modeConstraints = new GridBagConstraints();
			modeConstraints.gridx = 0;
			modeConstraints.gridy = 3;
			modeConstraints.anchor = GridBagConstraints.NORTHWEST;
			modeConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return modeConstraints;
	}

	public JLabel getStatus() {
		if(status == null) {
			status = new JLabel("Status:");
		}
		return status;
	}

	public GridBagConstraints getStatusConstraints() {
		if(statusConstraints == null) {
			statusConstraints = new GridBagConstraints();
			statusConstraints.gridx = 0;
			statusConstraints.gridy = 4;
			statusConstraints.anchor = GridBagConstraints.NORTHWEST;
			statusConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return statusConstraints;
	}

	public JLabel getCat() {
		if(cat == null) {
			cat = new JLabel("Categoria:");
		}
		return cat;
	}

	public GridBagConstraints getCatConstraints() {
		if(catConstraints == null) {
			catConstraints = new GridBagConstraints();
			catConstraints.gridx = 0;
			catConstraints.gridy = 5;
			catConstraints.anchor = GridBagConstraints.NORTHWEST;
			catConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return catConstraints;
	}

	public JLabel getAction() {
		if(action == null) {
			action = new JLabel("Locais de ação:");
		}
		return action;
	}

	public GridBagConstraints getActionConstraints() {
		if(actionConstraints == null) {
			actionConstraints = new GridBagConstraints();
			actionConstraints.gridx = 0;
			actionConstraints.gridy = 6;
			actionConstraints.anchor = GridBagConstraints.NORTHWEST;
			actionConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return actionConstraints;
	}

	public JLabel getFisico() {
		if(fisico == null) {
			fisico = new JLabel("Características físicas:");
		}
		return fisico;
	}

	public GridBagConstraints getFisicoConstraints() {
		if(fisicoConstraints == null) {
			fisicoConstraints = new GridBagConstraints();
			fisicoConstraints.gridx = 0;
			fisicoConstraints.gridy = 7;
			fisicoConstraints.anchor = GridBagConstraints.NORTHWEST;
			fisicoConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return fisicoConstraints;
	}

	public JLabel getObs() {
		if(obs == null) {
			obs = new JLabel("Observações:");
		}
		return obs;
	}

	public GridBagConstraints getObsConstraints() {
		if(obsConstraints == null) {
			obsConstraints = new GridBagConstraints();
			obsConstraints.gridx = 0;
			obsConstraints.gridy = 8;
			obsConstraints.anchor = GridBagConstraints.NORTHWEST;
			obsConstraints.weighty = 1.0;
			obsConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return obsConstraints;
	}
	
	
	
	
}
