package br.com.caelum.vraptor.entity;

public class Fornecedor {
	
	private String id_fornec;
	private String nome;
	
	public Fornecedor(String id_fornec, String nome) {
		super();
		this.id_fornec = id_fornec;
		this.nome = nome;
	}
	public String getId_fornec() {
		return id_fornec;
	}
	public void setId_fornec(String id_fornec) {
		this.id_fornec = id_fornec;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
