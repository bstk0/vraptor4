package br.com.caelum.vraptor.entity;

public class Aluno {
	private String _id;
	private String nome;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Aluno(String _id, String nome) {
		super();
		this._id = _id;
		this.nome = nome;
	}
	
	

}
