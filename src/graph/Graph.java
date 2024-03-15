package graph;

import java.util.ArrayList;
import java.util.HashMap;

// can be implemented using adjacency matrix or adjacency list;
// below is adjacency list , each vertex will have arraylist of which all vertex it points to
// graph will be like a=[b,c] b=[a,c] means a is connected to b and c 

public class Graph {
 
	private HashMap<String, ArrayList<String>> adjList = new HashMap();
	
	public void printGraph() {
		System.out.println(adjList);
	}
	
	public boolean addVertex(String vertex) {
		if(adjList.get(vertex) == null) {
			adjList.put(vertex, new ArrayList<String>());
			return true;
		}
		return false;
	}
	
	//edges to join{ "A" = ["B"], "B"= ["A"]
	public boolean addEdge(String vertex1 , String vertex2) {
		if(adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
		adjList.get(vertex1).add(vertex2);
		adjList.get(vertex2).add(vertex1);
		return true;
		}
		return false;
	}
	
	public boolean removeEdge(String vertex1 , String vertex2) {
		if(adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
		adjList.get(vertex1).remove(vertex2);
		adjList.get(vertex2).remove(vertex1);
		return true;
		}
		return false;
	}
	
	// below grapgh represent hashmap where key is vertex and arraylist values are edges defining where joined
	// to remove a vertex remove vertex and also all edges where those edges are present
	//{
//	"A" =["B" , "C"]
//    "B" =["A"]
//    "C" =["A"]
//	"D" =["A" , "B" , "C"]}
	public boolean removeVertex(String vertex) {
		if(adjList.get(vertex) == null) return false;
		//suppose i am removing D from above graph it will give all values present for D 
		for(String otherVertex : adjList.get(vertex)) {
			// In our graph all values in the vertex will also connct to current vertex so remove from there
			adjList.get(otherVertex).remove(vertex);
		}
		// remove the vertex
		adjList.remove(vertex);
		return true;
	}
	
}
