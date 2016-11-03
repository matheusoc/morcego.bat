package controller;

import view.login.LoginFrame;

public class Main {

	public static void main(String[] args) {
		SQLiteJDBC.openDB();
		new LoginFrame();

	}

}
