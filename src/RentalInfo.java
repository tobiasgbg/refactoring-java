import java.util.HashMap;

public class RentalInfo {

  public String statement(Customer customer) {

    MovieLibrary movieLibrary = RentalMovieLibrary.getInstance();

    HashMap<String, Movie> movies = movieLibrary.getMovies();

    double totalAmount = 0;
    int frequentEnterPoints = 0;
    String result = "Rental Record for " + customer.getName() + "\n";
    for (MovieRental r : customer.getRentals()) {
      double thisAmount = 0;

      Movie movie = movies.get(r.getMovieId());
      // determine amount for each movie
      thisAmount = movie.getAmount(r.getDays());
      //add frequent enter points
      frequentEnterPoints += movie.getFrequentEnterPoints(r.getDays());
  
      //print figures for this rental
      result += "\t" + movies.get(r.getMovieId()).getTitle() + "\t" + thisAmount + "\n";
      totalAmount = totalAmount + thisAmount;
    }
    // add footer lines
    result += "Amount owed is " + totalAmount + "\n";
    result += "You earned " + frequentEnterPoints + " frequent points\n";

    return result;
  }
}
