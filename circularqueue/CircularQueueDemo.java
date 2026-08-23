package circularqueue;

public class CircularQueueDemo {
  public static void main(String[] args) {
    CircularQueue cq = new CircularQueue(6);

    System.out.println("LENGTH: " + cq.length()); // 0

    cq.enqueue(10);
    cq.enqueue(20);
    cq.enqueue(30);
    cq.enqueue(40);
    cq.enqueue(50);
    cq.enqueue(60);

    System.out.println("LENGTH: " + cq.length()); // 6

    System.out.println("REAR: " + cq.getRear()); // 60
    System.out.println("FRONT: " + cq.getFront()); // 10

    System.out.println("DEQUEUED ELE: " + cq.dequeue()); // 10
    System.out.println("DEQUEUED ELE: " + cq.dequeue()); // 20
    System.out.println("DEQUEUED ELE: " + cq.dequeue()); // 30
    System.out.println("DEQUEUED ELE: " + cq.dequeue()); // 40
    System.out.println("DEQUEUED ELE: " + cq.dequeue()); // 50
    System.out.println("DEQUEUED ELE: " + cq.dequeue()); // 60
  }
}
