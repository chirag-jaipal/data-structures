package deque;

public class DequeUsingDoublyLinkedList {
  private class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
      this.data = data;
      this.next = this.prev = null;
    }
  }

  private Node front;
  private Node rear;
  private int count;

  public DequeUsingDoublyLinkedList() {
    this.front = this.rear = null;
    this.count = 0;
  }

  public int length() {
    return this.count;
  }

  public boolean isEmpty() {
    return this.front == null;
  }

  public void insertRear(int value) {
    Node newNode = new Node(value);

    if (this.front == null) {
      this.front = this.rear = newNode;
      this.count++;
      return;
    }

    this.rear.next = newNode;
    newNode.prev = this.rear;
    this.rear = newNode;
    this.count++;
  }

  public void insertFront(int value) {
    Node newNode = new Node(value);

    if (this.front == null) {
      this.front = this.rear = newNode;
      this.count++;
      return;
    }

    newNode.next = this.front;
    this.front.prev = newNode;
    this.front = newNode;
    this.count++;
  }

  public int deleteFront() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue Underflow");
    }
    Node temp = this.front;
    this.front = temp.next;
    this.front.prev = null;
    this.count--;
    return temp.data;
  }

  public int deleteRear() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue Underflow");
    }
    Node temp = this.rear;
    this.rear = this.rear.prev;
    this.rear.next = null;
    this.count--;
    return temp.data;
  }

  public int frontEle() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue Underflow");
    }
    return this.front.data;
  }

  public int rearEle() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue Underflow");
    }
    return this.rear.data;
  }
}
