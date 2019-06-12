package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utility {

   public static ArrayList<Integer> getIntList(){
       Integer[] a= {3, 30, 34, 5, 9};
       ArrayList<Integer> list = new ArrayList<>();
       for (int i = 0; i < a.length ; i++) {
           list.add(a[i]);
       }
       return list;
   }

}
