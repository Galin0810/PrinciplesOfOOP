package graphTest;
public class Edge {
    private static final int DEFAULT_WEIGHT = 1;

    Vertex v1, v2;
    int weight;

    public Edge(Vertex v1, Vertex v2) {
        this(v1, v2, DEFAULT_WEIGHT);
    }

    public Edge(Vertex v1, Vertex v2, int weight) {
        super();
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    public String toString() {
        String edge = "";
        edge += v1.getLabel();
        edge += " - ";
        edge += v2.getLabel();
        return edge;
    }
}