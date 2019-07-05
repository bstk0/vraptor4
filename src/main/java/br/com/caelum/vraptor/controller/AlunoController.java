package br.com.caelum.vraptor.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.AlunoDAO;
import br.com.caelum.vraptor.entity.Aluno;
import br.com.dbengine.vraptor.interfaces.ControllerInterface;

@Controller
public class AlunoController implements ControllerInterface<Aluno> {

	@Inject
    private AlunoDAO dao;
	
	@Inject
    private Result result;
	
	@Override
	public void form() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Aluno> list() {
		return dao.getList();
	}

	@Override
	public void getJSON() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void view(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Aluno obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void edit(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Aluno obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
