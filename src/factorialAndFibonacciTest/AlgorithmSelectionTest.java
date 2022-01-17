package factorialAndFibonacciTest;

import factorialAndFibonacci.AlgorithmSelection;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlgorithmSelectionTest {

    @Test(expected = IllegalArgumentException.class)
    public void testIncorrectValueAlgorithmId() {
        new AlgorithmSelection().choseFibonacciOrFactorial(5, 2, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIncorrectValueLoopType() {
        new AlgorithmSelection().choseFibonacciOrFactorial(1, 4, 5);
    }

    @Test()
    public void testAlgorithmSelection() {
        int expected = 120;
        int actual = new AlgorithmSelection().choseFibonacciOrFactorial(2, 2, 5);
        assertEquals(expected, actual);
    }
}