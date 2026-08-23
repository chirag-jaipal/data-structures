package queue;

public class QueueUsingArrayDemo {
  public static void main(String[] args) {
    QueueUsingArray q = new QueueUsingArray(5);

    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.enqueue(50);

    System.out.println("PEEK ELE: " + q.peek()); // 10

    System.out.println("DEQUEUED ELE: " + q.dequeue()); // 10
    System.out.println("DEQUEUED ELE: " + q.dequeue()); // 20
    System.out.println("DEQUEUED ELE: " + q.dequeue()); // 30
    System.out.println("DEQUEUED ELE: " + q.dequeue()); // 40
    System.out.println("DEQUEUED ELE: " + q.dequeue()); // 50

    System.out.println("QUEUE FULL: " + q.isFull()); // true
    System.out.println("QUEUE EMPTY: " + q.isEmpty()); // true

    System.out.println("QUEUE LENGTH: " + q.length()); // 0
  }
}
