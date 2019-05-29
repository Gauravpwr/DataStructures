import java.util.ArrayList;
import java.util.List;

public class AddOneToNumber {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(9);
		a.add(9);
		a.add(9);
		int n = a.size();
		int carry = 0;
		for (int i = n - 1; i >= 0; i--) {
			if ((a.get(i) + 1) < 10) {
				a.set(i, a.get(i) + 1);
				carry = 0;
			} else {
				a.set(i, 0);
				carry = 1;
			}
			if (carry == 0)
				break;
		}
		if (carry == 1) {
			a.add(0, 1);
		}
		System.out.println(a);
	}
}
