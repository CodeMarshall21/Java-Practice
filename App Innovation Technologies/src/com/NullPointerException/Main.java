package com.NullPointerException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String curUserName;
        String curPassword;
        Scanner scanner = new Scanner(System.in);

        User user = new User("Keshav","password123");

        System.out.print("Enter username: ");
        curUserName = scanner.nextLine();

        System.out.print("Enter password: ");
        curPassword = scanner.nextLine();

        try {
            authenticateUser(user, curUserName, curPassword);
        } catch (NullPointerException e) {
            System.err.println("Error: No user found! Please check your username.");
        }

        scanner.close();

    }

    public static void authenticateUser(User user, String username, String password) {
        String storedUsername = user.getUsername();
        String storedPassword = user.getPassword();

        if (user == null) {
            throw new NullPointerException("User object is null");
        }

        if (storedUsername.equals(username)) {
            if (storedPassword.equals(password)) {
                System.out.printf("Login successful! Welcome, %s",storedUsername);
            } else {
                System.out.println("Invalid password. Please try again.");
            }
        } else {
            System.out.println("User not found! Please check your username.");
        }
    }
}
