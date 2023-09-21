package org.example;

import java.util.Stack;

public class Factorial {
    public static int getFactorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * getFactorialRecursive(n - 1);
        }
    }

    public static int getFactorialStack(int n) {
        Integer total = 1;
        Stack<Integer> stack = new Stack<>();

        stack.push(n + 1);

        while (!stack.isEmpty()) {
            Integer actualNumber = stack.pop();

            if (actualNumber == 0 || actualNumber == 1) {
                total *= 1;
            } else {
                total *= actualNumber - 1;
                stack.push(actualNumber - 1);
            }
        }

        return total;
    }
}
