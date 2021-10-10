package TopologicalOrder.ShortestPath;

import java.util.List;
import java.util.Stack;

public class TopologicalOrder {

    Stack<Vertex> topologicalStack;

    TopologicalOrder() {
        this.topologicalStack = new Stack<>();
    }

    public Stack<Vertex> getTopologicalStack(List<Vertex> graph) {

        for (Vertex vertex: graph)  {
            if (!vertex.isVisited()) {
                vertex.setVisited(true);
                topologicalHelper(vertex);
            }
        }

        return topologicalStack;
    }

    private void topologicalHelper(Vertex vertex) {

        for (Edge edge: vertex.getNeighbours()) {
            if (!edge.getToVertex().isVisited()) {
                edge.getToVertex().setVisited(true);
                topologicalHelper(edge.getToVertex());
            }
        }
        topologicalStack.push(vertex);
    }
}
