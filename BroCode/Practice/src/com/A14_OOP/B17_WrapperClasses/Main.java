package com.A14_OOP.B17_WrapperClasses;

public class Main {
    public static void main(String[] args) {
        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                                   to be used as objects. "Wrap them in an object"
        //                                   Generally, don't wrap primitives unless you need an object.
        //                                   Allows use of Collections Framework and static utility methods.



        // Wrapping primitives into objects are like :-
//        Integer a = new Integer(123); <- 'Integer(int)' is deprecated since version 9 and marked for removal
//        Double b = new Double(12.3);  <- 'Double(double)' is deprecated since version 9 and marked for removal
//        Character c = new Character('@');  <- 'Character(char)' is deprecated since version 9 and marked for removal
//        Boolean d = new Boolean(true);  <- 'Boolean(boolean)' is deprecated since version 9 and marked for removal


        // Autoboxing <- Assigning a primitives to an object using wrapper class
        Integer a = 123;
        Double b = 12.3;
        Character c = '@';
        Boolean d = true;
        String string = "Pizza";


        //Unboxing <- Wrapper class back to its primitive
        int a1 = a;
        double b1 = b;
        char c1 = c;
        boolean d1 = d;


        //Primitive Datatype into String using -> toString()
        String s1 = Integer.toString(123);
        String s2 = Double.toString(12.3);
        String s3 = Character.toString('@');
        String s4 = Boolean.toString(true);
        System.out.println(s1+s2+s3+s4);

        //String to a primitive datatype -> Parse
        int a2 = Integer.parseInt("123");
        double b2 = Double.parseDouble("123.123");
        char c2 = "Pizza".charAt(0); // <- Character class has no parse method
        boolean d2 = Boolean.parseBoolean("true");
//        System.out.println(a2+b2+c2+d2); // <- Operator '+' cannot be applied to 'double', 'boolean'





    }
}
