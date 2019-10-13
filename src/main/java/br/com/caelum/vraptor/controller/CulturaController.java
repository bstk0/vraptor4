package br.com.caelum.vraptor.controller;

import static br.com.caelum.vraptor.view.Results.json;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.CulturaDAO;
import br.com.caelum.vraptor.entity.Cultura;
import br.com.dbengine.vraptor.annotation.Restrito;
import br.com.dbengine.vraptor.interfaces.ControllerInterface;


@Controller
public class CulturaController implements ControllerInterface<Cultura> {
	
		@Inject
	    private CulturaDAO dao;
		
		@Inject
	    private Result result;

	    /* (non-Javadoc)
		 * @see br.com.caelum.vraptor.controller.ControllerInterface#form()
		 */
	    @Override
		public void form() { }


	    /* (non-Javadoc)
		 * @see br.com.caelum.vraptor.controller.ControllerInterface#list()
		 */
	    @Override
		public List<Cultura> list() {
			return dao.getList();
		}

		//return JSON
	    /* (non-Javadoc)
		 * @see br.com.caelum.vraptor.controller.ControllerInterface#getJSON()
		 */
	    @Override
		public void getJSON() {
	       List<Cultura> culturas = dao.getList();
	       result.use(json()).from(culturas).serialize();    
	    }

	    //@Path("/")
	    /* (non-Javadoc)
		 * @see br.com.caelum.vraptor.controller.ControllerInterface#view(java.lang.Long)
		 */
	    @Override
		public void view(Long id) {
	    	//String text = dao.getList();
	    	//return new Cultura("02","Cultura 02");
	    	result.include("cultura", new Cultura(2,"Cultura 02"));
	    }
	
	    /* (non-Javadoc)
		 * @see br.com.caelum.vraptor.controller.ControllerInterface#add(br.com.caelum.vraptor.entity.Cultura)
		 */
	    @Override
		public void add(Cultura cultura) {
	        dao.add(cultura);
	        result.redirectTo(CulturaController.class).list();
	    }
	    
	    //@Path("cultura/{id}")
	    @Get("cultura/item/{id}")
	    public void getCultura(String id) {
	    	System.out.println("getCultura - id :" + id);
	    	Cultura cultura = dao.getItem(id);
	    	result.use(json()).withoutRoot().from(cultura).serialize();
	    }
	    
	    @Restrito({"admin"})
	    public void ajaxsearch() {
	    	
	    }
	    
	    public void searchwithoutajax() {
	    	
	    }
	    
	    //@Get("cultura/retornoPesquisa/{id}")
	    public void retornoPesquisa(String id) {
	    	System.out.println("retornoPesquisa - id :" + id);
	    	//Cultura cultura = dao.getItem(id);
	    	result.include("pesquisa", id);
	    	List<Cultura> culturaList = new ArrayList<Cultura>(); 
	    	culturaList.add(new Cultura(1,"Codigo 1"));
	    	culturaList.add(new Cultura(2,"Codigo 2"));
	    	result.include("culturaList",culturaList);
	    }
	    
	    //@Path("cultura/edit/{cultura.id}")
	    /* (non-Javadoc)
		 * @see br.com.caelum.vraptor.controller.ControllerInterface#edit(java.lang.String)
		 */
	    @Override
		public void edit(String id) {
	    	System.out.println("Id:" + id);
	    	Cultura cultura = dao.getItem(id);
	    	result.include("cultura",cultura);
        }
	    
	    /* (non-Javadoc)
		 * @see br.com.caelum.vraptor.controller.ControllerInterface#update(br.com.caelum.vraptor.entity.Cultura)
		 */
	    @Override
		public void update(Cultura cultura) {
	    	System.out.println(cultura.toString());
	    	dao.update(cultura);
	    	result.redirectTo(CulturaController.class).list();
	    }
	    
	    /* (non-Javadoc)
		 * @see br.com.caelum.vraptor.controller.ControllerInterface#delete(java.lang.String)
		 */
	    @Override
		public void delete(String id) {
	    	System.out.println("Controller - delete.id:" + id);
	    	dao.delete(id);
	    	result.redirectTo(CulturaController.class).list();
	    }
}
