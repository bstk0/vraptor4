package br.com.caelum.vraptor.controller;

import br.com.caelum.vraptor.entity.Cultura;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.CulturaDAO;
import static br.com.caelum.vraptor.view.Results.*;


@Controller
public class CulturaController {
	
		@Inject
	    private CulturaDAO dao;
		
		@Inject
	    private Result result;

	    public void form() { }


	    public List<Cultura> list() {
			return dao.getList();
		}

		//return JSON
	    public void culturas() {
	       List<Cultura> culturas = dao.getList();
	       result.use(json()).from(culturas).serialize();    
	    }

	    //@Path("/")
	    public void view(Long id) {
	    	//String text = dao.getList();
	    	//return new Cultura("02","Cultura 02");
	    	result.include("cultura", new Cultura(2,"Cultura 02"));
	    }
	
	    public void add(Cultura cultura) {
	        dao.add(cultura);
	        result.redirectTo(CulturaController.class).list();
	    }
	    
	    //@Path("cultura/edit/{cultura.id}")
	    public void edit(String id) {
	    	System.out.println("Id:" + id);
	    	Cultura cultura = dao.getItem(id);
	    	result.include("cultura",cultura);
        }
}
