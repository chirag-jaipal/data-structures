package deque;

public class DequeUsingArrayDemo {
  public static void main(String[] args) {
    DequeUsingArray dq = new DequeUsingArray(6);

    System.out.println("DEQUE LENGTH: " + dq.length()); // 0

    dq.insertRear(10);
    dq.insertRear(20);
    dq.insertRear(30);
    dq.insertRear(40);

    System.out.println("FRONT ELE: " + dq.frontEle()); // 10

    System.out.println("DELETED ELE: " + dq.deleteFront()); // 10
    System.out.println("DELETED ELE: " + dq.deleteFront()); // 20

    dq.insertFront(5);
    dq.insertFront(1);

    System.out.println("FRONT ELE: " + dq.frontEle()); // 1
    System.out.println("REAR ELE: " + dq.rearEle()); // 40

    System.out.println("DEQUE LENGTH: " + dq.length()); // 4
  }
}
