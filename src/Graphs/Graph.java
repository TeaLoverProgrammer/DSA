package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Graph {
    private HashMap<Integer, ArrayList<Integer>> adjacencyList;
    private int nodeCount;

    Graph(){
        adjacencyList= new HashMap<>();
        nodeCount = 0;
    }

    //addNode
    public void addVertex(int data){
        //incodming node is new
        if(!adjacencyList.containsKey(data)){
            adjacencyList.put(data, null);
            nodeCount++;
        }
    }

    //addEdge or add connection
    public void addEdge(int fromKeyNode, int toKeyNode){
        ArrayList<Integer> adjacentNodeList = null;
        if(adjacencyList.containsKey(fromKeyNode)){
            adjacentNodeList = adjacencyList.get(fromKeyNode);
            if(adjacentNodeList == null){
                adjacentNodeList = new ArrayList<>();
            }
            adjacentNodeList.add(toKeyNode);
            adjacencyList.put(fromKeyNode, adjacentNodeList);
        }
        //undirected graph , there is a connection other way around too.
        if(adjacencyList.containsKey(toKeyNode)){
            adjacentNodeList = adjacencyList.get(toKeyNode);
            if(adjacentNodeList == null){
                adjacentNodeList = new ArrayList<>();
            }
            adjacentNodeList.add(fromKeyNode);
            adjacencyList.put(toKeyNode, adjacentNodeList);
        }
    }

    //show all the connections
    public void showConnections(){
      for(Integer key : adjacencyList.keySet()){
          String response ="key: "+ key +" adjacentNodes: ";

          if(Objects.nonNull(adjacencyList.get(key))) {
              for (Integer adjacentNodes : adjacencyList.get(key)) {
                  response = response + adjacentNodes + "  ";
              }
          }
          System.out.println(response);
          response = null;
      }
    }


}
