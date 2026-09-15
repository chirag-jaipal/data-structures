package graph;

public class GraphAdjacencyMatRepDemo {
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
