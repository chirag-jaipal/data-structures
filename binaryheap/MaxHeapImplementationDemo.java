package binaryheap;

public class MaxHeapImplementationDemo {
  public static void main(String[] args) {
    MaxHeapImplementation maxHeap = new MaxHeapImplementation(10);
    maxHeap.add(3);
    maxHeap.add(2);
    maxHeap.add(1);

    System.out.println("PEEK ELE: " + maxHeap.peek()); // 3
    System.out.println("HEAP SIZE: " + maxHeap.size()); // 3

    maxHeap.add(15);
    maxHeap.add(5);
    maxHeap.add(4);
    maxHeap.add(45);
    maxHeap.add(0);

    System.out.println("PEEK ELE: " + maxHeap.peek()); // 45
    System.out.println("HEAP SIZE: " + maxHeap.size()); // 8

    maxHeap.display(); // 45 5 15 2 3 1 4 0

    System.out.println("REMOVED ELE: " + maxHeap.remove()); // 45
    maxHeap.display(); // 15 5 4 2 3 1 0

    System.out.println("PEEK ELE: " + maxHeap.peek()); // 15
    System.out.println("HEAP SIZE: " + maxHeap.size()); // 7

    System.out.println("REMOVED ELE: " + maxHeap.remove()); // 15
    maxHeap.display(); // 5 3 4 2 0 1

    System.out.println("PEEK ELE: " + maxHeap.peek()); // 5
    System.out.println("HEAP SIZE: " + maxHeap.size()); // 6

    System.out.println("REMOVED ELE: " + maxHeap.remove()); // 5
    maxHeap.display(); // 4 3 1 2 0

    System.out.println("PEEK ELE: " + maxHeap.peek()); // 4
    System.out.println("HEAP SIZE: " + maxHeap.size()); // 5
  }
}
