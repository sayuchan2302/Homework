package Task_2;

public class Pattern_2 {
	public static void pattern_2(int n) {
		helper(n, 1);
	}

	public static void helper(int n, int row) {
		if (n <= 0)
			return;
		printSpace(n - 1);
		printData(row);
		System.out.println();
		helper(n - 1, row + 1);
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
		printData(count - 1);
		System.out.print(count);
		System.out.print(" ");
	}

	public static void main(String[] args) {
		pattern_2(9);
	}
}
