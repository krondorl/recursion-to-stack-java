package org.example;

import java.util.Stack;

public class Fibonacci {
    public static int getFibonacciRecursion(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return getFibonacciRecursion(n - 1) + getFibonacciRecursion(n - 2);
        }
    }

    public static int getFibonacciStack(Integer n) {
        Integer total = 0;
        Stack<Integer> stack = new Stack<>();

        stack.push(n);

        while (!stack.isEmpty()) {
            Integer actualNumber = stack.pop();

            if (actualNumber > 1) {
                stack.push(actualNumber - 2);
                stack.push(actualNumber - 1);
            } else {
                total += actualNumber;
            }
        }

        return total;
    }
}
