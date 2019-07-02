package br.com.dbengine.vraptor.interfaces;

import java.util.List;

import br.com.caelum.vraptor.entity.Cultura;

public interface ControllerInterface<E> {

	void form();

	List<E> list();

	void getJSON();

	void view(Long id);

	void add(E obj);

	void edit(String id);

	void update(E obj);

	void delete(String id);

}