package controller;

import java.util.ArrayList;

import model.Usuario;

public abstract class LoginControl {
	
	 public static Usuario checkLogin(String login, String password){
		 
		 ArrayList<Usuario> users = SQLiteJDBC.getUsursDB();
		 
		 for(Usuario user : users) {
			 if(user.getLogin().equals(login) && 
					 user.getSenha().equals(password)) {
				 return user;
			 }
		 }
		 
		 return null;
	 }

}
