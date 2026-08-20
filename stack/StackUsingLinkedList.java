package stack;

public class StackUsingLinkedList {
  private class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  private Node top;
  private int count;

  public StackUsingLinkedList() {
    this.top = null;
    this.count = 0;
  }

  public int length() {
    return this.count;
  }

  public Boolean isEmpty() {
    return this.top == null;
  }

  public void push(int value) {
    Node newNode = new Node(value);
    newNode.next = this.top;
    this.top = newNode;
    this.count++;
  }

  public int pop() {
    if (isEmpty()) {
      throw new IllegalStateException("Stack Underflow");
    }

    Node temp = this.top;
    this.top = temp.next;
    this.count--;
    return temp.data;
  }

  public int peek() {
    if (isEmpty()) {
      throw new IllegalStateException("Stack Underflow");
    }

    return this.top.data;
  }
}
