package deque;

public class DequeUsingDoublyLinkedListDemo {
  public static void main(String[] args) {
    DequeUsingDoublyLinkedList dq = new DequeUsingDoublyLinkedList();

    System.out.println("DEQUE LENGTH: " + dq.length()); // 0

    dq.insertRear(10);
    dq.insertRear(20);
    dq.insertRear(30);
    dq.insertRear(40);
    dq.insertFront(5);
    dq.insertFront(1);

    System.out.println("FRONT ELE: " + dq.frontEle()); // 1
    System.out.println("REAR ELE: " + dq.rearEle()); // 40

    System.out.println("DEQUE LENGTH: " + dq.length()); // 6

    System.out.println("DEQUED ELE: " + dq.deleteFront()); // 1
    System.out.println("DEQUED ELE: " + dq.deleteFront()); // 5
    System.out.println("DEQUED ELE: " + dq.deleteRear()); // 40
    System.out.println("DEQUED ELE: " + dq.deleteRear()); // 30

    System.out.println("FRONT ELE: " + dq.frontEle()); // 10
    System.out.println("REAR ELE: " + dq.rearEle()); // 20

    System.out.println("DEQUE LENGTH: " + dq.length()); // 2
  }
}
