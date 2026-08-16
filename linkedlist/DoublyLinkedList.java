package linkedlist;

public class DoublyLinkedList {
  private static class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = this.prev = null;
    }
  }

  private Node head;

  public DoublyLinkedList() {
    this.head = null;
  }

  public void insertAtEnd(int value) {
    Node newNode = new Node(value);

    if (this.head == null) {
      this.head = newNode;
      return;
    }

    Node temp = this.head;
    while (temp.next != null) {
      temp = temp.next;
    }

    newNode.prev = temp;
    temp.next = newNode;
  }

  public void display() {
    Node temp = this.head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }
}
