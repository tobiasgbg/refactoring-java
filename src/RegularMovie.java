public class RegularMovie extends Movie {

    public RegularMovie(String title)
    {
        super(title);
    }

    public double getAmount(int days)
    {
        double amount = 2;
        if (days > 2) {
          amount = ((days - 2) * 1.5) + amount;
        }

        return amount;
    }

    public double getFrequentEnterPoints(int days)
    {
        double frequentEnterPoints = 1;

        return frequentEnterPoints;
    }
}
