public class Fibonacci {
    public static int calculate(int n) throws IllegalArgumentException {
        if (n < 1) {
            throw new IllegalArgumentException("n must be greater than 0.");
        }
        else if (n == 1 || n == 2) {
            return 1;
        } else {
            return calculate(n - 1) + calculate(n - 2);
        }
    }
}

