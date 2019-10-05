package baitaptuan4;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.google.gson.Gson;
import com.mongodb.client.FindIterable;

public class ModelBook {
	
	Config config = new Config(); 
	Gson g = new Gson();
	FindIterable<Document> findIterable;
	public static List<Book> books = new ArrayList<Book>();
	
	public List<Book> getAllBookSuppliers(){
		findIterable = config.collection.find(new Document());
		System.out.println(findIterable);
		for(Document doc: findIterable) {
			Book b = g.fromJson(doc.toJson().toString(), Book.class);
			books.add(b);
		}
		return books;
	}
}
