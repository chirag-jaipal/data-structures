package stack;

public class StackUsingLinkedListDemo {
  public static void main(String[] args) {
    StackUsingLinkedList stack = new StackUsingLinkedList();

    System.out.println(stack.isEmpty()); // true
    System.out.println(stack.length()); // 0

    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    stack.push(50);

    System.out.println(stack.isEmpty()); // false
    System.out.println(stack.length()); // 5

    System.out.println(stack.pop()); // 50
    System.out.println(stack.pop()); // 40
    System.out.println(stack.pop()); // 30

    System.out.println(stack.peek()); // 20

    System.out.println(stack.pop()); // 20
    System.out.println(stack.pop()); // 10

    System.out.println(stack.peek()); // Stack Underflow!
  }
}
