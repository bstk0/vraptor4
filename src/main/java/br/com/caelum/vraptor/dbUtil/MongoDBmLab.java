package br.com.caelum.vraptor.dbUtil;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class MongoDBmLab {
	//"mongodb://user:pass@host:port/db"
	// mongodb://<dbuser>:<dbpassword>@ds013221.mlab.com:13221/dbe
	private final String URI = "mongodb://user1:usuario1@ds013221.mlab.com:13221/dbe";
	
	@SuppressWarnings("resource")
	private MongoDatabase getDbConnection() {
		MongoClientURI uri  = new MongoClientURI(URI); 
        MongoClient client = new MongoClient(uri);
        return client.getDatabase(uri.getDatabase());
	}
	
	public MongoCursor<Document> getCollection(String colletionName) {
		MongoCollection<Document> mongolist = this.getDbConnection().getCollection(colletionName);
   	    return mongolist.find().iterator();
	}
	
	public MongoCollection<Document> getCollectionList(String colletionName) {
		 return this.getDbConnection().getCollection(colletionName);
	}

	
	public long getCount(String colletionName) {
		//db.collection.count()
		return this.getDbConnection().getCollection(colletionName).count();
	}

}
