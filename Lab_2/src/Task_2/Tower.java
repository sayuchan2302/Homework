package Task_2;

public class Tower {
    public static void drawPyramid(int n) {
        helper(n, 1);
    }

    public static void helper(int n, int row) {
        if (n == 0)
            return;
        whiteSpace(n - 1);
        printX(row);
        System.out.println();
        helper(n - 1, row + 1);
    }

    public static void whiteSpace(int n) {
        if (n == 0)
            return;
        whiteSpace(n - 1);
        System.out.print(" ");
    }

    public static void printX(int row) {
        if (row == 0)
            return;
        printX(row - 1);
        System.out.print("X");
    }

    public static void main(String[] args) {
        drawPyramid(5);
    }
}