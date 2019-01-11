import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        assertEquals(2, Fibonacci.getNthFib(4));
    }

}