package array;

import java.util.HashMap;

public class SumPair {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        findPair(arr, target);


    }

    private static void findPair(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int temp = target - arr[i];
            if (map.containsKey(temp)) {
                int index = map.get(temp);
                System.out.println("target sum can be achieved with " + index + " & " + i);
                break;
            }
            map.put(arr[i],i);
        }

    }
}
