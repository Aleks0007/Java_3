// Реализовать алгоритм сортировки слиянием

import java.util.*;

class MergeSort {
  
  public static void merge(int[] arr, int l, int m, int r) {
    int n1 = m - l + 1;
    int n2 = r - m;

    int[] leftArr = new int[n1];
    int[] rightArr = new int[n2];

    for (int i = 0; i < n1; ++i) {
      leftArr[i] = arr[l + i];
    }
    for (int j = 0; j < n2; ++j) {
      rightArr[j] = arr[m + 1 + j];
    }

    int i = 0, j = 0;
    int k = l;
    while (i < n1 && j < n2) {
      if (leftArr[i] <= rightArr[j]) {
        arr[k] = leftArr[i];
        i++;
      } else {
        arr[k] = rightArr[j];
        j++;
      }
      k++;
    }

    while (i < n1) {
      arr[k] = leftArr[i];
      i++;
      k++;
    }

    while (j < n2) {
      arr[k] = rightArr[j];
      j++;
      k++;
    }
  }

  public static void mergeSort(int[] arr, int l, int r) {
    if (l < r) {
      int m = (l + r) / 2;
      mergeSort(arr, l, m);
      mergeSort(arr, m + 1, r);
      merge(arr, l, m, r);
    }
  }

  public static int[] getArray() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите элементы массива через пробел: ");
    String[] items = scanner.nextLine().split(" ");
    int[] arr = new int[items.length];
    for (int i = 0; i < items.length; i++) {
      arr[i] = Integer.parseInt(items[i]);
    }
    scanner.close();
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = getArray();
    System.out.println("Исходный массив: " + Arrays.toString(arr));
    mergeSort(arr, 0, arr.length - 1);
    System.out.println("Отсортированный массив: " + Arrays.toString(arr));
  }
}