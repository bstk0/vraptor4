package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.AlunoDAO;
import br.com.caelum.vraptor.dao.CulturaDAO;
import br.com.caelum.vraptor.dao.FornecedorDAO;

@Controller
public class IndexController {

	@Inject
    private CulturaDAO dao;
	
	private final Result result;

	/**
	 * @deprecated CDI eyes only
	 */
	protected IndexController() {
		this(null);
	}
	
	@Inject
	public IndexController(Result result) {
		this.result = result;
	}

	@Path("/")
	public void index() {
    	String listCount = dao.getCount();
    	String fornecCount = new FornecedorDAO().getCount();
    	String alunoCount = new AlunoDAO().getCount();
    	result.include("listCount", listCount);
    	result.include("fornecCount", fornecCount);
    	result.include("alunoCount", alunoCount);
		result.include("variable", "VRaptor!");
	}
}