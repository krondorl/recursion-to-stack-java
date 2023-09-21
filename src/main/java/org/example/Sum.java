package org.example;

import java.util.Stack;

public class Sum {
    public static int getSumRecursive(int n) {
        if (n < 2) {
            return 1;
        } else {
            return n + getSumRecursive(n - 1);
        }
    }

    public static int getSumStack(int n) {
        Integer total = 0;
        Stack<Integer> stack = new Stack<>();

        stack.push(n);

        while (!stack.isEmpty()) {
            Integer actualNumber = stack.pop();

            if (actualNumber == 0 || actualNumber == 1) {
                total += actualNumber;
            } else {
                total += (actualNumber);
                stack.push(actualNumber - 1);
            }
        }

        return total;
    }
}
