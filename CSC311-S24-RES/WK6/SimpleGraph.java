import java.util.*;

public class SimpleGraph {
    private Map<Integer, List<Integer>> adjList;

    public SimpleGraph() {
        adjList = new HashMap<Integer,List<Integer>>();
    }

    // Method to add a vertex
    public void addVertex(int vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<Integer>());
    }

    // Method to add an edge
    public void addEdge(int v1, int v2) {
        adjList.get(v1).add(v2);
        adjList.get(v2).add(v1); // Omit this for a directed graph
    }

    // Method to get the adjacency list
    public List<Integer> getAdjVertices(int vertex) {
        return adjList.get(vertex);
    }

    // Method to display the graph
    public void printGraph() {
        for (int vertex : adjList.keySet()) {
            System.out.println("Vertex " + vertex + " is connected to " + adjList.get(vertex));
        }
    }
}
