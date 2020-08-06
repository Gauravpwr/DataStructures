package string;

public class MatchHackerrank {
    public static void main(String[] args) {
        char[] a = "hackerrank".toCharArray();
        char[] b = "hereiamstackerankk".toCharArray();
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (b[j] == a[i]) {
                i++;
            }
            j++;
        }
        if (i == a.length)
            System.out.println("yes");
        else
            System.out.println("no");
    }


}
