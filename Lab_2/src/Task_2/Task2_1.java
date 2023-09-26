package Task_2;

public class Task2_1 {

	public static void drawPyramid(int n) {
		drawPyramidHelper(n, 1);
	}

	public static void drawPyramidHelper(int n, int row) {
		if (n <= 0) {
			return;
		}

		drawPyramidHelper(n - 1, row);

		for (int i = 1; i <= row; i++) {
			System.out.print(" ");
		}
		for (int i = 1; i <= 2 * n - 1; i++) {
			System.out.print("X");
		}
		System.out.println();

		drawPyramidHelper(n - 1, row + 1);
	}
	public static void main(String[] args) {
		drawPyramid(4);
	}
}
