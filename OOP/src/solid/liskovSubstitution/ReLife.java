package solid.liskovSubstitution;

public class ReLife extends Anime{
    private int numberOfSeries ;
    private int year ;
    ReLife (int numberOfSeries, int year){
        this.numberOfSeries = numberOfSeries;
        this.year = year;
    }
    @Override
    String genre() {
        return "Comedy, romantic";
    }

    @Override
    double rating(double n) {
        return n*(Math.random())/2;
    }

    @Override
    public String toString() {
        return "ReLife : " +
                "number Of Series = " + this.numberOfSeries +
                ", year = " + this.year;
    }
}
