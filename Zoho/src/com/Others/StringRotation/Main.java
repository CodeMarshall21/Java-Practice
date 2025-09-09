package com.Others.StringRotation;


/*
                        Check Rotation of a String
                        Description:
                        Given two strings s1 and s2 , check if s2 is a rotation of s1
                        Note: it only allows circular shifting of characters (clockwise)

                        s1 = "abcd"
                        s2 = "bcda"
                        Output - True

*/

public class Main {
    public static void main(String[] args) {
        String str1 = "abcd" , str2 = "bca";
        System.out.println(isRotated(str1,str2));
    }
    private static boolean isRotated(String str1, String str2){
        return str2.length() == str1.length() && (str1 + str2).contains(str2);
    }
}
