import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test
    public void testFibonacciOf1() {
        assertEquals(1, Fibonacci.calculate(1));
    }

    @Test
    public void testFibonacciOf2() {
        assertEquals(1, Fibonacci.calculate(2));
    }

    @Test
    public void testFibonacciOf3() {
        assertEquals(2, Fibonacci.calculate(3));
    }

    @Test
    public void testFibonacciOf5() {
        assertEquals(5, Fibonacci.calculate(5));
    }

    @Test
    public void testFibonacciOf10() {
        assertEquals(55, Fibonacci.calculate(10));
    }

    @Test
    public void testFibonacciForInvalidInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Fibonacci.calculate(0);
        });
        assertEquals("n must be greater than 0", exception.getMessage());
    }
}
