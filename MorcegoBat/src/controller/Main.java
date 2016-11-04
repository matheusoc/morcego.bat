package controller;

import java.util.ArrayList;

import model.Usuario;
import view.login.LoginFrame;

public class Main {

	public static void main(String[] args) {
		ArrayList<Usuario> user = SQLiteJDBC.getUsursDB();
		for(Usuario u : user) {
			System.out.println(u.toString());
		}
		new LoginFrame();

	}

}
