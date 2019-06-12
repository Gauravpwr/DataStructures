public class MaximumAbsoluteDiff {
	public static void main(String[] args) {
		int[] a = { 1, 3, -1 };
		int max = maxAbsoluteDiffEfficient(a);
		System.out.println(max);
	}

	private static int maxAbsoluteDiffBasic(int[] a) {
		int max = 0;
		int diff = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				diff = Math.abs(a[i] - a[j]) + Math.abs(i - j);
				if (max < diff)
					max = diff;
			}
		}
		return max;
	}

	// f = |a[i]-a[j]| + |i-j|
	// 1 f = a[i] + i - (a[j]+j)
	// 1 f = a[i] + i - (a[j]+j)
	// 1 f = a[i] + i - (a[j]+j)
	// 1 f = a[i] + i - (a[j]+j)
	private static int maxAbsoluteDiffEfficient(int[] a) {
		int max = 0;
		int max1 = 0,min1 = 0,max2 = 0,min2 = 0;
		int diff = 0;
		for (int i = 0; i < a.length; i++) {
			max1 = Math.max(max1,a[i]+i);
			min1 = Math.min(min1,a[i]+i);
			max2 = Math.max(max2,a[i]-i);
			min2 = Math.min(min2,a[i]-i);
		}
		max = Math.max((max1-min1), (max2-min2));
		return max;
	}
}
