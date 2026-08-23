package queue;

public class QueueUsingArray {
  private int arr[];
  private int front;
  private int rear;

  public QueueUsingArray(int capacity) {
    if (capacity <= 0) {
      throw new IllegalArgumentException("Capacity must be greater than 0");
    }
    this.arr = new int[capacity];
    this.front = this.rear = 0;
  }

  public int length() {
    return this.rear - this.front;
  }

  public boolean isEmpty() {
    return this.rear == this.front;
  }

  public boolean isFull() {
    return this.rear == this.arr.length;
  }

  public void enqueue(int value) {
    if (isFull()) {
      throw new IllegalStateException("Queue Overflow");
    }
    this.arr[this.rear++] = value;
  }

  public int dequeue() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue Underflow");
    }
    return this.arr[this.front++];
  }

  public int peek() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue Underflow");
    }
    return this.arr[this.front];
  }
}
