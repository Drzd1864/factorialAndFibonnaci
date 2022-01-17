package factorialAndFibonacciTest;

import factorialAndFibonacci.Factorial;
import factorialAndFibonacci.Fibonacci;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void testGetFibonacсiWithWhile() {
        int[] expected = {0,1,1,2,3,5};
        int[] actual = new Fibonacci().getFibonacсiWithWhile(6);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetFibonacсiWithWhileNumberOne() {
        int[] expected = {0};
        int[] actual = new Fibonacci().getFibonacсiWithWhile(1);
        assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFibonacсiWithWhileNegativeNumber() {
        new Fibonacci().getFibonacсiWithWhile(-3);
    }

    @Test
    public void testGetFibonacсiWithDoWhile() {
        int[] expected = {0,1,1,2,3};
        int[] actual = new Fibonacci().getFibonacсiWithDoWhile(5);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetFibonacсiWithDoWhileNumberOne() {
        int[] expected = {0};
        int[] actual = new Fibonacci().getFibonacсiWithDoWhile(1);
        assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFibonacсiWithDoWhileNegativeNumber() {
        new Fibonacci().getFibonacсiWithDoWhile(-8);
    }

    @Test
    public void testGetFibonacсiWithFor() {
        int[] expected = {0,1,1,2};
        int[] actual = new Fibonacci().getFibonacсiWithFor(4);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetFibonacсiWithForNumberOne() {
        int[] expected = {0};
        int[] actual = new Fibonacci().getFibonacсiWithFor(1);
        assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFibonacсiWithForNegativeNumber() {
        new Fibonacci().getFibonacсiWithFor(-7);
    }
}
