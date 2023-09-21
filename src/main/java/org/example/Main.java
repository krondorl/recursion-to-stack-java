package org.example;

public class Main {
    public static void algorithmPrintLn(String name, int fn) {
        System.out.println("*****");
        System.out.println(name);
        System.out.println(fn);
    }

    public static void main(String[] args) {
        System.out.println("Recursion to stack examples");
        System.out.println("");

        int fibonacciRecursiveFn = Fibonacci.getFibonacciRecursion(6);
        algorithmPrintLn("Fibonacci recursive (6)", fibonacciRecursiveFn);

        int fibonacciStackFn = Fibonacci.getFibonacciStack(6);
        algorithmPrintLn("Fibonacci stack (6)", fibonacciStackFn);

        int factorialRecursiveFn = Factorial.getFactorialRecursive(6);
        algorithmPrintLn("Factorial recursive (6)", factorialRecursiveFn);

        int factorialStackFn = Factorial.getFactorialStack(6);
        algorithmPrintLn("Factorial stack (6)", factorialStackFn);

        int sumRecursiveFn = Sum.getSumRecursive(6);
        algorithmPrintLn("Sum recursive (6)", sumRecursiveFn);

        int sumStackFn = Sum.getSumStack(6);
        algorithmPrintLn("Sum stack (6)", sumStackFn);
    }
}