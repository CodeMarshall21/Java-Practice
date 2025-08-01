package com.A11_StringsAndStringBuilder;

public class StringBuilderPractice {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char letter = (char)('a' + i);
            stringBuilder.append(letter);   // No new objects created everytime
        }

        System.out.println(stringBuilder);  // Try out many functions in StringBuilder class using it's object
    }
}
