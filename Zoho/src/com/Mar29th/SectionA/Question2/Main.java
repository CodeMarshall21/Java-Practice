package com.Mar29th.SectionA.Question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Array Size: ");
        int size = in.nextInt();

        int[]array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Element %d: ",i+1);
            array[i] = in.nextInt();
        }

        System.out.print("k: ");
        int k = in.nextInt();

        System.out.println(Arrays.toString(shuffle(array,k)));
        
    }


    static int[] shuffle (int[]array,int k){

        int i = 0;
        int j = k - 1;

        if (k > array.length){
            return reverse(array,i,array.length-1);
        }


        while(true){
            reverse(array,i,j);
            if (j + k <= array.length - 1){
                i = j+1;
                j = i + k - 1;
            }
            else{
                reverse(array,j+1,array.length-1);
                break;
            }
        }
        return array;
    }

    static int[] reverse (int[]array,int left,int right){
        int temp;
        while(left < right){
            temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left ++;
            right --;
        }
        return array;
    }


}



