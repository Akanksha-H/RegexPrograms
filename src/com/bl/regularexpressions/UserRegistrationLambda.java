package com.bl.regularexpressions;

public class UserRegistrationLambda {
    public static void main(String[] args) {
        boolean isValidUserName = UserRegistrationLambda.isValidUserName().validate("Geetanjali");
        System.out.println(isValidUserName);

        boolean isValidUserLastName = UserRegistrationLambda.isInValidUserLastName().validate("Sen");
        System.out.println(isValidUserLastName);


        boolean isValidUserEmail = UserRegistrationLambda.isValidUserEmail().validate("Geetanjali@bl");
        System.out.println(isValidUserEmail);


        boolean isValidUserPhoneNumber = UserRegistrationLambda.isValidUserPhoneNumber().validate("91 9184521534");
        System.out.println(isValidUserPhoneNumber);


        boolean isValidPassword = UserRegistrationLambda.isValidPassword().validate("");
        System.out.println(isValidPassword);
    }

    public static UserEntries isValidUserName(){
        return employeeName -> employeeName.matches("^[A-Z][a-z]{2,}$");
    }
    public static UserEntries isInValidUserLastName() {
        return employeeName -> employeeName.matches("^[A-Z]{1}[a-z]{2,}$");
    }
    public static UserEntries isValidUserEmail(){
        return employeeName -> employeeName.matches("^[a-zA-Z\\d+_.-]+@[bl.co|bl.in]+$");
    }
    public static UserEntries isValidUserPhoneNumber(){
        return employeeName -> employeeName.matches("^[91]{2}[\\s][6-9][0-9]{9}$");
    }
    public static UserEntries isValidPassword(){
        return employeeName -> employeeName.matches("^([a-z]|[A-Z]|[0-9]|[!@#%&]){8,}$");
    }
}
