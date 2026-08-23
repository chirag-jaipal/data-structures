package circularqueue;

public class CircularQueue {
  private int[] queue;
  private int size;
  private int front;
  private int rear;

  public CircularQueue(int capacity) {
    if (capacity <= 0) {
      throw new IllegalArgumentException("Capacity must be greater than 0");
    }
    this.queue = new int[capacity];
    this.front = this.rear = 0;
    this.size = 0;
  }

  public int length() {
    return this.size;
  }

  public boolean isEmpty() {
    return this.size == 0;
  }

  public boolean isFull() {
    return this.size == this.queue.length;
  }

  public void enqueue(int value) {
    if (isFull()) {
      throw new IllegalStateException("Queue Overflow");
    }
    this.queue[this.rear] = value;
    this.rear = (this.rear + 1) % this.queue.length;
    this.size++;
  }

  public int dequeue() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue Underflow");
    }
    int dequeuedEle = this.queue[this.front];
    this.front = (this.front + 1) % this.queue.length;
    this.size--;
    return dequeuedEle;
  }

  public int getRear() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue Underflow");
    }
    return this.queue[this.rear];
  }

  public int getFront() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue Underflow");
    }
    return this.queue[this.front];
  }
}
