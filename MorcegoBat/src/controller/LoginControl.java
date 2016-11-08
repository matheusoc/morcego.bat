package controller;

import java.util.ArrayList;

import model.Usuario;

public abstract class LoginControl {
	
	 public static Usuario checkLogin(String login, String password){
		 
		 SQLiteJDBC sql = new SQLiteJDBC();
		 ArrayList<Usuario> users = sql.getUsursDB();
		 
		 for(Usuario user : users) {
			 if(user.getLogin().equals(login) && 
					 user.getSenha().equals(password)) {
				 return user;
			 }
		 }
		 
		 return null;
	 }

}
