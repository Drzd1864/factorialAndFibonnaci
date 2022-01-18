package factorialAndFibonacci;


public class Factorial {
    public int[] chooseFactorialLoop(int loopType, int n) {
        if (loopType == 1) {
            return getFactorialWithWhile(n);
        }
        if (loopType == 2) {
            return getFactorialWithDoWhile(n);
        }
        if (loopType == 3) {
            return getFactorialWithFor(n);
        }
        throw new IllegalArgumentException("Incorrect value, enter a number from 1 to 3");
    }

    public static int[] getFactorialWithWhile(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Incorrect value, enter a number >0");
        }
        if (number == 0) {
            return new int[]{1};
        }
        int[] factorial = {1};
        while (number > 0) {
            factorial[0] *= number;
            number--;
        }
        return factorial;
    }

    public static int[] getFactorialWithDoWhile(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Incorrect value, enter a number >0");
        }
        if (number == 0) {
            return new int[]{1};
        }
        int[] factorial = {1};
        do {
            factorial[0] *= number;
            number--;
        }
        while (number > 0);
        return factorial;
    }

    public static int[] getFactorialWithFor(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Incorrect value, enter a number >0");
        }
        if (number == 0) {
            return new int[]{1};
        }
        int[] factorial = {1};
        for (int i = 1; i <= number; i++) {
            factorial[0] *= i;
        }
        return factorial;
    }
}



