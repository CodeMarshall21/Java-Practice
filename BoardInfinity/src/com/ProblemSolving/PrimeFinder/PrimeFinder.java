package com.ProblemSolving.PrimeFinder;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr= new ArrayList<>();


        System.out.print("arr: ");
        String val = in.nextLine();

        for (String ch: val.trim().split(" ")){
            if (!ch.isEmpty()){
                arr.add(Integer.parseInt(ch));
            }
        }

        System.out.printf("(%d * %d) - 1 = %d",arr.get(0),arr.get(1),solution(arr));
        solution(arr);

    }

    public static int solution(ArrayList<Integer> arr){
        boolean[] primes = new boolean[Math.max(arr.get(0), arr.get(1)) * 20];
        ArrayList<Integer> primeNums = new ArrayList<>();

        primes[0] = primes[1] = true;
        int i = 2;
        while(i*i < primes.length){
            if (!primes[i]){
                for (int j = i*i; j < primes.length; j=j+i) {
                    primes[j] = true;
                }
            }
            i++;
        }
        for (int k = 0; k < primes.length; k++) {
            if(!primes[k]){
                primeNums.add(k);
            }
        }
        return (primeNums.get(arr.get(0)-1)*primeNums.get(arr.get(1)-1)) - 1;

    }
}
