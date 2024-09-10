import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input number n to get the n'th Fibonacci number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        try {
            line = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int n = Integer.parseInt(line);
        int fib = Fibonacci.calculate(n);

        System.out.printf("The %d Fibonacci number is %d%n", n, fib);
    }
}
