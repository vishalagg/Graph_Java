package BredthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public void bfs (Vertex root) {

        Queue<Vertex> queue =  new LinkedList<>();
        root.setVisited(true);
        queue.add(root);

        while (!queue.isEmpty()) {
            Vertex vertex = queue.poll();
            System.out.println(vertex.getData());

            for  (Vertex v: vertex.getNeighbours()) {
                if (!v.isVisited())  {
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }
}
