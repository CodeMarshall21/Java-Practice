package com.A9_InterpolationSearch;

import java.util.*;

public class InterpolationSearch {
    public static void main(String[] args) {
        //interpolation search =  improvement over binary search best used for "uniformly" distributed data
        //					     "guesses" where a value might be based on calculated probe results
        //				             if probe is incorrect, search area is narrowed, and a new probe is calculated

        //						  average case: O(log(log(n)))
        //						  worst case: O(n) [values increase exponentially]

        int[] array = new int[10];
        Scanner in = new Scanner(System.in);


//        for (int i = 0; i < 10; i++) {                      //SMALLER GAP TAKES LESSER PROBES
//            array[i] = i;
//        }
        for (int i = 0; i < 10; i++) {                        //LARGER GAP TAKES MORE PROBES
            array[i] = (int)Math.pow(2,i);
        }

        System.out.println(Arrays.toString(array));

        System.out.print("Value to search: ");
        int value  = in.nextInt();


        int index = interpolationSearch(array,value);

        if (index != -1){
            System.out.println("Element found at : "+ index);
        }
        else{
            System.out.println("Element not found");
        }

    }

    private static int interpolationSearch(int[] array,int value){
        int low = 0;
        int high = array.length -1 ;


        while(value >= array[low] && value <= array[high] && low <= high){
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);

            System.out.println("Probe: " + probe);

            if (value < array[probe]){
                high = probe - 1;
            }else if(value > array[probe]){
                low = probe + 1;
            }else{
                return probe;
            }
        }


        return -1;


    }
}
