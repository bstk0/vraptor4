package br.com.caelum.vraptor.entity;

public class Usuario	{
	private	String	login;
	private	String	senha;
	private boolean	admin;
	
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
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	public String getNivel() {
		return "admin";
	}
	
	public Usuario(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}
	public Usuario(String login, String senha, boolean admin) {
		super();
		this.login = login;
		this.senha = senha;
		this.admin = admin;
	}
	
}