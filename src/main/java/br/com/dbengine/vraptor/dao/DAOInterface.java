package br.com.dbengine.vraptor.dao;

import java.io.Serializable;
import java.util.List;

public interface DAOInterface<E> {
	
	public List<E> getList();
	
	public void add(E obj);
	
	public void update(E obj);
	
	public E getItem(String id);
	
	public String getCount();
	
	public String delete(String id);

}
