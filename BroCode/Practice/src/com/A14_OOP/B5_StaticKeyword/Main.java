package com.A14_OOP.B5_StaticKeyword;

public class Main {
    public static void main(String[] args) {
        // static = Modifies a variable or method belong to the class,
        //               rather than to any specific object.
        //               Commonly used for utility methods or shared resources.

        Friends friend1 = new Friends("spongebob");
        Friends friend2 = new Friends("patric");
        Friends friend3 = new Friends("squidward");
        Friends friend4 = new Friends("krab");
        Friends friend5 = new Friends("sandy");

        Friends.showNumberOfFriends(); //no need to use object to call static keyword
    }
}
