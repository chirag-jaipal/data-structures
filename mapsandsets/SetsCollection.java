package mapsandsets;

import java.util.HashSet;
import java.util.TreeSet;

public class SetsCollection {
  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    set.add(77);
    set.add(65);
    set.add(21);
    set.add(2);
    set.add(11);
    set.add(45);
    set.add(18);
    set.add(3);
    set.add(77);

    System.out.println(set.size()); // 8
    System.out.println(set.contains(21)); // true
    System.out.println(set.contains(10)); // false

    set.remove(21);

    System.out.println(set.contains(21)); // false
    System.out.println(set.size()); // 7

    System.out.println(set); // [65, 2, 18, 3, 11, 77, 45]

    for (Integer ele : set) {
      ele *= 2;
      System.out.print(ele + " ");
    }
    System.out.println();

    // `NO CHANGE` on actual set elements
    for (Integer ele : set) {
      System.out.print(ele + " ");
    }
    System.out.println();

    // ===============================================

    TreeSet<Integer> tset = new TreeSet<>(); // Internally it is a balanced BST
    tset.add(77);
    tset.add(65);
    tset.add(21);
    tset.add(2);
    tset.add(11);
    tset.add(45);
    tset.add(18);
    tset.add(3);
    tset.add(77);

    System.out.println(tset.size()); // 8
    System.out.println(tset.contains(21)); // true
    System.out.println(tset.contains(10)); // false

    tset.remove(21);

    System.out.println(tset.contains(21)); // false
    System.out.println(tset.size()); // 7

    System.out.println(tset); // [2, 3, 11, 18, 45, 65, 77]

    for (Integer ele : tset) {
      System.out.print(ele + " ");
    }
    System.out.println();
  }
}
