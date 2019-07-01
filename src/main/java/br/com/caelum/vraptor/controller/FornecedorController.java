package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.FornecedorDAO;
import br.com.caelum.vraptor.entity.Fornecedor;

@Controller
public class FornecedorController {

	@Inject
    private FornecedorDAO dao;
	
	@Inject
    private Result result;
	
    //@Path("/")
    public void view(Long id) {
    	//String text = dao.getList();
    	//return new Cultura("02","Cultura 02");
    	dao.connectionTest();
    	result.include("fornecedor", new Fornecedor("3","Fornecedor 03"));
  	
    } 
	
}
