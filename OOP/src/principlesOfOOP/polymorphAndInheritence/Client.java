package principlesOfOOP.polymorphAndInheritence;

public class Client  {
    String name;
    Client(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client: " +
                "name = '" + this.name + '\'' ;
    }
}
