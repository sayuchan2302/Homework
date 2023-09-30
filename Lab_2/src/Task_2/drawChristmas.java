package Task_2;

public class drawChristmas {
	public static void Christmas(int n) {
		if (n <= 0)
			return;
		Christmas(n-1);
		pattern_4(n);
	}

	public static void pattern_4(int n) {
		helper(n, 1);
	}

	public static void helper(int n, int row) {
		if (n <= 0)
			return;
		printWhiteSpace(n - 1);
		printData1(row*2-1);
		System.out.println();
		helper(n - 1, row + 1);
	}

	public static void printWhiteSpace(int count) {
		if (count <= 0)
			return;
		System.out.print(" ");
		printWhiteSpace(count - 1);
		;
	}

	public static void printData1(int count) {
		if (count <= 0)
			return;
		printData1(count - 1);
		System.out.print("*");
	}

	public static void main(String[] args) {
		Christmas(5);
	}
}
