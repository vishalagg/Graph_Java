package TopologicalOrder.TopologicalOrdering;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    int data;
    boolean isVisited;
    List<Vertex> neighbours;

    Vertex(int data) {
        this.data = data;
        this.neighbours = new ArrayList<>();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public List<Vertex> getNeighbours() {
        return neighbours;
    }

    public void addNeighbour(Vertex neighbour) {
        this.neighbours.add(neighbour);
    }
}
