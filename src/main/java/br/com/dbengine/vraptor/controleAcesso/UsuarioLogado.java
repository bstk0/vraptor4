package br.com.dbengine.vraptor.controleAcesso;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

import br.com.caelum.vraptor.entity.Usuario;

@SessionScoped
public class UsuarioLogado implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	private Usuario usuario;

	public void loga(Usuario usuario) {
		this.usuario = usuario;
	}

	public boolean isLogado() {
		return this.usuario != null;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void desloga() {
		this.usuario = null;
	}
	
	public String getNivel() {
		return this.usuario.getNivel();
	}
	
}
