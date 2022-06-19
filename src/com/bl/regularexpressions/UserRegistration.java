package com.bl.regularexpressions;

import java.util.Scanner;

public class UserRegistration {
    static final int ENTER_FIRST_NAME = 1;
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
        System.out.println("Enter the choice 1.Enter first name");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        UserRegistrationCases userCases = new UserRegistrationCases();

        switch (choice) {
            case ENTER_FIRST_NAME:
                userCases.enterFirstName();
                break;
        }
    }
}