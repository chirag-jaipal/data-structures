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

  public void insertAtBeginning(int value) {
    Node newNode = new Node(value);

    if (this.head == null) {
      this.head = newNode;
      return;
    }

    this.head.prev = newNode;
    newNode.next = this.head;
    this.head = newNode;
  }

  public void insertAfter(int value, int ele) {
    Node temp = this.head;
    if (temp == null) {
      System.out.print("LinkedList is empty.");
      return;
    }

    Node newNode = new Node(value);

    while (temp.next != null) {
      if (temp.data == ele) {
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
        return;
      }
      temp = temp.next;
    }

    // Check last node
    if (temp.data == ele) {
      temp.next = newNode;
      newNode.prev = temp;
      return;
    }

    /// If the element is not found
    System.out.println(ele + " not found");
  }

  public void delete(int ele) {
    Node temp = this.head;
    if (temp == null) {
      System.out.print("LinkedList is empty.");
      return;
    }

    while (temp.next != null) {
      if (temp.data == ele) {
        if (temp.prev == null) {
          this.head = temp.next;
          this.head.prev = null;
        } else {
          temp.prev.next = temp.next;
          temp.next.prev = temp.prev;
        }
        temp = null;
        return;
      }
      temp = temp.next;
    }

    // Last Node
    if (temp.data == ele) {
      temp.prev.next = null;
      temp = null;
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
