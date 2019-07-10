package br.com.caelum.vraptor.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.AlunoDAO;
import br.com.caelum.vraptor.entity.Aluno;
import br.com.caelum.vraptor.entity.Cultura;
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
		result.include("aluno", new Aluno("2","Aluno 02"));
	}

	@Override
	public void add(Aluno aluno) {
        dao.add(aluno);
        result.redirectTo(AlunoController.class).list();
	}

	@Override
	public void edit(String id) {
    	System.out.println("Id:" + id);
    	Aluno aluno = dao.getItem(id);
    	result.include("aluno",aluno);
	}

	@Override
	public void update(Aluno aluno) {
    	System.out.println(aluno.toString());
    	dao.update(aluno);
    	result.redirectTo(AlunoController.class).list();
	}

	@Override
	public void delete(String id) {
		System.out.println("Delete Aluno:" + id);
		dao.delete(id);
		//result.of(this).list();
		result.redirectTo(AlunoController.class).list();
	}

}
