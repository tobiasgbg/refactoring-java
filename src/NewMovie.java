public class NewMovie extends Movie {

    public NewMovie(String title)
    {
        super(title);
    }

    public double getAmount(int days)
    {
        double amount = days * 3;

        return amount;
    }

    public double getFrequentEnterPoints(int days)
    {
        double frequentEnterPoints = 1;

        // add bonus for a two day new release rental
        if (days> 2)
            frequentEnterPoints = 2;

        return frequentEnterPoints;
    }
}
