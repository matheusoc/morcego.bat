package controller;

import model.Vilao;

public abstract class CadastroControl {
	
	public static boolean cadastrarVilao(Vilao vilao) {
		
		SQLiteJDBC sqLiteJDBC = new SQLiteJDBC();
		boolean state = sqLiteJDBC.saveVilao(vilao);
		return state;
		
	}

}
