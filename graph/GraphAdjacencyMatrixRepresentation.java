package graph;

import java.util.ArrayDeque;
import java.util.Deque;

public class GraphAdjacencyMatrixRepresentation {
  private int[][] mat;
  private int size;

  public GraphAdjacencyMatrixRepresentation(int vertex) {
    this.mat = new int[vertex][vertex];
    this.size = vertex;
  }

  public void addEdge(int src, int dest) {
    if ((src >= 0 && src < this.size) && (dest >= 0 && dest < this.size)) {
      this.mat[src][dest] = 1;
      this.mat[dest][src] = 1;
    } else {
      System.out.println("Invalid Edge");
    }
  }

  public void print() {
    for (int i = 0; i < this.size; i++) {
      for (int j = 0; j < this.size; j++) {
        System.out.print(this.mat[i][j] + " ");
      }
      System.out.println();
    }
  }

  public void dfsIterative(int src) {
    boolean visited[] = new boolean[this.size];
    Deque<Integer> stack = new ArrayDeque<>();

    stack.push(src);
    visited[src] = true;

    while (!stack.isEmpty()) {
      int current = stack.pop();
      System.out.print(current + " ");

      for (int i = 0; i < this.size; i++) {
        int vertex = this.mat[current][i];
        if (vertex == 1 && !visited[i]) {
          stack.push(i);
          visited[i] = true;
        }
      }
    }
  }

  private void dfsRecHelper(int src, boolean visited[]) {
    visited[src] = true;
    System.out.print(src + " ");

    for (int i = 0; i < this.size; i++) {
      if (this.mat[src][i] == 1 && !visited[i]) {
        dfsRecHelper(i, visited);
      }
    }
  }

  public void dfsRecursive(int src) {
    boolean visited[] = new boolean[this.size];
    dfsRecHelper(src, visited);
  }
}
