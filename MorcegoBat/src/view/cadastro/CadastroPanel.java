package view.cadastro;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.CadastroControl;
import model.Vilao;
import view.components.VilainComponentsPanel;

public class CadastroPanel extends JPanel{

	private static final long serialVersionUID = -1127160331366301227L;
	
	private VilainComponentsPanel componentsPanel;
	private SavePanel savePanel;
	
	public CadastroPanel(){
		setLayout(new BorderLayout());
		add(getComponentsPanel(), BorderLayout.CENTER);
		add(getSavePanel(), BorderLayout.PAGE_END);
	}

	public VilainComponentsPanel getComponentsPanel() {
		if(componentsPanel == null) {
			componentsPanel = new VilainComponentsPanel();
		}
		return componentsPanel;
	}
	
	public SavePanel getSavePanel() {
		if(savePanel == null) {
			savePanel = new SavePanel();
			savePanel.getSaveButton().addActionListener(setSaveLister());
		}
		return savePanel;
	}
	
	public ActionListener setSaveLister(){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Vilao vilao = getComponentsPanel().getVilain();
				if(getComponentsPanel().checkEmpty()){
					CadastroControl.cadastrarVilao(vilao);
					getComponentsPanel().setTextEmpty();
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
				}
				else JOptionPane.showMessageDialog(null, "Obrigatório preencher o campo nome!");
			}
		};
	}
}
