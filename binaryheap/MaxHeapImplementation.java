package binaryheap;

import java.util.NoSuchElementException;

public class MaxHeapImplementation {
  private int arr[];
  private int capacity;
  private int size;

  public MaxHeapImplementation(int n) {
    this.capacity = n;
    this.arr = new int[capacity];
    this.size = 0;
  }

  private void swap(int arr[], int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  private int right(int idx) {
    return 2 * idx + 2;
  }

  private int left(int idx) {
    return 2 * idx + 1;
  }

  private int parent(int idx) {
    return (idx - 1) / 2;
  }

  public int size() {
    return size;
  }

  public int peek() {
    if (size == 0) {
      throw new NoSuchElementException("Heap is empty.");
    }
    return arr[0];
  }

  public void display() {
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public boolean add(int val) {
    if (size == capacity) {
      return false;
    }

    int i = size;
    arr[i] = val;
    size++;

    // Rearrangement
    while (i != 0 && arr[i] > arr[parent(i)]) {
      swap(arr, i, parent(i));
      i = parent(i);
    }

    return true;
  }

  public int remove() {
    if (size == 0) {
      throw new NoSuchElementException("Heap is empty.");
    }

    int removedEle = arr[0];
    arr[0] = arr[--size];

    // Rearrangement
    int curr = 0;
    while (right(curr) <= size) {
      int max = (arr[left(curr)] > arr[right(curr)]) ? left(curr) : right(curr);
      swap(arr, curr, max);
      curr = max;
    }

    return removedEle;
  }
}
