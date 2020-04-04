import java.util.HashMap;

public class MovieLibrary {
    private HashMap<String, Movie> movies = new HashMap<String, Movie>();

    public MovieLibrary() {

        movies.put("F001", new Movie("You've Got Mail", "regular"));
        movies.put("F002", new Movie("Matrix", "regular"));
        movies.put("F003", new Movie("Cars", "childrens"));
        movies.put("F004", new Movie("Fast & Furious X", "new"));
    }

    public HashMap<String, Movie> getMovies() {
        return movies;
    }
}
