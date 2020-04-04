public class RentalMovieLibrary extends MovieLibrary {
    private static RentalMovieLibrary instance;

    private RentalMovieLibrary() {
        
        movies.put("F001", createMovie("You've Got Mail", "regular"));
        movies.put("F002", createMovie("Matrix", "regular"));
        movies.put("F003", createMovie("Cars", "childrens"));
        movies.put("F004", createMovie("Fast & Furious X", "new"));
    }

    public static RentalMovieLibrary getInstance()
    {
        if (instance == null)
        {
            instance = new RentalMovieLibrary();
        }
        return instance;
    }

    protected Movie createMovie(String title, String type)
    {
        Movie movie = null;
        if (type == "regular")
            movie = new RegularMovie(title);
        else if (type == "childrens")
            movie = new ChildrensMovie(title);
        else if (type == "new")
            movie = new NewMovie(title);

        return movie;
    }
}
