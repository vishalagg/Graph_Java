package TopologicalOrder.ShortestPath;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private int data;
    private boolean isVisited;
    private int minDistance; //Minimum distance from source vertex to current vertex
    private Vertex predecessor; //Predecessor Vertex in order to track shortest path
    private List<Edge> neighbours;

    Vertex(int data) {
        this.data = data;
        this.minDistance = Integer.MAX_VALUE;
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

    public int getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(int minDistance) {
        this.minDistance = minDistance;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    public List<Edge> getNeighbours() {
        return neighbours;
    }

    public void addNeighbour(Edge neighbour) {
        this.neighbours.add(neighbour);
    }
}
