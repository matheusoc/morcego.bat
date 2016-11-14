package model;

import controller.CadastroControl;
import controller.SQLiteJDBC;

public class Usuario {
	
	private String login;
	
	private String senha;
	
	private String nome;
	
	public Usuario(){
		
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void cadastrar(Vilao vilao){
		CadastroControl.cadastrarVilao(vilao);
	}
	
	public void edit(Vilao vilao1, Vilao vilao2){
		SQLiteJDBC.editVilain(vilao1, vilao2);
	}
	
	public void delete(String name){
		SQLiteJDBC.deleteVilain(name);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getLogin()+"/n");
		sb.append(getSenha()+"/n");
		sb.append(getNome()+"/n");
		return sb.toString();
	}
	
}
