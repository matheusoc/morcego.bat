package controller;

import java.sql.*;
import java.util.ArrayList;

import model.Administrador;
import model.Comum;
import model.Usuario;
import model.Vilao;

public class SQLiteJDBC {
	
	private static final String sql = "INSERT INTO VILAO " +
			"(_id, NOME,APELIDO,CARACTERISTICA,MODOACAO,STATUS,CATEGORIA,LOCALACAO,OBSERVACAO) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"; 
	
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
	
	public static boolean saveVilao(Vilao vilao){
		
		Connection c = null;
		PreparedStatement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:morcego.db");
	      c.setAutoCommit(false);
	      
	      stmt = c.prepareStatement(sql);
	      
	      stmt.setString(2, vilao.getNome());
	      stmt.setString(3, vilao.getApelido());
	      stmt.setString(4, vilao.getCaracteristicaFisica());
	      stmt.setString(5, vilao.getModoAcao());
	      stmt.setString(6, vilao.getStatus());
	      stmt.setString(7, vilao.getCategoriaCriminal());
	      stmt.setString(8, vilao.getLocalAcao());
	      stmt.setString(9, vilao.getObservacao());
	      
	      stmt.executeUpdate();
	      c.commit();
	      stmt.close();
	      c.close();
	      return true;
	    } catch(SQLException | ClassNotFoundException e) {
	    	e.printStackTrace();
	    }
	    return false;
	}
	
	public static ArrayList<Vilao> getVilaosDB() {
		
		Connection c = null;
	    Statement stmt = null;
	    ArrayList<Vilao> vilaos = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:morcego.db");
	      c.setAutoCommit(false);
	      System.out.println("Opened database successfully");
	
	      stmt = c.createStatement();
	      c.commit();
	      
	      ResultSet rs = stmt.executeQuery( "SELECT * FROM VILAO;" );
	      vilaos = new ArrayList<>();
	      while ( rs.next() ) {
	    	  
	    	 Vilao vilao = new Vilao();
	    	  
	         vilao.setId(rs.getInt("_id"));
	         vilao.setNome(rs.getString("NOME"));
	         vilao.setApelido(rs.getString("APELIDO")); 
	         vilao.setCaracteristicaFisica(rs.getString("CARACTERISTICA"));
	         vilao.setModoAcao(rs.getString("MODOACAO"));
	         vilao.setStatus(rs.getString("STATUS"));
	         vilao.setCategoriaCriminal(rs.getString("CATEGORIA"));
	         vilao.setLocalAcao(rs.getString("LOCALACAO"));
	         vilao.setObservacao(rs.getString("OBSERVACAO"));
	         
	         vilaos.add(vilao);
	      }
	      rs.close();
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Operation done successfully");
	    return vilaos;
	}
	
	public static void deleteVilain(String name){
		Connection c = null;
		PreparedStatement stmt = null;
	    try {
		    Class.forName("org.sqlite.JDBC");
		    c = DriverManager.getConnection("jdbc:sqlite:morcego.db");
		    c.setAutoCommit(false);
		    System.out.println("Opened database successfully");
		  
		    String sql = "DELETE from VILAO where NOME = ?;";
		    stmt = c.prepareStatement(sql);
		    
		    stmt.setString(1, name);
		    
		    stmt.executeUpdate();
		    c.commit();
	    }catch ( Exception e ) {
		    System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		    System.exit(0);
	    }
	    System.out.println("Operation done successfully");
	}
	
	public static void editVilain(Vilao vilao1, Vilao vilao2){
		deleteVilain(vilao1.getNome());
		saveVilao(vilao2);
	}

}
