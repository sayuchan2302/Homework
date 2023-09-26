package Task_1;

public class Fibonacci {
    // Lấy giá trị thứ n trong dãy Fibonacci
    public static int getFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
    
    // Phương thức này được sử dụng để in dãy Fibonacci dựa trên tham số n
    public static void printFibonacci(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(getFibonacci(i) + " ");
        }
    }
    
    public static void main(String[] args) {
        int n = 10;
        
        System.out.println("Giá trị Fibonacci thứ " + n + " là: " + getFibonacci(n));
        
        System.out.println("Dãy Fibonacci cho " + n + " số là: ");
        printFibonacci(n);
    }
}