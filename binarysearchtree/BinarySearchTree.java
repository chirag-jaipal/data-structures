package binarysearchtree;

class Node {
  int data;
  Node left, right;

  Node(int data) {
    this.data = data;
    this.left = this.right = null;
  }
}

public class BinarySearchTree {
  public static Node insert(Node root, int data) {
    if (root == null) {
      return new Node(data);
    }

    if (root.data == data) {
      return root;
    } else if (data < root.data) {
      root.left = insert(root.left, data);
    } else {
      root.right = insert(root.right, data);
    }

    return root;
  }

  public static int search(Node root, int val) {
    if (root == null) {
      return -1;
    }

    if (root.data == val) {
      return root.data;
    } else if (root.data > val) {
      return search(root.left, val);
    } else {
      return search(root.right, val);
    }
  }

  public static void inOrderTraversal(Node root) {
    if (root != null) {
      inOrderTraversal(root.left);
      System.out.print(root.data + " ");
      inOrderTraversal(root.right);
    }
  }

  public static void main(String[] args) {
    Node root = null;
    root = insert(root, 20);
    root = insert(root, 30);
    root = insert(root, 15);
    root = insert(root, 25);
    root = insert(root, 40);
    root = insert(root, 50);
    root = insert(root, 23);

    System.out.println("INORDER TRAVERSAL: ");
    inOrderTraversal(root);
    System.out.println("\nROOT: " + root.data); // 20

    System.out.println("SEARCHED ELE: " + search(root, 20)); // 20
    System.out.println("SEARCHED ELE: " + search(root, 30)); // 30
    System.out.println("SEARCHED ELE: " + search(root, 15)); // 15
    System.out.println("SEARCHED ELE: " + search(root, 25)); // 25
    System.out.println("SEARCHED ELE: " + search(root, 40)); // 40
    System.out.println("SEARCHED ELE: " + search(root, 50)); // 50
    System.out.println("SEARCHED ELE: " + search(root, 23)); // 23
    System.out.println("SEARCHED ELE: " + search(root, 10)); // -1 -> Element not found
  }
}
