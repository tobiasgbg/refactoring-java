public class ChildrensMovie extends Movie {

    public ChildrensMovie(String title)
    {
        super(title);
    }

    public double getAmount(int days)
    {
        double amount = 1.5;
        if (days > 3) {
          amount = ((days - 3) * 1.5) + amount;
        }

        return amount;
    }

    
    public double getFrequentEnterPoints(int days)
    {
        double frequentEnterPoints = 1;

        return frequentEnterPoints;
    }
}
