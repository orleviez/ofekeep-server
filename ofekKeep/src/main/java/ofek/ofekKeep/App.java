package ofek.ofekKeep;

import java.util.UUID;

import entities.Note;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
    	UUID id = UUID.randomUUID();
//    	Note note = new Note(id, "test", "test", "Elhen15", Utilities.NoteType.text);
    	Note note = null;
    	db.handler.insertNote(note);
        System.out.println( System.getProperty("user.name"));
    }
}
