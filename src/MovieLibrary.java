import java.util.HashMap;

public abstract class MovieLibrary {
    public HashMap<String, Movie> movies = new HashMap<String, Movie>();

    public MovieLibrary() {
    }

    public HashMap<String, Movie> getMovies() {
        return movies;
    }

    protected abstract Movie createMovie(String name, String type);
}
