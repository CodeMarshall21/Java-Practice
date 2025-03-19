package com.A15_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        // ArrayList = A resizeable array that stores objects (autoboxing)
        //                     Arrays are fixed in size, but ArrayLists can change
        Scanner in = new Scanner (System.in);
        ArrayList<String> foods = new ArrayList<>();
        int count;
        String food;

        System.out.print("Enter # of food: ");
        count = in.nextInt();

        in.nextLine();

        for (int i = 1; i <= count; i++) {
            System.out.printf("Enter #%d food: ",i);
            food = in.nextLine();
            foods.add(food);
            System.out.printf("foods.add(\"%s\")\n\n",food);
        }

        System.out.println(foods);

        if (foods.size() >= 3){
            foods.set(2,"Hello");
            System.out.println("foods.set(2,\"Hello\") -> "+foods);
        }

        if (foods.size() >= 3){
            System.out.println("foods.get(2) -> "+foods.get(2));
        }


        if (!(foods.isEmpty())){
            foods.remove(1);
            System.out.println("foods.remove(1) -> " + foods);
        }else{
            System.out.println("Already Empty");
        }

        System.out.println("foods.size() -> "+ foods.size());


        Collections.sort(foods);

        System.out.println("Collections.sort(foods) -> "+foods);


        in.close();
    }
}
