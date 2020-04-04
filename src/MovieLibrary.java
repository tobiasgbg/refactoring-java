import java.util.HashMap;

public abstract class MovieLibrary {
    private HashMap<String, Movie> movies = new HashMap<String, Movie>();

    public MovieLibrary() {

        movies.put("F001", new RegularMovie("You've Got Mail"));
        movies.put("F002", new RegularMovie("Matrix"));
        movies.put("F003", new ChildrensMovie("Cars"));
        movies.put("F004", new NewMovie("Fast & Furious X"));
    }

    public HashMap<String, Movie> getMovies() {
        return movies;
    }
}
