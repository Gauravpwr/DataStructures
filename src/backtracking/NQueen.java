package backtracking;

import java.util.Arrays;

public class NQueen {
  static int n = 4;

  public static void main(String[] args) {
    int[] solution = new int[n];
    nQueeens(solution, 1);
    System.out.println("solution: " + Arrays.toString(solution));
  }

  private static void nQueeens(int[] solution, int queen) {
    int col = 0;
    while (col < n) {
      if (solution[col] == 0) {
        if (isUnderAttack(solution, queen, col)) {
          col++;
        } else {
          solution[col] = queen;
          nQueeens(solution, queen + 1);
          if (ifNotFull(solution)) {
            solution[col] = 0;
            col++;
          } else {
            return;
          }
        }
      } else {
        col++;
      }

    }
  }

  private static boolean ifNotFull(int[] solution) {
    for (int i = 0; i < n; i++) {
      if (solution[i] == 0) {
        return true;
      }
    }
    return false;
  }

  private static boolean isUnderAttack(int[] solution, int queen, int col) {
    for (int i = 0; i < n; i++) {
      int prevCol = i + 1;
      int prevqueen = solution[i];
      if (solution[i] != 0 && (Math.abs(prevqueen - queen) == Math.abs(prevCol - (col + 1)))) {
        return true;
      }
    }
    return false;
  }
}
