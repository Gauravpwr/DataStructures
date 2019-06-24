package matrix;

import java.util.Arrays;

public class MatrixUtility {
  public static void main(String[] args) {
    int[][] a = new int[3][];
    for (int i = 0; i < a.length; i++) {
      a[i] = new int[]{i};
    }
    for (int i = 0; i < a.length; i++) {
      System.out.println(Arrays.toString(a[i]));
    }
  }
}
