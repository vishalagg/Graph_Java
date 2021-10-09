package TopologicalOrder.TopologicalOrdering;

import java.util.List;
import java.util.Stack;

public class TopologicalOrder {

    public Stack<Vertex> getTopologicalOrder(List<Vertex> graph) {

        Stack<Vertex> vertexStack = new Stack<>();
        for (Vertex vertex: graph) {
            if (!vertex.isVisited()) {
                vertex.setVisited(true);
                getTopologicalOrderHelper(vertex, vertexStack);
            }
        }

        return vertexStack;
    }

    private void getTopologicalOrderHelper(Vertex vertex, Stack<Vertex> vertexStack) {

        for (Vertex v: vertex.getNeighbours()) {
            if (!v.isVisited()) {
                v.setVisited(true);
                getTopologicalOrderHelper(v, vertexStack);
            }
        }

        vertexStack.push(vertex);
    }
}
