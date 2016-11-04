package controller;

import java.sql.*;
import java.util.ArrayList;

import model.Administrador;
import model.Comum;
import model.Usuario;

public class SQLiteJDBC {
	
	public static ArrayList<Usuario> getUsursDB() {
	
		Connection c = null;
	    Statement stmt = null;
	    ArrayList<Usuario> usuarios = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:morcego.db");
	      c.setAutoCommit(false);
	      System.out.println("Opened database successfully");
	
	      stmt = c.createStatement();
	      c.commit();
	      
	      ResultSet rs = stmt.executeQuery( "SELECT * FROM USERS;" );
	      usuarios = new ArrayList<>();
	      while ( rs.next() ) {
	         String login = rs.getString("LOGIN");
	         String name = rs.getString("NOME");
	         String senha  = rs.getString("SENHA");
	         int  acesso = rs.getInt("ACESSO");
	         
	         if(acesso == Administrador.NIVELACESSO) {
	        	 Administrador adm = new Administrador();
	        	 adm.setLogin(login);
	        	 adm.setNome(name);
	        	 adm.setSenha(senha);
	        	 usuarios.add(adm);
	         } else if(acesso == Comum.NIVELACESSO) {
	        	 Comum comum = new Comum();
	        	 comum.setLogin(login);
	        	 comum.setNome(name);
	        	 comum.setSenha(senha);
	        	 usuarios.add(comum);
	         }
	       
	      }
	      rs.close();
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Operation done successfully");
	    return usuarios;
  }
	
	

}
