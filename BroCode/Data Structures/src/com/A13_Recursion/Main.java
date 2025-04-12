package com.A13_Recursion;

public class Main {
    public static void main(String[] args) {
        // recursion = When a thing is defined in terms of itself. - Wikipedia
        //			   Apply the result of a procedure, to a procedure.
        //			   A recursive method calls itself. Can be a substitute for iteration.
        //			   Divide a problem into sub-problems of the same type as the original.
        //			   Commonly used with advanced sorting algorithms and navigating trees

        //			   Advantages
        //			   ----------
        //			   easier to read/write
        //			   easier to debug

        //			   Disadvantages
        //			   ----------
        //			   sometimes slower
        //			   uses more memory


        walk(10);
        System.out.println(fibonacci(10));
        System.out.println(factorial(5));
        System.out.println(power(2,10));
    }

    public static void walk(int step){
        if (step < 1){
            System.out.println("You finished walking");
            return;
        }
        System.out.println("You took a step");
        walk(step-1);
    }

    public static int fibonacci(int num){
        if (num <= 1){
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static int factorial(int num){
        if (num < 1){
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static int power(int base, int exponent){
        if (exponent < 1){
            return 1;
        }
        return base * power(base, exponent - 1);
    }
}
