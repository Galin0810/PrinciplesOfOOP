package solid.liskovSubstitution;

public class DevilLine  extends Anime{
    private int numberOfSeries ;
    private int year ;
    DevilLine (int numberOfSeries, int year){
        this.numberOfSeries = numberOfSeries;
        this.year = year;
    }
    @Override
    String genre() {
        return "Horror, mysticism";
    }

    @Override
    double rating(double n) {
        return n*(Math.random())/2;
    }

    @Override
    public String toString() {
        return "DevilLine : " +
                "number Of Series = " + numberOfSeries +
                ", year = " + year;
    }
}
