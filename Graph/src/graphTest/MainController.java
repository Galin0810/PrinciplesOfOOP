package graphTest;
public class MainController {
    public static void main(String[] args) {
        Vertex ivf = new Vertex("Ivano-Frankivsk");
        Vertex lv = new Vertex("Lviv");
        Vertex hk = new Vertex("Hokkadu");
        Vertex kt = new Vertex("Kanto");


        Edge e1 = new Edge(ivf, lv);
        Edge e2 = new Edge(lv, kt);
        Edge e3 = new Edge(kt, hk);
        Edge e4 = new Edge(hk, ivf);


        Graph firstGraph = new Graph();

        firstGraph.addVertex(ivf);
        firstGraph.addVertex(lv);
        firstGraph.addVertex(hk);
        firstGraph.addVertex(kt);


        firstGraph.addEdge(e1);
        firstGraph.addEdge(e2);
        firstGraph.addEdge(e3);
        firstGraph.addEdge(e4);


        System.out.println(firstGraph.getAdjList());


    }
}
