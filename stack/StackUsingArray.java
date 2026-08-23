package stack;

public class StackUsingArray {
  private int arr[];
  private int top;

  public StackUsingArray(int capacity) {
    if (capacity <= 0) {
      throw new IllegalArgumentException("Capacity must be greater than 0");
    }
    this.arr = new int[capacity];
    this.top = -1;
  }

  public int length() {
    return this.top + 1;
  }

  public boolean isEmpty() {
    return this.top == -1;
  }

  public boolean isFull() {
    return this.top == this.arr.length - 1;
  }

  public void push(int value) {
    if (isFull()) {
      throw new IllegalStateException("Stack Overflow");
    }
    this.arr[++this.top] = value;
  }

  public int pop() {
    if (isEmpty()) {
      throw new IllegalStateException("Stack Underflow");
    }
    return this.arr[this.top--];
  }

  public int peek() {
    if (isEmpty()) {
      throw new IllegalStateException("Stack Underflow");
    }
    return this.arr[this.top];
  }
}
