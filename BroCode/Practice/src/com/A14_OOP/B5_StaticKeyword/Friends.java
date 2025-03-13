package com.A14_OOP.B5_StaticKeyword;

public class Friends {
    static int numberOfFriends = 0 ; // STATIC VARIABLE
    String name;

    Friends(String name){
        this.name = name;
        numberOfFriends ++;
    }

    static void showNumberOfFriends(){ // STATIC FUNCTION
        System.out.println("you have "+numberOfFriends+" friends");
    }
}
