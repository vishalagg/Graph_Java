package TopologicalOrder.ShortestPath;

import java.util.List;
import java.util.Stack;

public class ShortestPath {

    private TopologicalOrder topologicalOrder;
    private Stack<Vertex> topologicalStack;

    ShortestPath(List<Vertex> graph) {
        this.topologicalOrder = new TopologicalOrder();
        graph.get(0).setMinDistance(0); //Source Vertex
        this.topologicalStack = this.topologicalOrder.getTopologicalStack(graph);
    }

    public void compute() {

        while (!topologicalStack.isEmpty()) {
            Vertex vertex = topologicalStack.pop();

            for (Edge edge: vertex.getNeighbours()) {
                Vertex toVertex = edge.getToVertex();

                if (vertex.getMinDistance() + edge.getWeight() < toVertex.getMinDistance()) {
                    toVertex.setMinDistance(vertex.getMinDistance() + edge.getWeight());
                    toVertex.setPredecessor(vertex);
                }
            }
        }
    }
}
