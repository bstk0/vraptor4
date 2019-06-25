package br.com.caelum.vraptor.entity;

public class Cultura {
    private String _id;
	private Integer codigo;
    private String descricao;
    
	public Cultura(String _id, Integer codigo, String descricao) {
		super();
		this._id = _id;
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Cultura(Integer codigo, String descricao) {
		super();
		this.setCodigo(codigo);
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


}
