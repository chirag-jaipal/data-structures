package graph;

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

  public static void main(String[] args) {
    GraphAdjacencyMatrixRepresentation graph = new GraphAdjacencyMatrixRepresentation(5);
    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 3);
    graph.addEdge(2, 3);
    graph.addEdge(2, 4);
    graph.addEdge(3, 4);

    graph.print();
  }
}
