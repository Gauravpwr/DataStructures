public class KadaneAlgo {
	// Max sum of contiguous sub array
	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int maxLocalSum = 0;
		int maxGlobalSum = 0;

		for (int i = 0; i < a.length; i++) {
			maxLocalSum = maxLocalSum + a[i]; // this will give sum of whole
												// array if not reset
			// as negative numbers will reduce sum of contiguous array we will
			// ignore sum if its less than 0
			if (maxLocalSum < 0)
				maxLocalSum = 0; // we are ignoring negative sum
			if (maxLocalSum > maxGlobalSum)
				maxGlobalSum = maxLocalSum; // we will preserve maxLocalSum if
											// it come in first part of array
											// and after words contiguous sum
											// again becomes less
		}
		System.out.println(maxGlobalSum);
	}
}
