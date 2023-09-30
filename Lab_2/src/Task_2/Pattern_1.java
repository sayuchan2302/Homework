package Task_2;

public class Pattern_1 {
	public static void pattern_1(int n) {
		helper(n, 1);
	}

	public static void helper(int n, int row) {
		if (n <= 0)
			return;
		printSpace(n - 1);
		printData(row, row);
		System.out.println();
		helper(n - 1, row + 1);
	}

	public static void printSpace(int count) {
		if (count <= 0)
			return;
		System.out.print(" ");
		printSpace(count - 1);
	}

	public static void printData(int count, int row) {
		if (count <= 0)
			return;
		printData(count - 1, row);
		System.out.print(" ");
		System.out.print(row);
	}

	public static void main(String[] args) {
		pattern_1(9);
	}
}
