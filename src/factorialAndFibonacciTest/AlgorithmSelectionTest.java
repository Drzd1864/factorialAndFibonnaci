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
    public void testAlgorithmSelectionFibonacci() {
        int[] expected = {120};
        int[] actual = new AlgorithmSelection().choseFibonacciOrFactorial(2, 1, 5);
        assertArrayEquals(expected, actual);
    }
    @Test()
    public void testAlgorithmSelectionFactorial() {
        int[] expected = {0,1,1};
        int[] actual = new AlgorithmSelection().choseFibonacciOrFactorial(1,1,3);
        assertArrayEquals(expected, actual);
    }
}