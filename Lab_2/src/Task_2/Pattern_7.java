package Task_2;

public class Pattern_7 {
	public static void pattern_7(int n) {
		helper(n, 1);
	}

	public static void helper(int n, int row) {
		if (n <= 0)
			return;
		printSpace(row);
		printData(n*2 - 1, n);
		System.out.println();
		helper(n - 1, row + 1);
	}

	public static void printSpace(int count) {
		if (count <= 0)
			return;
		System.out.print(" ");
		printSpace(count - 1);
	}

	public static void printData(int count, int n) {
		if (count <= 0)
			return;
		System.out.print(n);
		printData(count - 1, n);
	}

	public static void main(String[] args) {
		pattern_7(9);
	}
}
