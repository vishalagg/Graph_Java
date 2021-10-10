package TopologicalOrder.ShortestPath;

import java.util.ArrayList;
import java.util.List;

public class Index {

    public static void main(String[] args) {

        List<Vertex> graph = new ArrayList<>();

        Vertex vertex0 = new Vertex(100);
        Vertex vertex1 = new Vertex(101);
        Vertex vertex2 = new Vertex(102);
        Vertex vertex3 = new Vertex(103);
        Vertex vertex4 = new Vertex(104);

        vertex0.addNeighbour(new Edge(vertex0, vertex1, 10));
        vertex0.addNeighbour(new Edge(vertex0, vertex2, 5));
        vertex2.addNeighbour(new Edge(vertex2, vertex1, 4));
        vertex2.addNeighbour(new Edge(vertex2, vertex3, 5));
        vertex1.addNeighbour(new Edge(vertex1, vertex3, 3));
        vertex3.addNeighbour(new Edge(vertex3, vertex4, 10));

        graph.add(vertex0);
        graph.add(vertex1);
        graph.add(vertex2);
        graph.add(vertex3);
        graph.add(vertex4);

        ShortestPath shortestPath = new ShortestPath(graph);
        shortestPath.compute();

        for (Vertex vertex: graph) {
            System.out.println(vertex.getData() + "  " + vertex.getMinDistance() + " <--- "
                    + (vertex.getPredecessor() != null ?vertex.getPredecessor().getData() : vertex.getPredecessor()));
        }

    }
}
