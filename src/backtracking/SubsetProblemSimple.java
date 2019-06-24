package backtracking;

import java.util.Arrays;

public class SubsetProblemSimple {
  public static void main(String[] args) {
    int[] a = {1, 2, 3};
    int n = (int)Math.pow(2,a.length);
    int[][] output = new int[n][];
    int k=0;
    output[k++] = new int[]{};

    //select 1 element from input array
    for (int i = 0; i < a.length; i++) {
      int pick = a[i];
      // add that element to the sets that are already present in output
      int l = k;
      for (int j = 0; j < l; j++) {
        int[] temp = new int[output[j].length+1];
        System.arraycopy(output[j],0,temp,0,output[j].length);
        temp[output[j].length] = pick;
        output[k++]=temp;
      }
    }

    //print matrix
    for (int i = 0; i < output.length; i++) {
      System.out.println(Arrays.toString(output[i]));
    }

  }

}
