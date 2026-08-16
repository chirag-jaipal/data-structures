package linkedlist;

public class LinkedListDemo {
  public static void main(String[] args) {
    // SinglyLinkedList list = new SinglyLinkedList();

    // list.insertAtEnd(10);
    // list.insertAtEnd(20);
    // list.insertAtEnd(30);

    // list.insertAtBeginning(5);
    // list.insertAtBeginning(1);

    // list.insertAfter(25, 20);
    // list.insertAfter(25, 40); // 40 does not exist

    // list.display(); // 1 5 10 20 25 30

    // list.delete(20);
    // list.display(); // 1 5 10 25 30

    // list.delete(1);
    // list.display(); // 5 10 25 30

    // list.delete(30);
    // list.display(); // 5 10 25

    DoublyLinkedList list = new DoublyLinkedList();

    list.insertAtEnd(10);
    list.insertAtEnd(20);
    list.insertAtEnd(30);

    list.display(); // 10 20 30
  }
}
