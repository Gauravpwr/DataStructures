public class MinimumSteps {
	public static void main(String[] args) {
		int[][] a = { { 4, 6 }, { 1, 2 }, { 4, 5 }, { 10, 12 } };
		int totalSteps = 0;
		for (int i = 0; i < a.length - 1; i++) {
			totalSteps += calculateSteps(a[i], a[i + 1]);
		}
		System.out.println(totalSteps);
	}

	// first go diagonally and then go vertically/horizontally to cover max
	// distance
	// as these steps are equal to maximum of abs(x2-x1) and (y2-y1) so just
	// calculate that
	private static int calculateSteps(int[] p1, int[] p2) {
		return Math.max(Math.abs(p1[0] - p2[0]), Math.abs(p1[1] - p2[1]));
	}
}
