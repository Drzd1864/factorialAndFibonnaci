package factorialAndFibonacci;


public class Fibonacci {
    public int chooseFibonacсiLoop(int loopType, int n) {
        if (loopType == 1) {
            getFibonacсiWithWhile(n);
        }
        if (loopType == 2) {
            getFibonacсiWithDoWhile(n);
        }
        if (loopType == 3) {
            getFibonacсiWithFor(n);
        }
        throw new IllegalArgumentException("Incorrect value, enter a number from 1 to 3");
    }

    public int[] getFibonacсiWithWhile(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Incorrect value, enter a number >0");
        }
        if (number == 1) {
            return new int[]{0};
        }
        int[] array = new int[number];
        array[0] = 0;
        array[1] = 1;
        int i = 1;
        while (i < array.length - 1) {
            i++;
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    public int[] getFibonacсiWithDoWhile(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Incorrect value, enter a number >0");
        }
        if (number == 1) {
            return new int[]{0};
        }
        int[] array = new int[number];
        array[0] = 0;
        array[1] = 1;
        int i = 1;
        do {
            i++;
            array[i] = array[i - 1] + array[i - 2];
        }
        while (i < array.length - 1);
        return array;
    }

    public int[] getFibonacсiWithFor(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Incorrect value, enter a number >0");
        }
        if (number == 1) {
            return new int[]{0};
        }
        int[] array = new int[number];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }
}


