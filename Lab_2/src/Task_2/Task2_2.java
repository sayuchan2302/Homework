package Task_2;

public class Task2_2 {
	public static void drawPyramid_1(int n) {
		draw_1(n, 1);
	}

	public static void draw_1(int n, int row) {
		if (n == 0) {
			return;
		}
		for (int i = 0; i < n - 1; i++) {
			System.out.print(" ");
		}
		for (int j = 0; j < (2 * row) - 1; j++) {
			System.out.print(row);

		}
		System.out.println();
		draw_1(n - 1, row + 1);
	}

	public static void drawPyramid_2(int n) {
		draw_2(n, 1);
	}

	public static void draw_2(int n, int row) {
		if (n == 0)
			return;
		for (int i = 0; i < n - 1; i++) {
			System.out.print(" ");
		}
		for (int j = 1; j <= 2 * row - 1; j++) {
			System.out.print(j);
		}
		System.out.println();
		draw_2(n - 1, row + 1);

	}

	public static void drawPyramid_3(int n) {
		draw_3(n, 1);
	}

	public static void draw_3(int n, int row) {
		if (n == 0) {
			return;
		}
		for (int i = 0; i < n - 1; i++) {
			System.out.print(" ");
		}
		for (int j = 0; j < (2 * row) - 1; j++) {
			System.out.print("*");

		}
		System.out.println();
		draw_3(n - 1, row + 1);
	}

	public static void drawPyramid_4(int n) {
		draw_4(n, 1);
	}

	public static void draw_4 (int n , int row) {
		if (n ==0) return ;
		for (int i = 0 ; i < n -1 ; i ++) {
			System.out.print(" ");
		}
		for (int i = 1 ; i <= 2*row -1 ; i ++) {
			if ( i == 2*row -1) {
				System.out.print(1);
			}else {
				System.out.print(i);
			}
		}
		System.out.println();
		draw_4(n-1, row+1);
	}

	public static void main(String[] args) {
		// drawPyramid_1(9);
		drawPyramid_4(5);
	}
}
