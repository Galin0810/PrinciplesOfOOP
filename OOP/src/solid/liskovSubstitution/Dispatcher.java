package solid.liskovSubstitution;

public class Dispatcher {
    public static void printInfo(Anime anime){
        System.out.println(anime +" It`s anime of genre: "+ anime.genre());
    }
    public static void main(String[] args) {
        ReLife reLife = new ReLife(13,2018);
        DevilLine devilLine = new DevilLine(12,2018);
        printInfo(reLife);
        System.out.println("Rating = "+reLife.rating(3));

        printInfo(devilLine);
        System.out.println("Rating = "+devilLine.rating(5));

    }
}
