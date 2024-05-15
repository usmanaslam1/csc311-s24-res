public class GraphTest2 {
    public static void main(String[] args) {
    	
    	Graph g=new Graph();
    	
    	g.addVertex("A");
    	g.addVertex("B");
    	g.addVertex("C");
    	g.addVertex("D");
    	g.addVertex("E");
    	g.addVertex("F");
    	g.addEdge("A", "B");
    	g.addEdge("B", "C");
    	g.addEdge("B", "D");
    	g.addEdge("D", "E");
    	g.addEdge("C", "E");
    	g.addEdge("E", "F");
    	
   
    	
    	//System.out.println(g.getAdjVertices("C"));
    	g.printGraph();
    	
    	
    	
//        SimpleGraph graph = new SimpleGraph();
//        // Adding vertices
//        graph.addVertex(0);
//        graph.addVertex(1);
//        graph.addVertex(2);
//        graph.addVertex(3);
//
//        // Adding edges
//        graph.addEdge(0, 1);
//        graph.addEdge(0, 2);
//        graph.addEdge(1, 2);
//        graph.addEdge(2, 3);
//
//        // Printing the graph
//        graph.printGraph();
    }
}
