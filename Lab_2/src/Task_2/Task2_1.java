package Task_2;

public class Task2_1 {
	public static void drawPyramid(int n) {
		drawhelper(n, 1);
	}

	private static void drawhelper(int n, int row) {
		if (n == 0) {
			return;
		}
		// in khoang trang
		for (int i = 0; i < n - 1; i++) {
			System.out.print(" ");
		}
		// in dau X
		for (int i = 0; i < (2 * row) - 1; i++) {
			System.out.print("X");
		}
		// xuong hang khi in moi dong
		System.out.println();

		drawhelper(n - 1, row + 1);
	}

	public static void main(String[] args) {
		drawPyramid(5);
	}
}
