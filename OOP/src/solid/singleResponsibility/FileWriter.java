package solid.singleResponsibility;

public class FileWriter implements IWriter {
    @Override
    public void saveTo(String fileName) {
        System.out.println("save this file to file on Disk");
    }
}
