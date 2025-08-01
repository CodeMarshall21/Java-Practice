package com.A11_StringsAndStringBuilder;

import java.util.Locale;

public class PalindromeString {
    public static void main(String[] args) {
        String str= "";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        if (str == null || str.isBlank()){
            return false;
        }
        str = str.toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while(start <= end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
}
