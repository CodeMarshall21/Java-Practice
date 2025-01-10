package com.keshav;

public class TypeCasting {
    public static void main(String[] args) {
        float a = 10;
        System.out.println(a);
//        invalid conversion
//        int val = 45.66f;
//        System.out.println(a);

        int val = (int)(56.98f);
        System.out.println(val);

//        type promottion done by java
        int num = 256;
        byte b = (byte)(num);
        System.out.println(b); //prints out 256%256

        byte bite = 5;
//        bite = bite*5; //error -> byte promoted into int as '5' is int
        bite = (byte) (bite*5); //resolved

        float five = 5 * 34.4f;
        System.out.println(five); //prints out 172.0

        int character = 's' * 3;
        System.out.println(character); //345


        
    }
}
