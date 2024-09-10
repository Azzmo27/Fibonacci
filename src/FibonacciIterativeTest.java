import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciIterativeTest {

    @Test
    public void testFibonacciOf1() {
        assertEquals(1, Fibonacci.calculateIterative(1));
    }

    @Test
    public void testFibonacciOf2() {
        assertEquals(1, Fibonacci.calculateIterative(2));
    }

    @Test
    public void testFibonacciOf3() {
        assertEquals(2, Fibonacci.calculateIterative(3));
    }

    @Test
    public void testFibonacciOf5() {
        assertEquals(5, Fibonacci.calculateIterative(5));
    }

    @Test
    public void testFibonacciOf10() {
        assertEquals(55, Fibonacci.calculateIterative(10));
    }

    @Test
    public void testFibonacciForInvalidInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Fibonacci.calculateIterative(0);
        });
        assertEquals("Fibonacci is not defined for numbers less than 1.", exception.getMessage());
    }
}
