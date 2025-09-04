package com.April.NonRepeatingChar;


/*
        First Non-Repeating Character in a String

        Conditions
        1. If no such character exists, return -1. ->  Input: "codeitcodeit" Output: -1
        2. The comparison is case-sensitive. -> Input: "Codeitcodeit" Output: 'C'
        3. Special characters and symbols are also counted. -> Input: "codeit@*codeit@" Output: '*'

        Constraints :-
            Time complexity: O(n)
            Space complexity: O(1)
*/

public class Main {
    public static void main(String[] args) {
        String[] testCases = {
                "codeitcodeit",       // expected -1 (all repeat)
                "Codeitcodeit",       // expected 'C' (case-sensitive)
                "codeit@*codeit@",    // expected '*' (symbols counted)
                "aabbccdeeff",        // expected 'd' (first non-repeating)
                "a",                  // expected 'a' (single char)
                "",                   // expected -1 (empty string)
                "1122334455667",      // expected '7' (digits included)
                "!!@@##$$",           // expected -1 (all repeat symbols)
                "xyzxyzp",            // expected 'p' (last char unique)
                "zzzzzzzz",           // expected -1 (all same char)
                "JavaJ",              // expected 'a' (case-sensitive, first unique)
                "AaBbCcDd",           // expected 'A' (first one-off char)
                "   ",                // expected -1 (spaces repeated)
                "a b a",              // expected 'b' (space repeats, 'b' is unique)
        };

        for(String str: testCases){
            System.out.println("Input: " + str);
            System.out.println("Output: " + firstNonRepeatingChar(str));
            System.out.println("-------------------------------------------");
        }
    }

    private static Character firstNonRepeatingChar(String str){
        if(str.length() == 0){
            return null;
        }

        int[] count = new int[256];     //Because the ASCII character set has 256 characters

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)] += 1;
        }

        for (int i = 0; i < str.length(); i++) {
            if(count[str.charAt(i)] == 1){
                return str.charAt(i);
            }
        }
        return null;
    }
}
