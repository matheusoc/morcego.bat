package model;

public class Usuario {
	
	private String login;
	
	private String senha;
	
	private String nome;

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
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getLogin()+"/n");
		sb.append(getSenha()+"/n");
		sb.append(getNome()+"/n");
		return sb.toString();
	}
	
}
