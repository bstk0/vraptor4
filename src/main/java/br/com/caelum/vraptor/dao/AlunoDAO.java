package br.com.caelum.vraptor.dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import org.json.simple.JSONObject;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.eq;

import br.com.caelum.vraptor.dbUtil.MongoDBmLab;
import br.com.caelum.vraptor.entity.Aluno;
import br.com.caelum.vraptor.entity.Cultura;
import br.com.dbengine.vraptor.interfaces.DAOInterface;

public class AlunoDAO implements DAOInterface<Aluno> {

	private static MongoDBmLab connDb = new MongoDBmLab();
	private MongoCollection<Document> alunoCollection = connDb.getCollectionList("alunos");

	@Override
	public List<Aluno> getList() {
		MongoCursor<Document> cursor = connDb.getCollection("alunos");
		List<Aluno> list = new ArrayList<Aluno>();
		Aluno aluno;
		try {
			while (cursor.hasNext()) {
				Document doc = cursor.next();
				if (doc.get("_id") != null) {
					System.out.println("AlunoDAO.getList - ID " + doc.get("_id") + ", " + doc.get("nome"));
					aluno = new Aluno(doc.get("_id").toString(), doc.get("nome").toString());
					list.add(aluno);
				}
			}
		} finally {
			cursor.close();
		}
		// Since this is an example, we'll clean up after ourselves.
		// songs.drop();

		return list;
	}

	@Override
	public void add(Aluno obj) {
		alunoCollection.insertOne(new Document("nome", obj.getNome()));
	}

	@Override
	public void update(Aluno aluno) {
		try {
	        JSONObject jsonObject = alunoToJSON(aluno);
	        String inputJson = jsonObject.toString();
	        Document inpDoc = Document.parse(inputJson);
	        String alunoId = aluno.get_id();
	        //alunoCollection.updateOne(new Document("_id", new ObjectId(alunoId)), new Document(inpDoc));
	        alunoCollection.replaceOne(new Document("_id", new ObjectId(alunoId)), new Document(inpDoc));
	    } catch (Exception e) {
	        System.out.println("Mongo Deletion operation failed");
	        e.printStackTrace();
	    }

	}

	@Override
	public Aluno getItem(String id) {
		Document myDoc = alunoCollection.find(new Document("_id", new ObjectId(id))).first();
		System.out.println(myDoc.toJson());
		return new Aluno(myDoc.get("_id").toString(), myDoc.get("nome").toString());
	}

	@Override
	public String getCount() {
		return String.valueOf(connDb.getCount("alunos"));
	}

	@Override
	public String delete(String id) {
		alunoCollection.deleteOne(new Document("_id", new ObjectId(id)));
		System.out.println(">AlunoDAO.delete:" + id);
		return "ok";
	}
	
	/**
	 * Retorna JSON SEM ID
	 * @param aluno
	 * @return
	 */
	private JSONObject alunoToJSON(Aluno aluno) {
		JSONObject snuttgly = new JSONObject();
		//snuttgly.put("_id", aluno.get_id());
		snuttgly.put("nome", aluno.getNome() );
		//snuttgly.put("NovaColuna", "They are the best");
		return snuttgly;
	}

}
