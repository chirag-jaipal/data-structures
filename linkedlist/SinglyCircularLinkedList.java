package linkedlist;

public class SinglyCircularLinkedList {
  private static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  private Node head;
  private Node tail;

  public SinglyCircularLinkedList() {
    this.head = this.tail = null;
  }

  public void insertAtEnd(int value) {
    Node newNode = new Node(value);

    if (this.head == null) {
      this.head = this.tail = newNode;
      this.tail.next = this.head;
      return;
    }

    this.tail.next = newNode;
    this.tail = newNode;
    this.tail.next = this.head;
  }

  public void insertAtBeginning(int value) {
    Node newNode = new Node(value);

    if (this.head == null) {
      this.head = this.tail = newNode;
      this.tail.next = this.head;
      return;
    }

    newNode.next = this.head;
    this.head = newNode;
    this.tail.next = this.head;
  }

  public void insertAfter(int value, int ele) {
    Node temp = this.head;
    if (temp == null) {
      System.out.print("LinkedList is empty.");
      return;
    }

    Node newNode = new Node(value);

    do {
      if (temp.data == ele) {
        newNode.next = temp.next;
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
    Node prev = temp;

    if (temp == null) {
      System.out.print("LinkedList is empty.");
      return;
    }

    // Deleting head node
    if (temp.data == ele) {
      // Only one node is present
      if (this.head.data == this.tail.data) {
        this.head = this.tail = null;
      } else {
        this.head = temp.next;
        this.tail.next = this.head;
        temp = null;
      }
      return;
    }

    do {
      if (temp.data == ele) {
        prev.next = temp.next;

        if (temp.data == this.tail.data) {
          this.tail = prev;
        }

        temp = null;
        return;
      } else {
        prev = temp;
        temp = temp.next;
      }
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
