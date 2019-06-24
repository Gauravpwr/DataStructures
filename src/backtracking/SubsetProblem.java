package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SubsetProblem {
  public static void main(String[] args) {
    Integer[] a1 = {1,2,3};
//    iterate(a,0);
    ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3));
    ArrayList<ArrayList<Integer>> subsets = subsets(a);

    System.out.println(subsets);
  }

  static void iterate(int[] a, int i){
    if(i == a.length){
     return;
    }else{
      System.out.println(a[i]);
      iterate(a,i+1);
    }
  }

  public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
    ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
    output.add(new ArrayList<Integer>());
    if (a.size() == 0)
      return output;
    Collections.sort(a);
    generate(a, output, new ArrayList<Integer>(), 0);
    return output;
  }

  public static void generate(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> output, ArrayList<Integer> temp, int index)
  {
    System.out.println(index);
    for (int i = index; i < a.size(); i++)
    {
      System.out.println(i);
      System.out.println(a.get(i));
      temp.add(a.get(i));
      System.out.println(temp);
      output.add(new ArrayList<Integer>(temp));
      System.out.println(output);
      generate(a, output, temp, i+1);
      System.out.println(index);
      temp.remove(temp.size() - 1);
      System.out.println(temp);
    }
  }
}
