package com.bl.regularexpressions;

import java.util.Scanner;

public class UserRegistration {
    static final int ENTER_FIRST_NAME = 1;
    static final int ENTER_LAST_NAME = 2;
    static final int ENTER_EMAIL = 3;
    static final int ENTER_MOBILE_NUMBER = 4;
    static final int ENTER_PASSWORD = 5;
    static final int EMAIL_VALIDATION = 6;

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
        System.out.println("Enter the choice 1.Enter first name 2.Enter last name 3.Enter email 4.Mobile Number+\n" +
                "5.Enter Password 6.For checking email validation");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        UserRegistrationCases userCases = new UserRegistrationCases();

        switch (choice) {
            case ENTER_FIRST_NAME:
                userCases.enterFirstName();
                break;

            case ENTER_LAST_NAME:
                userCases.enterLastName();
                break;

            case ENTER_EMAIL:
                userCases.enterValidEmail();
                break;

            case ENTER_MOBILE_NUMBER:
                userCases.enterMobileNumber();
                break;

            case ENTER_PASSWORD:
                userCases.enterPassword();
                break;

            case EMAIL_VALIDATION:
                userCases.emailValidation();
                break;
        }
    }
}