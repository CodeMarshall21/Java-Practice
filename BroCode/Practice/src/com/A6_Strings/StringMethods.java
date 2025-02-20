package com.A6_Strings;

public class StringMethods {
    public static void main(String[] args) {
        String string =  "Hello World";

        System.out.print(string.length());
        System.out.print(string.charAt(3));
        System.out.print(string.indexOf('W'));
        System.out.print(string.lastIndexOf('o'));

        String upper = string.toUpperCase();
        System.out.print(upper);
        String lower = string.toLowerCase();
        System.out.print(lower);
        String trim = string.trim();
        System.out.print(trim);
        String replaced = string.replace('r','s');
        System.out.print(replaced);

        String name = "this IS Java";
        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello " + name);
        }

        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name DOESN'T contain any spaces");
        }

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }

    }
}
