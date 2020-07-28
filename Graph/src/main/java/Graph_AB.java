import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Graph_AB {

    static Logger logger = LoggerFactory.getLogger(Graph_AB.class);
    static void addEdge(ArrayList<ArrayList<Integer>> adjacencyList, int u, int v){
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }

    static void printGraph(ArrayList<ArrayList<Integer> > adjacencyList){
        logger.info("Printing Graph....");
        for (int i = 0; i < adjacencyList.size(); i++) {
            System.out.println("\nAdjacency list of vertex" + i);
            System.out.print("head");
            for (int j = 0; j < adjacencyList.get(i).size(); j++) {
                System.out.print(" -> "+adjacencyList.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        // Creating a graph with 5 vertices 
        int V = 5;
        ArrayList<ArrayList<Integer> > adjacencyList = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++) {
            adjacencyList.add(new ArrayList<Integer>());
        }

        // Adding edges one by one 
        addEdge(adjacencyList, 0, 1);
        addEdge(adjacencyList, 0, 4);
        addEdge(adjacencyList, 1, 2);
        addEdge(adjacencyList, 1, 3);
        addEdge(adjacencyList, 1, 4);
        addEdge(adjacencyList, 2, 3);
        addEdge(adjacencyList, 3, 4);

        printGraph(adjacencyList);
    }
    
}
