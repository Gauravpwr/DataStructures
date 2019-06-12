package array;

public class PascalTriangle {

    public static void main(String[] args) {
        int n = 5;
        int[][] m = new int[n][];
        m[0] = new int[]{1};
        m[1] = new int[]{1,2,1};
        for (int i = 2; i < n; i++) {
            m[i] = new int[i+2];
            m[i][0] = 1;
            int j=1;
            while (j<i+1){
                m[i][j]=m[i-1][j]+m[i-1][j-1];
                j++;
            }
            m[i][j] = 1;
        }
        printM(m);
    }

    public static void printM(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}
