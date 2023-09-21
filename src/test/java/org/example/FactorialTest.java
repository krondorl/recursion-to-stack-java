package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void getFactorialRecursiveByThree() {
        int expected = 6;
        int actual = Factorial.getFactorialRecursive(3);

        assertEquals(expected, actual);
    }

    @Test
    void getFactorialRecursiveBySix() {
        int expected = 720;
        int actual = Factorial.getFactorialRecursive(6);

        assertEquals(expected, actual);
    }

    @Test
    void getFactorialStackByThree() {
        int expected = 6;
        int actual = Factorial.getFactorialStack(3);

        assertEquals(expected, actual);
    }

    @Test
    void getFactorialStackBySix() {
        int expected = 720;
        int actual = Factorial.getFactorialStack(6);

        assertEquals(expected, actual);
    }
}