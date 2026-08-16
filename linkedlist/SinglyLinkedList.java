package linkedlist;

public class SinglyLinkedList {
  private static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  private Node head;

  public SinglyLinkedList() {
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

    temp.next = newNode;
  }

  public void insertAtBeginning(int value) {
    Node newNode = new Node(value);

    if (this.head == null) {
      this.head = newNode;
      return;
    }

    newNode.next = this.head;
    this.head = newNode;
  }

  public void insertAfter(int value, int ele) {
    Node newNode = new Node(value);

    Node temp = this.head;
    while (temp != null) {
      if (temp.data == ele) {
        newNode.next = temp.next;
        temp.next = newNode;
        return;
      }
      temp = temp.next;
    }

    // If the element is not found
    System.out.println("Element not found");
  }

  public void delete(int ele) {
    Node temp = this.head;
    Node prev = temp;

    if (temp != null && temp.data == ele) {
      this.head = temp.next;
      temp = null;
      return;
    }

    while (temp != null) {
      if (temp.data == ele) {
        prev.next = temp.next;
        temp = null;
        return;
      } else {
        prev = temp;
        temp = temp.next;
      }
    }
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