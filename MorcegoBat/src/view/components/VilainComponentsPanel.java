package view.components;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import model.Vilao;

public class VilainComponentsPanel extends JPanel{
	
	private static final long serialVersionUID = 2315253747172189494L;
	
	private JLabel showName;
	private GridBagConstraints showNameConstraints;
	
	private JTextField writeName;
	private GridBagConstraints writeNameConstraints;
	
	private JLabel inputApelido;
	private GridBagConstraints apelidoConstraints;
	
	private JTextField writeNick;
	private GridBagConstraints writeNickConstraints;
	
	private JLabel action;
	private GridBagConstraints actionConstraints;
	
	private JTextField writeAction;
	private GridBagConstraints writeActionConstraints;
	
	private JLabel modeAcao;
	private GridBagConstraints modeConstraints;
	
	private JComboBox<String> writeModeAction;
	private GridBagConstraints writeModeActionConstraints;
	
	private JLabel status;
	private GridBagConstraints statusConstraints;
	
	private JComboBox<String> writeStatus;
	private GridBagConstraints writeStatusConstraints;
	
	private JLabel cat;
	private GridBagConstraints catConstraints;
	
	private JComboBox<String> writeCat;
	private GridBagConstraints writeCatContraints;
	 
	private JLabel fisico;
	private GridBagConstraints fisicoConstraints;
	
	private JTextArea writeFisico;
	private GridBagConstraints writeFisicoConstraints;
	
	private JLabel obs;
	private GridBagConstraints obsConstraints;
	
	private JTextArea writeObs;
	private GridBagConstraints writeObsConstraints;
	
	private JScrollPane fisicoScrollPane;
	private JScrollPane obsScrollPane;
	
	private Vilao vilao;
	
	public VilainComponentsPanel() {
		initialize();
	}
	
	public VilainComponentsPanel(Vilao vilao) {
		this.vilao = vilao;
		initialize();
		loadVilao();
	}
 
	private void initialize(){
		setLayout(new GridBagLayout());
		addComponent();
		setVisible(true);
	}

	private void addComponent() {
		add(getShowName(), getShowNameConstraints());
		add(getInputApelido(), getApelidoConstraints());
		add(getModeAcao(), getModeConstraints());
		add(getStatus(), getStatusConstraints());
		add(getCat(), getCatConstraints());
		add(getAction(), getActionConstraints());
		add(getFisico(), getFisicoConstraints());
		add(getObs(), getObsConstraints());
		
		add(getWriteName(), getWriteNameConstraints());
		add(getWriteNick(), getWriteNickConstraints());
		add(getWriteAction(), getWriteActionConstraints());
		add(getWriteStatus(), getWriteStatusConstraints());
		add(getWriteCat(), getWriteCatContraints());
		add(getWriteModeAction(), getWriteModeActionConstraints());
		add(getFisicoScrollPane(), getWriteFisicoConstraints());
		add(getObsScrollPane(), getWriteObsConstraints());
		
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
			showNameConstraints.gridy = 0;
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
			apelidoConstraints.gridy = 1;
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
			modeConstraints.gridy = 5;
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
			statusConstraints.gridy = 3;
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
			catConstraints.gridy = 4;
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
			actionConstraints.gridy = 2;
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
			fisicoConstraints.gridx = 2;
			fisicoConstraints.gridy = 0;
			fisicoConstraints.anchor = GridBagConstraints.NORTHWEST;
			fisicoConstraints.insets = new Insets(5, 60, 5, 5);
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
			obsConstraints.gridx = 2;
			obsConstraints.gridy = 4;
			obsConstraints.anchor = GridBagConstraints.NORTHWEST;
			obsConstraints.insets = new Insets(5, 60, 5, 5);
		}
		return obsConstraints;
	}

	public JTextField getWriteName() {
		if(writeName == null) {
			writeName = new JTextField();
			Dimension d = writeName.getPreferredSize();
			d.width = 200;
			writeName.setPreferredSize(d);
			if(vilao != null) {
				writeName.setEditable(false);
			}
		}
		return writeName;
	}

	public GridBagConstraints getWriteNameConstraints() {
		if(writeNameConstraints == null) {
			writeNameConstraints = new GridBagConstraints();
			writeNameConstraints.gridx = 1;
			writeNameConstraints.gridy = 0;
			writeNameConstraints.anchor = GridBagConstraints.NORTHWEST;
			writeNameConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return writeNameConstraints;
	}

	public JTextField getWriteNick() {
		if(writeNick == null) {
			writeNick = new JTextField();
			Dimension d = writeNick.getPreferredSize();
			d.width = 200;
			writeNick.setPreferredSize(d);
		}
		return writeNick;
	}

	public GridBagConstraints getWriteNickConstraints() {
		if(writeNickConstraints == null) {
			writeNickConstraints = new GridBagConstraints();
			writeNickConstraints.gridx = 1;
			writeNickConstraints.gridy = 1;
			writeNickConstraints.anchor = GridBagConstraints.NORTHWEST;
			writeNickConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return writeNickConstraints;
	}

	public JTextField getWriteAction() {
		if(writeAction == null) {
			writeAction = new JTextField();
			Dimension d = writeAction.getPreferredSize();
			d.width = 200;
			writeAction.setPreferredSize(d);
		}
		return writeAction;
	}

	public GridBagConstraints getWriteActionConstraints() {
		if(writeActionConstraints == null) {
			writeActionConstraints = new GridBagConstraints();
			writeActionConstraints.gridx = 1;
			writeActionConstraints.gridy = 2;
			writeActionConstraints.anchor = GridBagConstraints.NORTHWEST;
			writeActionConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return writeActionConstraints;
	}
    
	public JComboBox<String> getWriteModeAction() {
		if(writeModeAction == null) {
			writeModeAction = new JComboBox<>();
			Dimension d = writeModeAction.getPreferredSize();
			d.width = 200;
			writeModeAction.setPreferredSize(d);
			writeModeAction.addItem("Esfaqueador");
			writeModeAction.addItem("Estrangulador");
			writeModeAction.addItem("Envenenador");
			writeModeAction.addItem("Aptidão com Explosivos");
			writeModeAction.addItem("Manipulador");
			writeModeAction.addItem("Torturador");
			writeModeAction.addItem("Outros");
		}
		return writeModeAction;
	}

	public GridBagConstraints getWriteModeActionConstraints() {
		if(writeModeActionConstraints == null) {
			writeModeActionConstraints = new GridBagConstraints();
			writeModeActionConstraints.gridx = 1;
			writeModeActionConstraints.gridy = 5;
			writeModeActionConstraints.anchor = GridBagConstraints.NORTHWEST;
			writeModeActionConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return writeModeActionConstraints;
	}

	public JComboBox<String> getWriteStatus() {
		if(writeStatus == null) {
			writeStatus = new JComboBox<>();
			Dimension d = writeStatus.getPreferredSize();
			d.width = 200;
			writeStatus.setPreferredSize(d);
			writeStatus.addItem("Solto");
			writeStatus.addItem("Foragido");
			writeStatus.addItem("Preso");
		}
		return writeStatus;
	}

	public GridBagConstraints getWriteStatusConstraints() {
		if(writeStatusConstraints == null) {
			writeStatusConstraints = new GridBagConstraints();
			writeStatusConstraints.gridx = 1;
			writeStatusConstraints.gridy = 3;
			writeStatusConstraints.anchor = GridBagConstraints.NORTHWEST;
			writeStatusConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return writeStatusConstraints;
	}

	public JComboBox<String> getWriteCat() {
		if(writeCat == null) {
			writeCat = new JComboBox<>();
			Dimension d = writeCat.getPreferredSize();
			d.width = 200;
			writeCat.setPreferredSize(d);
			writeCat.addItem("Terrorista");
			writeCat.addItem("Ladrão");
			writeCat.addItem("Assasino");
			writeCat.addItem("Traficante");
		}
		return writeCat;
	}

	public GridBagConstraints getWriteCatContraints() {
		if(writeCatContraints == null) {
			writeCatContraints = new GridBagConstraints();
			writeCatContraints.gridx = 1;
			writeCatContraints.gridy = 4;
			writeCatContraints.anchor = GridBagConstraints.NORTHWEST;
			writeCatContraints.insets = new Insets(5, 5, 5, 5);
		}
		return writeCatContraints;
	}

	public JTextArea getWriteFisico() {
		if(writeFisico == null) {
			writeFisico = new JTextArea(5, 20);
			writeFisico.setLineWrap(true);
		}
		return writeFisico;
	}

	public GridBagConstraints getWriteFisicoConstraints() {
		if(writeFisicoConstraints == null) {
			writeFisicoConstraints = new GridBagConstraints();
			writeFisicoConstraints.gridx = 2;
			writeFisicoConstraints.gridy = 1;
			writeFisicoConstraints.gridheight = 4;
			writeFisicoConstraints.anchor = GridBagConstraints.NORTHWEST;
			writeFisicoConstraints.insets = new Insets(5, 60, 5, 5);
		}
		return writeFisicoConstraints;
	}

	public JTextArea getWriteObs() {
		if(writeObs == null) {
			writeObs = new JTextArea(5, 20);
			writeObs.setLineWrap(true);
		}
		return writeObs;
	}

	public GridBagConstraints getWriteObsConstraints() {
		if(writeObsConstraints == null) {
			writeObsConstraints = new GridBagConstraints();
			writeObsConstraints.gridx = 2;
			writeObsConstraints.gridy = 5;
			writeObsConstraints.gridheight = 4;
			writeObsConstraints.anchor = GridBagConstraints.NORTHWEST;
			writeObsConstraints.insets = new Insets(5, 60, 5, 5);
		}
		return writeObsConstraints;
	}

	public JScrollPane getFisicoScrollPane() {
		if(fisicoScrollPane == null) {
			fisicoScrollPane = new JScrollPane(getWriteFisico());
			fisicoScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
		}
		return fisicoScrollPane;
	}

	public JScrollPane getObsScrollPane() {
		if(obsScrollPane == null) {
			obsScrollPane = new JScrollPane(getWriteObs());
			obsScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
		}
		return obsScrollPane;
	}

	public Vilao getVilain() {
		Vilao vilao = null ;
		vilao = new Vilao();
		vilao.setNome(getWriteName().getText());
		vilao.setApelido(getWriteNick().getText());
		vilao.setCaracteristicaFisica(getWriteFisico().getText());
		vilao.setCategoriaCriminal(getWriteCat().getSelectedItem().toString());
		vilao.setModoAcao(getWriteModeAction().getSelectedItem().toString());
		vilao.setLocalAcao(getWriteAction().getText());
		vilao.setStatus(getWriteStatus().getSelectedItem().toString());
		vilao.setObservacao(getWriteObs().getText());
		
		return vilao;
	}
	
	private void loadVilao(){
		getWriteName().setText(vilao.getNome());
		getWriteNick().setText(vilao.getApelido());
		getWriteFisico().setText(vilao.getCaracteristicaFisica());
		getWriteCat().setSelectedItem(vilao.getCategoriaCriminal());
		getWriteModeAction().setSelectedItem(vilao.getModoAcao());
		getWriteAction().setText(vilao.getLocalAcao());
		getWriteStatus().setSelectedItem(vilao.getStatus());
		getWriteObs().setText(vilao.getObservacao());
	}
	
	public boolean checkEmpty(){
		if(getWriteName().getText().equals("")){
			return false;
		} 
		return true;
	}
	
	public void setTextEmpty() {
		getWriteName().setText("");
		getWriteNick().setText("");
		getWriteFisico().setText("");
		getWriteAction().setText("");
		getWriteObs().setText("");
	}
}
