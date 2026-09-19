package graph;

public class GraphAdjacencyListRepDemo {
  public static void main(String[] args) {
    GraphAdjacencyListRepresentation graph = new GraphAdjacencyListRepresentation();
    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(2, 3);
    graph.addEdge(2, 4);
    graph.addEdge(3, 5);
    graph.addEdge(4, 5);

    System.out.println("GRAPH: ");
    graph.print();

    System.out.println("\nDFS TRAVERSAL ITERATIVE: ");
    graph.dfsIterative(0);

    System.out.println("\n\nDFS TRAVERSAL RECURSIVE: ");
    graph.dfsRecursive(0);

    System.out.println("\n\nBFS TRAVERSAL: ");
    graph.bfs(0);
  }
}
