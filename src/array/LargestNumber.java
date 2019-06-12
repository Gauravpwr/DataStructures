package array;

import java.util.ArrayList;
import java.util.List;

public class LargestNumber {
    public static void main(String[] args) {
        ArrayList l = Utility.getIntList();
        System.out.println(l);
        String largestNumber = largestNumber(l);
        System.out.println(largestNumber);
    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static String largestNumber(ArrayList<Integer> a) {
        String largestNumber = "";
        for (int j = a.size() - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                String xy = "" + a.get(i) + a.get(i + 1);
                String yx = "" + a.get(i + 1) + a.get(i);
                if (Integer.valueOf(xy) < Integer.valueOf(yx)) {
                    a.set(i, getItself(a.get(i + 1), a.set(i + 1, a.get(i))));
                }
            }
        }
        for(Integer i:a){
            largestNumber+=i;
        }
        return largestNumber;
    }

    public static int getItself(int itself, int dummy) {
        return itself;
    }
}
