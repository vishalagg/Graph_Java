package TopologicalOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Index {

    public static void main(String[] args) {

        List<Vertex> graph = new ArrayList<>();

        //cluster 1:
        graph.add(new Vertex(1));
        graph.add(new Vertex(2));
        graph.add(new Vertex(3));
        graph.add(new Vertex(4));
        graph.add(new Vertex(5));
        graph.add(new Vertex(0));

        //cluster 2:
        graph.add(new Vertex(10));
        graph.add(new Vertex(20));
        graph.add(new Vertex(30));

        //cluster 3:
        graph.add(new Vertex(100));
        graph.add(new Vertex(200));
        graph.add(new Vertex(300));

        graph.get(0).addNeighbour(graph.get(1));
        graph.get(0).addNeighbour(graph.get(2));
        graph.get(1).addNeighbour(graph.get(3));
        graph.get(2).addNeighbour(graph.get(4));
        graph.get(3).addNeighbour(graph.get(4));
        graph.get(5).addNeighbour(graph.get(0));


        graph.get(6).addNeighbour(graph.get(7));
        graph.get(6).addNeighbour(graph.get(8));
        graph.get(7).addNeighbour(graph.get(8));

        graph.get(9).addNeighbour(graph.get(10));
        graph.get(10).addNeighbour(graph.get(11));

        TopologicalOrder topologicalOrder = new TopologicalOrder();
        Stack<Vertex> stack = topologicalOrder.getTopologicalOrder(graph);

        while (!stack.isEmpty())
            System.out.println(stack.pop().getData());
    }
}
