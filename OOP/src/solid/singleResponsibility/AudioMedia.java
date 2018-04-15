package solid.singleResponsibility;

public class AudioMedia extends Media {
    @Override
    void printInfo() {
        System.out.println("This is a audio / Name is: "+ getName()+ " it`s duration is: "+ getDuration());
    }
}
