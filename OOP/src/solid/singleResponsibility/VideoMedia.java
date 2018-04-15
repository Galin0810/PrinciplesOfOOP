package solid.singleResponsibility;

public class VideoMedia extends Media {
    @Override
    void printInfo() {
        System.out.println("This is a video / Name is: "+ getName()+ " it`s duration is: "+ getDuration());
    }
}
