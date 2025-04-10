package com.A8_BinarySearch;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>() ;
        int target;
        Scanner in = new Scanner(System.in);


        for (int i = 0; i < 100; i++) {
            array.add(i);
        }

        System.out.print("Target: ");
        target = in.nextInt();

        int index = binarySearch(array,target);

        if(index == -1) {
            System.out.println(target + " not found");
        }
        else {
            System.out.println("Element found at: " + index);
        }
    }

    private static int binarySearch(ArrayList array, int target){
        int low = 0;
        int high = array.size() - 1;

        while(low <= high){
            int middle = (high + low) / 2;

            if (target > (Integer)array.get(middle)) low = middle + 1;
            else if (target < middle) high = middle - 1;
            else return middle;
        }


        return -1;
    }
}
