package com.April.LongestSubstringWithoutRepeatingCharacters;

/*
            Longest Substring Without Repeating Characters

            Conditions
            1. Return the length of the longest substring without repeating characters.
            2. The comparison is case-sensitive.
            3.All characters, including special characters, are considered.
*/

public class Main {
    public static void main(String[] args) {
        String[] testCases = {
                "",                   // expected 0 (empty string)
                "a",                  // expected 1 (single char)
                "abcabcbb",           // expected 3 ("abc")
                "bbbbb",              // expected 1 ("b")
                "pwwkew",             // expected 3 ("wke")
                "abcdef",             // expected 6 (all unique)
                "aab",                // expected 2 ("ab")
                "dvdf",               // expected 3 ("vdf")
                "anviaj",             // expected 5 ("nviaj")
                "AaBbCc",             // expected 6 (case-sensitive, all unique)
                "CodeItCodeIt",       // expected 6 ("CodeIt")
                "112233",             // expected 2 ("12")
                "xyz!@#xyz",          // expected 6 ("xyz!@#")
                " ",                  // expected 1 (single space)
                "     ",              // expected 1 (spaces repeated)
                "ab cd ef gh",        // expected 9 ("ab cd ef g")
                "longestsubstring",   // expected 8 ("ubstring")
                "abcABCabcABC",       // expected 6 ("abcABC")
        };

        for(String str: testCases){
            System.out.println("Input: "+ str);
            System.out.println("Output: "+ longestNonRepeatingSubstring(str));
            System.out.println("--------------------------------------------");
        }
    }

    private static int longestNonRepeatingSubstring(String str) {
        int[] lastSeen = new int[256];
        int start = 0;
        int maxLen = 0;
        int strLen = str.length();

        for (int i = 0; i < strLen; i++) {
            if(lastSeen[str.charAt(i)] > start){
                start = lastSeen[str.charAt(i)];
            }
            lastSeen[str.charAt(i)] = i + 1;    // to keep record of "at which position did i see that character ?"
            maxLen = Math.max(maxLen, i+1-start);
        }

        return maxLen;
    }
}
