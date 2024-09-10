public class Fibonacci {

    public static int calculate(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Fibonacci is not defined for numbers less than 1.");
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return calculate(n - 1) + calculate(n - 2);
        }
    }

    public static int calculateIterative(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Fibonacci is not defined for numbers less than 1.");
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        int a = 1, b = 1, fib = 1;
        for (int i = 3; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }
}

