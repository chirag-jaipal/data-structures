package linkedlist;

public class SinglyLinkedListDemo {
  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();

    list.insertAtEnd(10);
    list.insertAtEnd(20);
    list.insertAtEnd(30);

    list.display(); // 10 20 30

    list.insertAtBeginning(5);
    list.insertAtBeginning(1);

    list.display(); // 1 5 10 20 30

    list.insertAfter(25, 20);
    list.insertAfter(40, 30);
    list.insertAfter(25, 35); // 35 does not exist

    list.display(); // 1 5 10 20 25 30 40

    list.delete(20);
    list.delete(1);
    list.delete(40);

    list.display(); // 5 10 25 30
  }
}
