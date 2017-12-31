package ofek.ofekKeep;

import java.util.UUID;

import db.DBhandler;
import entities.Note;
import entities.NoteType;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
    	UUID id = UUID.randomUUID();
    	Note note = new Note(id, "test", "test", "Elhen15", NoteType.text);
//    	Note note = null;
    	DBhandler dBhandler = new DBhandler();
    	dBhandler.insertNote(note);
    	System.out.println( System.getProperty("user.name"));
    }
}
