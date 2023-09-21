package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    @Test
    void getSumRecursiveByThree() {
        int expected = 6;
        int actual = Sum.getSumRecursive(3);

        assertEquals(expected, actual);
    }

    @Test
    void getSumRecursiveBySix() {
        int expected = 21;
        int actual = Sum.getSumRecursive(6);

        assertEquals(expected, actual);
    }

    @Test
    void getSumStackByThree() {
        int expected = 6;
        int actual = Sum.getSumStack(3);

        assertEquals(expected, actual);
    }

    @Test
    void getSumStackBySix() {
        int expected = 21;
        int actual = Sum.getSumStack(6);

        assertEquals(expected, actual);
    }
}