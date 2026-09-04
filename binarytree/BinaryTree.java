package binarytree;

class Node {
  int data;
  Node left, right;

  Node(int data) {
    this.data = data;
    this.left = this.right = null;
  }
}

public class BinaryTree {
  public static void preOrderTraversal(Node root) {
    if (root != null) {
      System.out.print(root.data + " ");
      preOrderTraversal(root.left);
      preOrderTraversal(root.right);
    }
  }

  public static void inOrderTraversal(Node root) {
    if (root != null) {
      inOrderTraversal(root.left);
      System.out.print(root.data + " ");
      inOrderTraversal(root.right);
    }
  }

  public static void postOrderTraversal(Node root) {
    if (root != null) {
      postOrderTraversal(root.left);
      postOrderTraversal(root.right);
      System.out.print(root.data + " ");
    }
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(3);
    root.right = new Node(5);
    root.left.left = new Node(2);
    root.left.right = new Node(4);
    root.right.right = new Node(8);

    System.out.print("PRE ORDER TRAVERSAL: ");
    preOrderTraversal(root);

    System.out.print("\nIN ORDER TRAVERSAL: ");
    inOrderTraversal(root);

    System.out.print("\nPOST ORDER TRAVERSAL: ");
    postOrderTraversal(root);
  }
}
