package graph;

import java.util.ArrayDeque;
import java.util.Deque;
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

  public void dfsIterative(int src) {
    boolean visited[] = new boolean[this.list.size()];
    Deque<Integer> stack = new ArrayDeque<>();

    stack.push(src);
    visited[src] = true;

    while (!stack.isEmpty()) {
      int curr = stack.pop();
      System.out.print(curr + " ");

      LinkedList<Integer> list = this.list.get(curr);
      for (Integer vertex : list) {
        if (!visited[vertex]) {
          stack.push(vertex);
          visited[vertex] = true;
        }
      }
    }
  }

  private void dfsRecHelper(int src, boolean visited[]) {
    visited[src] = true;
    System.out.print(src + " ");

    LinkedList<Integer> list = this.list.get(src);
    for (Integer vertex : list) {
      if (!visited[vertex]) {
        dfsRecHelper(vertex, visited);
      }
    }
  }

  public void dfsRecursive(int src) {
    boolean visited[] = new boolean[this.list.size()];
    dfsRecHelper(src, visited);
  }
}
