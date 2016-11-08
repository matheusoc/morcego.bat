package controller;

import model.Vilao;
import view.login.LoginFrame;

public class Main {

	public static void main(String[] args) {
		
		new LoginFrame();
		SQLiteJDBC b = new SQLiteJDBC();
		Vilao vilao = new Vilao();
		vilao.setNome("William");
		b.saveVilao(vilao);

	}

}
