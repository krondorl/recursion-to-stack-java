package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

class FibonacciTest {
    // Fibonacci series example
    // 0, 1, 1, 2, 3, 5, 8, 13, 21 ...

    @Test
    void getFibonacciRecursionByOne() {
        int expected = 1;
        int actual = Fibonacci.getFibonacciRecursion(1);

        assertEquals(expected, actual);
    }

    @Test
    void getFibonacciRecursionByFour() {
        int expected = 3;
        int actual = Fibonacci.getFibonacciRecursion(4);

        assertEquals(expected, actual);
    }

    @Test
    void getFibonacciRecursionBySix() {
        int expected = 8;
        int actual = Fibonacci.getFibonacciRecursion(6);

        assertEquals(expected, actual);
    }

    @Test
    void getFibonacciStackByTwo() {
        int expected = 1;
        int actual = Fibonacci.getFibonacciStack(2);

        assertEquals(expected, actual);
    }

    @Test
    void getFibonacciStackByFour() {
        int expected = 3;
        int actual = Fibonacci.getFibonacciStack(4);

        assertEquals(expected, actual);
    }

    @Test
    void getFibonacciStackBySix() {
        int expected = 8;
        int actual = Fibonacci.getFibonacciStack(6);

        assertEquals(expected, actual);
    }
}