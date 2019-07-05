package br.com.caelum.vraptor.dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import br.com.caelum.vraptor.dbUtil.MongoDBmLab;
import br.com.caelum.vraptor.entity.Aluno;
import br.com.dbengine.vraptor.interfaces.DAOInterface;

public class AlunoDAO implements DAOInterface<Aluno> {
	
	private static MongoDBmLab connDb = new MongoDBmLab();

	@Override
	public List<Aluno> getList() {
		// TODO Auto-generated method stub
   	    MongoCursor<Document> cursor = connDb.getCollection("alunos");
   	    List<Aluno> list = new ArrayList<Aluno>();
   	    Aluno aluno; 
	        try {
	            while (cursor.hasNext()) {
	                Document doc = cursor.next();
	                System.out.println(
	                    "ID " + doc.get("_id") + ", " + doc.get("nome"));
	                aluno = new Aluno(doc.get("_id").toString(),doc.get("nome").toString());
	                list.add(aluno);
	            }
	        } finally {
	            cursor.close();
	        }
	        // Since this is an example, we'll clean up after ourselves.
	        //songs.drop();
	
		return list;
	}

	@Override
	public void add(Aluno obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Aluno obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Aluno getItem(String id) {
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

}
