package linkedlist;

public class DoublyCircularLinkedList {
  private class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
      this.data = data;
      this.next = this.prev = null;
    }
  }

  private Node head;
  private Node tail;

  public DoublyCircularLinkedList() {
    this.head = this.tail = null;
  }

  public void insertAtEnd(int value) {
    Node newNode = new Node(value);

    if (this.head == null) {
      this.head = this.tail = newNode;
      this.tail.next = this.head;
      this.tail.prev = this.head;
      return;
    }

    this.tail.next = newNode;
    newNode.prev = this.tail;
    this.tail = newNode;
    newNode.next = this.head;
    this.head.prev = newNode;
  }

  public void insertAtBeginning(int value) {
    Node newNode = new Node(value);

    if (this.head == null) {
      this.head = this.tail = newNode;
      this.tail.next = this.head;
      this.tail.prev = this.head;
      return;
    }

    this.tail.next = newNode;
    newNode.next = this.head;
    this.head.prev = newNode;
    this.head = newNode;
    this.head.prev = this.tail;
  }

  public void insertAfter(int value, int ele) {
    Node temp = this.head;
    if (temp == null) {
      System.out.println("LinkedList is empty.");
      return;
    }

    Node newNode = new Node(value);

    do {
      if (temp.data == ele) {
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;

        if (ele == this.tail.data) {
          this.tail = newNode;
        }

        return;
      }
      temp = temp.next;
    } while (temp != this.head);

    /// If the element is not found
    System.out.println(ele + " not found");
  }

  public void delete(int ele) {
    Node temp = this.head;
    if (temp == null) {
      System.out.println("LinkedList is empty.");
      return;
    }

    // Deleting, if only one node exist
    if (this.head.data == this.tail.data && temp.data == ele) {
      this.head = this.tail = null;
      return;
    }

    do {
      if (temp.data == ele) {
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        // Handling tail node
        if (temp.data == this.tail.data) {
          this.tail = temp.prev;
        }

        // Handling head node
        if (temp.data == this.head.data) {
          this.head = temp.next;
        }

        temp = null;
        return;
      }
      temp = temp.next;
    } while (temp != this.head);
  }

  public void display() {
    Node temp = this.head;

    if (temp == null) {
      System.out.println("LinkedList is empty.");
      return;
    }

    do {
      System.out.print(temp.data + " ");
      temp = temp.next;
    } while (temp != this.head);
    System.out.println();
  }
}
