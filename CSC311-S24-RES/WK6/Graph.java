import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
	Map<String,List<String>> adjList;
	
	public Graph() {
		//initailize the adjacecy list for our graph
		adjList = new HashMap<String, List<String>>();
	}
	
	//Method to add a vertex
	public void addVertex(String vertex) {
		adjList.putIfAbsent(vertex, new ArrayList<String>());
	}
	
	//Method to add an edge
	public void addEdge(String v1, String v2) {
		adjList.get(v1).add(v2);
		adjList.get(v2).add(v1);
	}
	
	//Method to get the adjacency list
	public List<String> getAdjVertices(String vertex) {
		return adjList.get(vertex);
	}
	
	//Method to display the graph
	public void printGraph() {
		System.out.println("graph G {");
		for (String vertex : adjList.keySet()) {
			for(String v:adjList.get(vertex)) {
				System.out.println(vertex+" -- "+ v+";");
			}		
		}
		System.out.println("}");
	}
}
