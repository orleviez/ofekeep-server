package db;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import entities.Note;
import entities.User;

public class DBhandler {
	
	private MongoClientURI connectionString = null;
	private MongoClient mongoClient = null;
	private MongoDatabase db = null;
	
	public DBhandler()
	{
		if (db == null) {
			
			connectionString= new  MongoClientURI("mongodb+srv://Admin:Admin@cluster0-9b4qk.mongodb.net/test");
			mongoClient = new MongoClient(connectionString);
			db = mongoClient.getDatabase("test");
		}
	}
	
	public void insertNote(Note note) {
		try {	
			MongoCollection<Document> notesCollection = this.db.getCollection("notes");
			Document document = new Document();
			document.append(Utilities.UUID, note.get_id());
			document.append(Utilities.USER_NAME, note.getUser());
			document.append(Utilities.DESCRIPTION, note.getDescription());
			document.append(Utilities.DATE, note.getDate().toString());
			document.append(Utilities.TITLE, note.getTitle());
			document.append(Utilities.IS_DELETED, note.isDeleted());
			notesCollection.insertOne(document);
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateNote(Note note, Note oldNote) {
		MongoCollection<Document> notesCollection = this.db.getCollection("notes");
		Document document = new Document();
	}
	
	public void removeNote() {
		
	}
	
	public void updateNote() {
		
	}
	
	public ArrayList<Note> getAllNotes(User user){
		
		return null;
	}
}
