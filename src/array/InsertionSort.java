package array;

import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    int[] a = {4, 5, 10, 3, 1};

    for (int j = 1; j < a.length; j++) {
      int current = a[j];
      int i = j - 1;
      while ((i >= 0) && (a[i] > current)) {
        a[i + 1] = a[i];
        i--;
      }
      a[i+1] = current;
    }

    System.out.println(Arrays.toString(a));
  }
}



