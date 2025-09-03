package com.April.Palindrome;
/*
1. Ignore Case Sensitivity. -> "Aa" => "Palindrome"
2. Ignore All Non-Alphabetic Characters -> "@abcba#" => "Palindrome"
5. Ignore spaces - Skip ' ' characters -> " abcba" => "Palindrome"
 */
public class Main {
    public static void main(String[] args) {
        String str = "mAlaYalaM";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str){
        int leftPointer = 0;
        int rightPointer = str.length() - 1;
        str = str.toLowerCase();

        while (leftPointer <= rightPointer){
            if(str.charAt(rightPointer) != str.charAt(leftPointer)){
                return false;
            }
            leftPointer++;
            rightPointer--;
        }

        return true;
    }
}
