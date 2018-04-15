package solid.singleResponsibility;

public class GoogleFIleWriter implements IWriter {
    @Override
    public void saveTo(String fileName) {
        System.out.println("save this file to Google Drive");
    }
}
