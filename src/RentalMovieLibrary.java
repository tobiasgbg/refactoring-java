public class RentalMovieLibrary extends MovieLibrary {
    private static RentalMovieLibrary instance;

    private RentalMovieLibrary() {

        super();
    }

    public static RentalMovieLibrary getInstance()
    {
        if (instance == null)
        {
            instance = new RentalMovieLibrary();
        }
        return instance;
    }
}
