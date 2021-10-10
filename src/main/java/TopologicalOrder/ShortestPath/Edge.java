package TopologicalOrder.ShortestPath;

public class Edge {

    private Vertex fromVertex;
    private Vertex toVertex;
    private int weight;

    Edge(Vertex fromVertex, Vertex toVertex, int weight) {
        this.fromVertex = fromVertex;
        this.toVertex = toVertex;
        this.weight = weight;
    }

    public Vertex getFromVertex() {
        return fromVertex;
    }

    public Vertex getToVertex() {
        return toVertex;
    }

    public int getWeight() {
        return weight;
    }
}
