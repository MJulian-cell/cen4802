public class Fibonacci {
    public static void main(String[] args) {
        // The first ten fibonacci numbers
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        // The fibonacci is used to generate a sequence where each number is the sum of the
        // proceeding ones.
        //The n is the number to calculate the fibonacci.
        // The return of line 18 uses the recursive technique calling itself
        // The return of line 16 allows the recursive technique to stop.
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}