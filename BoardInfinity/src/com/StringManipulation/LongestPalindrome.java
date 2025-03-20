package com.StringManipulation;

import java.util.Arrays;

public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "bababababd";
        String LongestStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0){
                String newStr = expandAroundCenter(str,i,i);
                if (newStr.length() > LongestStr.length()){
                    LongestStr = newStr;
                }

            } if (i % 2 != 0) {
                String newStr = expandAroundCenter(str,i,i+1);
                if (newStr.length() > LongestStr.length()){
                    LongestStr = newStr;
                }
            }

        }

        System.out.println(LongestStr);

    }

    static String expandAroundCenter(String str, int left,int right){
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left --;
            right ++;
        }
        return str.substring(left+1,right);
    }
}
