package binaryheap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {
  public static void main(String[] args) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    maxHeap.add(10);
    maxHeap.add(20);
    maxHeap.add(-30);
    System.out.println(maxHeap.peek()); // 20

    maxHeap.add(35);
    System.out.println(maxHeap.peek()); // 35

    System.out.println(maxHeap.size()); // 4

    System.out.println(maxHeap.remove()); // 35
    System.out.println(maxHeap.peek()); // 20

    System.out.println(maxHeap); // [20, 10, -30]

    for (int ele : maxHeap) {
      System.out.print(ele + " ");
    }
  }
}
