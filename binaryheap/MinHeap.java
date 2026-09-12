package binaryheap;

import java.util.PriorityQueue;

public class MinHeap {
  public static void main(String[] args) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    minHeap.add(10);
    minHeap.add(20);
    minHeap.add(-30);
    System.out.println(minHeap.peek()); // -30

    minHeap.add(-35);
    System.out.println(minHeap.peek()); // -35

    System.out.println(minHeap.size()); // 4

    System.out.println(minHeap.remove()); // -35
    System.out.println(minHeap.peek()); // -30

    System.out.println(minHeap); // [-30, 20, 10]

    for (int ele : minHeap) {
      System.out.print(ele + " ");
    }
  }
}
