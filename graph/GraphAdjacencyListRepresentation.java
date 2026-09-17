package graph;

import java.util.HashMap;
import java.util.LinkedList;

public class GraphAdjacencyListRepresentation {
  private HashMap<Integer, LinkedList<Integer>> list;

  public GraphAdjacencyListRepresentation() {
    list = new HashMap<>();
  }

  private void addVertex(int vertex) {
    if (!this.list.containsKey(vertex)) {
      this.list.put(vertex, new LinkedList<>());
    }
  }

  public void addEdge(int src, int dest) {
    this.addVertex(src);
    this.addVertex(dest);

    this.list.get(src).add(dest);
    this.list.get(dest).add(src);
  }

  public void print() {
    for (Integer key : this.list.keySet()) {
      System.out.println(key + " : " + this.list.get(key));
    }
  }
}
