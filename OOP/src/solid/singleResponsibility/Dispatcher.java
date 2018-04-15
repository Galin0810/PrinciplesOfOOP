package solid.singleResponsibility;

public class Dispatcher {
    public static void main(String[] args) {
        Media media = new AudioMedia();
        media.setName("Ecstasy");
        media.setDuration(100);
        media.writeTo(new FileWriter());
        media.printInfo();
    }
}
