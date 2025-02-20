package com.A5_Printf;

public class WorkingPrintf {
    public static void main(String[] args) {
        // printf() is a method used to format output

        // % [flags] [width] [.precision] [specifier-character]

        // [specifier-character]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);

        // [.precision]

        // [flags]

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive


        double number1 = 99.99997788;
        double number2 = 9.99997788;
        double number3 = -599.99997788;
        double number4 = 6548977.655648;

        System.out.printf("%.2f\n", number1);
        System.out.printf("% .2f\n", number2);
        System.out.printf("%(.2f\n", number3);
        System.out.printf("%,.5f\n", number4);

        // [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("id: %04d\n", id1);
        System.out.printf("id: %4d\n", id2);
        System.out.printf("id: %-4d\n", id3);
        System.out.printf("id: %04d\n", id4);


    }
}
