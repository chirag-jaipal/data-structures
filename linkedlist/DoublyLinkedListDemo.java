package linkedlist;

public class DoublyLinkedListDemo {
  public static void main(String[] args) {
    DoublyLinkedList list = new DoublyLinkedList();

    list.insertAtEnd(10);
    list.insertAtEnd(20);
    list.insertAtEnd(30);

    list.display(); // 10 20 30

    list.insertAtBeginning(5);
    list.insertAtBeginning(1);

    list.display(); // 1 5 10 20 30

    list.insertAfter(15, 10);
    list.insertAfter(3, 1);
    list.insertAfter(40, 30);
    list.insertAfter(40, 35); // 35 does not exist

    list.display(); // 1 3 5 10 15 20 30 40

    list.delete(1);
    list.delete(10);
    list.delete(40);
    list.delete(35); // 35 does not exist (Silent Failure)

    list.display(); // 3 5 15 20 30
  }
}
