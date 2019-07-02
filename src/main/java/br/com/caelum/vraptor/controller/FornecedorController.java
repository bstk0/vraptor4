package br.com.caelum.vraptor.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.FornecedorDAO;
import br.com.caelum.vraptor.entity.Fornecedor;
import br.com.dbengine.vraptor.interfaces.ControllerInterface;

@Controller
public class FornecedorController implements ControllerInterface<Fornecedor> {

	@Inject
    private FornecedorDAO dao;
	
	@Inject
    private Result result;
	
    public void form() { }
	
    //@Path("/")
    public void view(Long id) {
    	//String text = dao.getList();
    	//dao.connectionTest();
    	result.include("fornecedor", new Fornecedor("3","Fornecedor 03"));
  	
    } 
    
    public void add(Fornecedor fornecedor) {
        dao.add(fornecedor);
        result.redirectTo(FornecedorController.class).list();
    }
    
    
    public List<Fornecedor> list() {
		return dao.getList();
	}
	
    public void edit(String id) {
    	System.out.println("Id:" + id);
    	Fornecedor fornecedor = dao.getItem(id);
    	result.include("fornecedor",fornecedor);
    }
    
    public void delete(String id) {
    	System.out.println("Controller - delete.id:" + id);
    	dao.delete(id);
    	result.redirectTo(FornecedorController.class).list();
    }

	@Override
	public void getJSON() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Fornecedor fornecedor) {
    	System.out.println(fornecedor.toString());
    	dao.update(fornecedor);
    	result.redirectTo(FornecedorController.class).list();
	}

}
