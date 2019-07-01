package br.com.caelum.vraptor.dao;

import java.sql.Connection;
import java.util.List;

import br.com.caelum.vraptor.dbUtil.ElephantSQLClient;
import br.com.caelum.vraptor.dbUtil.RestDBClient;
import br.com.caelum.vraptor.entity.Fornecedor;
import br.com.dbengine.vraptor.dao.DAOInterface;

public class FornecedorDAO implements DAOInterface<Fornecedor> {
	
	private static ElephantSQLClient connDb = new ElephantSQLClient();


	@Override
	public List<Fornecedor> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Fornecedor fornecedor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Fornecedor fornecedor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Fornecedor getItem(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void connectionTest() {
		connDb.testConnection();
	}

}
