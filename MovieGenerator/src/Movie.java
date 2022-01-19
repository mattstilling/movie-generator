import java.util.List;

/**
 * This class stores a movie and any data associated with it.
 * 
 * @author Matt Stilling
 */
public class Movie {
	
	String tconst; // The unique id for the movie
	String title; // The title of the movie
	int year; // The year the movie was released
	int runtime; // The runtime of the movie
	List<String> genres; // The genres associated with the movie
	
	/**
	 * Creates a new instance of a movie with the following data:
	 * 
	 * @param tconst - the unique id for the movie
	 * @param title - the title of the movie
	 * @param year - the year the movie was released
	 * @param runtime - the runtime of the movie in minutes
	 * @param genres - the genres associated with the movie
	 */
	public Movie(String tconst, String title, int year, int runtime, List<String> genres) {
		this.tconst = tconst;
		this.title = title;
		this.year = year;
		this.runtime = runtime;
		this.genres = genres;
	}
	
}
