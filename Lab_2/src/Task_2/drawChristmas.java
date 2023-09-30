package Task_2;

public class drawChristmas {
    private static void chris(int n) {
        if (n <= 0) {
            return;
        } else {
            chris(n - 1);
            triangle(n);
        }
    }

    private static void triangle(int n) {
        triangleHelper(n, 0, n - 1);
    }

    private static void triangleHelper(int n, int row, int spaces) {
        if (row >= n) {
            return;
        }

        printSpaces(spaces);
        printXs(row * 2 + 1);

        System.out.println();

        triangleHelper(n, row + 1, spaces - 1);
    }

    private static void printSpaces(int count) {
        if (count <= 0) {
            return;
        }

        System.out.print(" ");

        printSpaces(count - 1);
    }

    private static void printXs(int count) {
        if (count <= 0) {
            return;
        }

        System.out.print("X");

        printXs(count - 1);
    }

    public static void main(String[] args) {
        chris(3);
    }
}
