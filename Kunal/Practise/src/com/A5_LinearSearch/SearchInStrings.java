package com.A5_LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "keshav";
        char target = 'm';

        boolean isAvail = Search(name, target);

        if (isAvail){
            System.out.printf("%c is available in %s",target,name);
        }else{
            System.out.printf("%c is NOT available in %s",target,name);
        }
    }

    static boolean Search (String arr, char target){

        if (arr.isEmpty()){
            return false;
        }

        for (int charIndex = 0; charIndex < arr.length(); charIndex++) {
            if(arr.charAt(charIndex) == target){
                return true;
            }
        }

        return false;
    }
}
