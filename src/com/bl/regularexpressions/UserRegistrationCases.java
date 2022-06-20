package com.bl.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationCases {
    static final String USERNAME_PATTERN = "^[A-Z][a-z]{2,}$";
    static final String USERLASTNAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    static final String USEREMAIL_PATTERN = "^[a-zA-Z\\d+_.-]+@[bl.co|bl.in]+$";
    static final String USERMOBILE_PATTERN = "^[91]{2}[\\s][6-9][0-9]{9}$";
    static final String PASSWORD_PATTERN = "^([a-z]|[A-Z]|[0-9]|[!@#%&]){8,}$";

    public static boolean isValidUserName() {
        String userName = "Geetanjali";
        Pattern pattern = Pattern.compile(USERNAME_PATTERN);
        Matcher matcher = pattern.matcher(userName);
        boolean matches = matcher.matches();
        System.out.println("Username:  " + matches);
        return matches;
    }

    public static boolean isInValidUserName() {
        String userName = "";
        Pattern pattern = Pattern.compile(USERNAME_PATTERN);
        Matcher matcher = pattern.matcher(userName);
        boolean matches = matcher.matches();
        System.out.println("Username:  " + matches);
        return matches;
    }

    public static boolean isValidUserLastName() {
        String userLastName = "Sen";
        Pattern pattern = Pattern.compile(USERLASTNAME_PATTERN);
        Matcher matcher = pattern.matcher(userLastName);
        boolean matches = matcher.matches();
        System.out.println("User Last Name:  " + matches);
        return matches;
    }

    public static boolean isInValidUserLastName() {
        String userLastName = "sen";
        Pattern pattern = Pattern.compile(USERLASTNAME_PATTERN);
        Matcher matcher = pattern.matcher(userLastName);
        boolean matches = matcher.matches();
        System.out.println("User Last Name:  " + matches);
        return matches;
    }
    public static boolean isValidUserEmail() {
        String userEmail = "GeetanjaliSen@bl.co";
        Pattern pattern = Pattern.compile(USEREMAIL_PATTERN);
        Matcher matcher = pattern.matcher(userEmail);
        boolean matches = matcher.matches();
        System.out.println("User Email:  " + matches);
        return matches;
    }

    public static boolean isInValidUserEmail() {
        String userEmail = "eetanjaliS.co";
        Pattern pattern = Pattern.compile(USEREMAIL_PATTERN);
        Matcher matcher = pattern.matcher(userEmail);
        boolean matches = matcher.matches();
        System.out.println("User Email:  " + matches);
        return matches;
    }

    public static boolean isValidUserMobileNumber() {
        String userMobileNumber = "91 7584562152";
        Pattern pattern = Pattern.compile(USERMOBILE_PATTERN);
        Matcher matcher = pattern.matcher(userMobileNumber);
        boolean matches = matcher.matches();
        System.out.println("User Mobile Number:  " + matches);
        return matches;
    }

    public static boolean isInValidUserMobileNumber() {
        String userMobileNumber = "7584562152";
        Pattern pattern = Pattern.compile(USERMOBILE_PATTERN);
        Matcher matcher = pattern.matcher(userMobileNumber);
        boolean matches = matcher.matches();
        System.out.println("User Mobile Number:  " + matches);
        return matches;
    }

    public static boolean isValidPassword() {
        String password = "gSen@4895";
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        boolean matches = matcher.matches();
        System.out.println("Password:  " + matches);
        return matches;
    }

    public static boolean isInValidPassword() {
        String password = "n@4895";
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        boolean matches = matcher.matches();
        System.out.println("Password:  " + matches);
        return matches;
    }
}