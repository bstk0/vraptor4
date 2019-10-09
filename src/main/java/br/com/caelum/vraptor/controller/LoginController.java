package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.entity.Usuario;
import br.com.caelum.vraptor.validator.I18nMessage;
import br.com.caelum.vraptor.validator.Validator;
import br.com.dbengine.vraptor.controleAcesso.UsuarioLogado;

@Controller
public class LoginController {
	// private RegistroDeUsuarios usuarios;
	private UsuarioLogado logado;
	private Result result;
	private Validator validator;

	@Inject
	//public LoginController(RegistroDeUsuarios usuarios, UsuarioLogado logado, Result result, Validator validator) {
	public LoginController(UsuarioLogado logado, Result result, Validator validator) {
		this.logado = logado;
		this.result = result;
		this.validator = validator;
	}

	@Deprecated
	LoginController() {
	}

	@Get("/login")
	public void formulario() {
	}

	@Post("/login")
	public void login(String login, String senha) {
		//Usuario usuario = usuarios.comLoginESenha(login, senha);
		// if ...
		Usuario usuario = new Usuario("bisterco","1234",true);
		validator.ensure(usuario != null, new I18nMessage("usuario", "login.ou.senha.invalidos"));
		validator.onErrorRedirectTo(this).formulario();
		logado.loga(usuario);
		// ou a página inicial
		//result.redirectTo(LivrosController.class).lista();
		result.redirectTo(IndexController.class).index();
	}

	@Get("/logout")
	public void logout() {
		logado.desloga();
		result.redirectTo(this).formulario();
	}
}
