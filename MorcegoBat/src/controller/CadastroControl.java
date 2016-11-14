package controller;

import model.Vilao;

public abstract class CadastroControl {
	
	public static boolean cadastrarVilao(Vilao vilao) {
		
		boolean state = SQLiteJDBC.saveVilao(vilao);
		return state;
		
	}

}
