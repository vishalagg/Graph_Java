package DepthFirstSearch;

import java.util.Stack;

public class DepthFirstSearch {

    public void dfs(Vertex root) {
        Stack<Vertex> stack = new Stack<>();
        stack.push(root);
        root.setVisited(true);

        while (!stack.isEmpty())  {
            Vertex vertex = stack.pop();
            System.out.println(vertex.getData());

            for (Vertex v:  vertex.getNeighbours()) {
                if (!v.isVisited())  {
                    v.setVisited(true);
                    stack.push(v);
                }
            }
        }
    }

    public void dfsRecursive(Vertex vertex) {
        vertex.setVisited(true);
        System.out.println(vertex.getData());
        for (Vertex v:  vertex.getNeighbours()) {
            if (!v.isVisited()) {
                v.setVisited(true);
                dfsRecursive(v);
            }
        }
    }
}
