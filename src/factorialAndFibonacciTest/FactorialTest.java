package factorialAndFibonacciTest;

import factorialAndFibonacci.Factorial;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void testGetFactorialWithWhilePositiveNumber() {
        int[] expected = {120};
        int[] actual = Factorial.getFactorialWithWhile(5);
        assertArrayEquals(expected, actual);
    }

    @Test()
    public void testGetFactorialWithWhileZeroNumber() {
        int[] expected = {1};
        int[] actual = Factorial.getFactorialWithWhile(0);
        assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialWithWhileNegativeNumber() {
        Factorial.getFactorialWithWhile(-3);
    }

    @Test
    public void testGetFactorialWithDoWhile() {
        int[] expected = {24};
        int[] actual = Factorial.getFactorialWithDoWhile(4);
        assertArrayEquals(expected, actual);
    }

    @Test()
    public void testGetFactorialWithDoWhileZeroNumber() {
        int[] expected = {1};
        int[] actual = Factorial.getFactorialWithDoWhile(0);
        assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialWithDoWhileNegativeNumber() {
        Factorial.getFactorialWithDoWhile(-4);
    }

    @Test
    public void testGetFactorialWithFor() {
        int[] expected = {6};
        int[] actual = Factorial.getFactorialWithFor(3);
        assertArrayEquals(expected, actual);
    }

    @Test()
    public void testGetFactorialWithForZeroNumber() {
        int[] expected = {1};
        int[] actual = Factorial.getFactorialWithFor(0);
        assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialWithForNegativeNumber() {
        Factorial.getFactorialWithFor(-5);
    }
}