package com.A12_Patterns;

public class PatternThirtyOne {
    public static void main(String[] args) {
        pattern31(5);
    }

    static void pattern31(int n){
        int originalN = n;
        n = 2 * n;
        for (int rows = 0; rows <= n ; rows++) {
            for (int columns = 0; columns <= n; columns++) {
                int numberAtEveryIndex = originalN - min(min(rows,columns), min(n - rows,n-columns));
                System.out.print(numberAtEveryIndex);
            }
            System.out.println();
        }
    }

    static int min(int x, int y){
        if(x > y){
            return y;
        }
        else{
            return x;
        }
    }
}
