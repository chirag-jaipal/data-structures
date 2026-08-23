package deque;

public class DequeUsingArray {
  private int arr[];
  private int front;
  private int rear;

  public DequeUsingArray(int capacity) {
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
    return this.front == this.rear;
  }

  public boolean isFull() {
    return this.rear == this.arr.length;
  }

  public void insertFront(int value) {
    if (this.front <= 0) {
      throw new IllegalStateException("Deque Overflow");
    }
    this.arr[--this.front] = value;
  }

  public void insertRear(int value) {
    if (isFull()) {
      throw new IllegalStateException("Deque Overflow");
    }
    this.arr[this.rear++] = value;
  }

  public int deleteFront() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue Underflow");
    }
    return this.arr[this.front++];
  }

  public int deleteRear() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue Underflow");
    }
    return this.arr[--this.rear];
  }

  public int frontEle() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue Underflow");
    }
    return this.arr[this.front];
  }

  public int rearEle() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue Underflow");
    }
    return this.arr[this.rear - 1];
  }
}
