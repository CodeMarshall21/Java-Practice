package com.A14_OOP.B3_OverloadedConstructors;

public class Main {
    public static void main(String[] args) {

        // overloaded constructors = Allow a class to have multiple constructors
        //                                                 with different parameter lists.
        //                                                 Enable objects to be initialized in various ways.


        User user1 = new User("Spongebob");
        User user2 = new User("Patric","patric@gmail.com");
        User user3 = new User("Sandy","Sandy@gmail.com",20);
        User guest = new User();


        System.out.printf("User1 Details -> User user1 = new User(\"Spongebob\"); :- \n1. Username: %s \n2. Email: %s \n3. Age: %d",user1.username,user1.email,user1.age);
        System.out.println("\n**************************");
        System.out.printf("\nUser2 Details -> User user2 = new User(\"Patric\",\"patric@gmail.com\"); :- \n1. Username: %s \n2. Email: %s \n3. Age: %d",user2.username,user2.email,user2.age);
        System.out.println("\n**************************");
        System.out.printf("\nUser3 Details -> User user3 = new User(\"Sandy\",\"Sandy@gmail.com\",20); :- \n1. Username: %s \n2. Email: %s \n3. Age: %d",user3.username,user3.email,user3.age);
        System.out.println("\n**************************");
        System.out.printf("\nGuest Details -> User guest = new User(); :- \n1. Username: %s \n2. Email: %s \n3. Age: %d",guest.username,guest.email,guest.age);

    }
}
