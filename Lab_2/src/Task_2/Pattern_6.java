package Task_2;

public class Pattern_6 {
	public static void pattern_6(int n) {
		helper(n, 1);
	}

	public static void helper(int n, int row) {
		if (n <= 0)
			return;
		helper(n - 1, row + 1);
		printSpace(n - 1);
		printData(2 * row - 1);
		System.out.println();
	}

	public static void printSpace(int count) {
		if (count <= 0)
			return;
		System.out.print(" ");
		printSpace(count - 1);
	}

	public static void printData(int count) {
		if (count <= 0)
			return;
		printData(--count);
		System.out.print("*");
	}

	public static void main(String[] args) {
		pattern_6(9);
	}
}
