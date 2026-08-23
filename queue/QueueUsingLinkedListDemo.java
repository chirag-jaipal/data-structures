package queue;

public class QueueUsingLinkedListDemo {
  public static void main(String[] args) {
    QueueUsingLinkedList q = new QueueUsingLinkedList();

    System.out.println("Q1 LENGTH: " + q.length());

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

    System.out.println("QUEUE EMPTY: " + q.isEmpty()); // true

    System.out.println("QUEUE LENGTH: " + q.length()); // 0
  }
}
