package factorialAndFibonacci;

public class AlgorithmSelection {
    public int choseFibonacciOrFactorial(int algorithmId, int loopType, int n) {
        if (algorithmId == 1) {
            return new Fibonacci().chooseFibonacсiLoop(loopType, n);
        }
        if (algorithmId == 2) {
            return new Factorial().chooseFactorialLoop(loopType, n);
        }
        throw new IllegalArgumentException("Incorrect value, enter a number from 1 to 2");
    }
}