package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SlidingWindow {
  public static void main(String[] args) {
    int[] A = {1, 3, 7, -1, -3, 5, 3, 6};
    ArrayList<Integer> a = slidingMaximum(A, 3);
    System.out.println(a);
  }


  public static ArrayList<Integer> slidingMaximum(final int[] A, int B) {
    PriorityQueue<Pair> pq = new PriorityQueue<>();
    int n = A.length;
    ArrayList<Integer> res = new ArrayList<>();
    int w = -1;
    for (int i = 0; i < n; i++) {
      pq.add(new Pair(i, A[i]));
      if (i >= B - 1) {
        w++;
        while (!pq.isEmpty() && pq.peek().index < w)
          pq.poll();
        res.add(pq.peek().value);
      }
    }
    if (n < B) res.add(pq.peek().value);
    return res;
  }
}

class Pair implements Comparable<Pair> {
  int index, value;

  Pair(int a, int b) {
    index = a;
    value = b;
  }

  @Override
  public int compareTo(Pair p) {
    if (this.value > p.value) return -1;
    if (this.value == p.value) {

      if (this.index > p.index) return 1;
      else return -1;
    } else return 1;
  }

}
