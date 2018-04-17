package graphTest;
public class Vertex {
    private String unique;

    public Vertex(String unique) {
        super();
        this.unique = unique;
    }

    public String getLabel() {
        return unique;
    }

    public void setLabel(String unique) {
        this.unique = unique;
    }

    public String toString() {
        return unique;
    }

}