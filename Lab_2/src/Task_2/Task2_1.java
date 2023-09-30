package Task_2;

public class Task2_1 {
	public static void drawPyramid(int n) {
		drawhelper(n, 1);
	}

	private static void drawhelper(int n, int row) {
		if (n == 0) {
			return;
		}
//		// in khoang trang
//		for (int i = 0; i < n - 1; i++) {
//			System.out.print(" ");
//		}
		printSpace(n-1);
//		// in dau X
//		for (int i = 0; i < (2 * row) - 1; i++) {
//			System.out.print("X");
//		}
		printData(2*row -1);
		// xuong hang khi in moi dong
		System.out.println();

		drawhelper(n - 1, row + 1);
	}

	public static void printData(int n) {
		if (n <= 0)
			return;
		System.out.print("*");
		printData(n - 1);
	}

	public static void printSpace(int n) {
		if (n <= 0)
			return;
		System.out.print(" ");
		printSpace(n - 1);
	}

	public static void main(String[] args) {
		drawPyramid(5);
	}
}
