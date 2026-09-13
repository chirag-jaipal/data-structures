package binaryheap;

public class MinHeapImplementationDemo {
  public static void main(String[] args) {
    MinHeapImplementation minHeap = new MinHeapImplementation(10);
    minHeap.add(3);
    minHeap.add(2);
    minHeap.add(1);

    System.out.println("PEEK ELE: " + minHeap.peek()); // 1
    System.out.println("HEAP SIZE: " + minHeap.size()); // 3

    minHeap.add(15);
    minHeap.add(5);
    minHeap.add(4);
    minHeap.add(45);
    minHeap.add(0);

    System.out.println("PEEK ELE: " + minHeap.peek()); // 0
    System.out.println("HEAP SIZE: " + minHeap.size()); // 8

    minHeap.display(); // 0 1 2 3 5 4 45 15

    System.out.println("REMOVED ELE: " + minHeap.remove()); // 0
    minHeap.display(); // 1 3 2 15 5 4 45

    System.out.println("PEEK ELE: " + minHeap.peek()); // 1
    System.out.println("HEAP SIZE: " + minHeap.size()); // 7

    System.out.println("REMOVED ELE: " + minHeap.remove()); // 1
    minHeap.display(); // 2 3 4 15 5 45

    System.out.println("PEEK ELE: " + minHeap.peek()); // 2
    System.out.println("HEAP SIZE: " + minHeap.size()); // 6

    System.out.println("REMOVED ELE: " + minHeap.remove()); // 2
    minHeap.display(); // 3 5 4 15 45

    System.out.println("PEEK ELE: " + minHeap.peek()); // 3
    System.out.println("HEAP SIZE: " + minHeap.size()); // 5
  }
}
