package mapsandsets;

import java.util.HashMap;
import java.util.TreeMap;

public class MapsCollection {
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();
    map.put("Chirag", 21);
    map.put("Abhishek", 26);
    map.put("Neha", 28);
    map.put("Govind", 10);
    map.put("Gopal", 2);
    map.put("Gopal", 3);

    System.out.println(map); // {Neha=28, Abhishek=26, Govind=10, Chirag=21, Gopal=3}
    System.out.println(map.size()); // 5

    System.out.println(map.remove("Chirag")); // 21
    System.out.println(map.size()); // 4

    System.out.println(map.get("Abhishek")); // 26

    System.out.println(map.containsKey("Chirag")); // false
    System.out.println(map.containsKey("Neha")); // true

    for (String key : map.keySet()) {
      System.out.print(key + " = " + map.get(key) + " ");
    }
    System.out.println();

    // =======================================================

    TreeMap<String, Integer> tmap = new TreeMap<>(); // Internally it is a balanced BST
    tmap.put("Chirag", 21);
    tmap.put("Abhishek", 26);
    tmap.put("Neha", 28);
    tmap.put("Govind", 10);
    tmap.put("Gopal", 2);
    tmap.put("Gopal", 3);

    System.out.println(tmap); // {Abhishek=26, Chirag=21, Gopal=3, Govind=10, Neha=28}
    System.out.println(tmap.size()); // 5

    System.out.println(tmap.remove("Chirag")); // 21
    System.out.println(tmap.size()); // 4

    System.out.println(tmap.get("Abhishek")); // 26

    System.out.println(tmap.containsKey("Chirag")); // false
    System.out.println(tmap.containsKey("Neha")); // true

  }
}
