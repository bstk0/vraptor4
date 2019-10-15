package br.com.dbengine.test.controller;

import static br.com.caelum.vraptor.view.Results.json;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

//import org.apache.shiro.authz.annotation.RequiresAuthentication;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
//import br.com.caelum.vraptor.security.annotation.Secured;
import br.com.dbengine.test.entity.AmostraEntity;

//@Secured
@Controller
public class TestController {
	
	@Inject
    private Result result;

	//@RequiresAuthentication
	@Get("/test/apenasLogados")
	public void apenasLogados() {
		
	}
	
	@Get("/test/buscaAmostrasDaArea")
    //public void buscaAmostrasDaArea(Long idArea){
	public void buscaAmostrasDaArea(int idArea) {
		// AmostraDao amostraDao = DaoFactory.amostraDaoInstance();
		// List<AmostraEntity> amostras = amostraDao.findByIdArea(idArea);
		List<AmostraEntity> amostras = new ArrayList<AmostraEntity>();

		switch (idArea) {
		case 1:
			// code block
			amostras.add(new AmostraEntity("1", "Amostra 1"));
			amostras.add(new AmostraEntity("1.1", "Amostra 1.1"));
			break;
		case 2:
			// code block
			amostras.add(new AmostraEntity("2", "Amostra 2"));
			amostras.add(new AmostraEntity("2.1", "Amostra 2.1"));

			break;
		default:
			// code block
			amostras.add(new AmostraEntity("10", "Amostra DEFAULT 10"));
			amostras.add(new AmostraEntity("100", "Amostra DEFAULT 100"));

		}
		result.use(json()).withoutRoot().from(amostras).serialize();
	}
	
	public void formselects() {
		
	}
}
