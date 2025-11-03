package com.practise.question_2;

public class Main {
    public static void main(String[] args) {

        System.out.println(gcdWithoutRecursion(70,15));

    }
    public static int gcdWithoutRecursion(int m, int n){
        while(m != n){
            if (m > n){
                m -= n;
            }else{
                n -= m;
            }
        }

        return m;
    }
}
