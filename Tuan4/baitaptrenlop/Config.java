package baitaptrenlop;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Config {

	MongoClientURI uri = new MongoClientURI(
			"mongodb+srv://duyhieu:123456789aa@cluster0-g51qr.gcp.mongodb.net/test?retryWrites=true&w=majority");

	MongoClient mongoClient = new MongoClient(uri);
	MongoDatabase database = mongoClient.getDatabase("democombobox");
	MongoCollection<Document> collection = database.getCollection("Employee");
	FindIterable<Document> findIterable = collection.find(new Document());

}
