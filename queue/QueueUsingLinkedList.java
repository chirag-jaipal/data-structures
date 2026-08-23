package queue;

public class QueueUsingLinkedList {
  private class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  private Node front;
  private Node rear;
  private int count;

  public QueueUsingLinkedList() {
    this.front = this.rear = null;
    this.count = 0;
  }

  public int length() {
    return this.count;
  }

  public boolean isEmpty() {
    return this.front == null;
  }

  public void enqueue(int value) {
    Node newNode = new Node(value);

    if (this.front == null) {
      this.front = this.rear = newNode;
      this.count++;
      return;
    }

    this.rear.next = newNode;
    this.rear = newNode;
    this.count++;
  }

  public int dequeue() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue Underflow");
    }
    Node temp = this.front;
    this.front = temp.next;
    this.count--;
    return temp.data;
  }

  public int peek() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue Underflow");
    }
    return this.front.data;
  }
}
