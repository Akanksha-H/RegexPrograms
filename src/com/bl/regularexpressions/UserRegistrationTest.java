package com.bl.regularexpressions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationTest {
    @Test
    public void testValidName_Happy() throws InvalidInput{
        boolean validUserName = UserRegistrationCases.isValidUserName();
        if(!validUserName)
            throw new InvalidInput("Follow the hint: Enter the First name starts with Cap and\n"
                    +" has minimum 3 characters");
    }

    @Test
    public void testValidName_Sad(){
        String inValidUserName = String.valueOf(UserRegistrationCases.isInValidUserName());
        if (inValidUserName == null);
        throw new NullPointerException("User name can't be null");
    }
    @Test
    public void testValidLastName_Happy() throws InvalidInput {
        boolean validUserLastName = UserRegistrationCases.isValidUserLastName();
        if(!validUserLastName){
            throw new InvalidInput("Follow the hint: Enter the Last name starts with Cap \n"
                    + "and has minimum 3 characters");
        }
    }

    @Test
    public void testValidLastName_Sad() {
        boolean inValidUserLastName = UserRegistrationCases.isInValidUserLastName();
        Assert.assertFalse(inValidUserLastName);
    }

    @Test
    public void testValidEmail_Happy() throws InvalidInput{
        boolean validUserEmail = UserRegistrationCases.isValidUserEmail();
        if(!validUserEmail){
            throw new InvalidInput("Follow the hint: Email has 3 mandatory parts (abc, bl & co)\n" +
                    "and 2 optional (xyz & in) with precise @ and . positions");
        }
    }

    @Test
    public void testValidEmail_Sad() {
        boolean inValidUserEmail = UserRegistrationCases.isInValidUserEmail();
        Assert.assertFalse(inValidUserEmail);
    }

    @Test
    public void testValidMobileNumber_Happy() throws InvalidInput {
        boolean validUserMobileNumber = UserRegistrationCases.isValidUserMobileNumber();
        if(!validUserMobileNumber){
            throw new InvalidInput("Follow the hint: Country code follow 10 digit number");
        }
    }

    @Test
    public void testValidMobileNumber_Sad() {
        boolean inValidUserMobileNumber = UserRegistrationCases.isInValidUserMobileNumber();
        Assert.assertFalse(inValidUserMobileNumber);
    }

    @Test
    public void testValidPassword_Happy() throws InvalidInput{
        boolean validPassword = UserRegistrationCases.isValidPassword();
        if(!validPassword){
            throw new InvalidInput("Follow the hint: minimum 8 Characters, Should have at least 1 Upper Case\n"+
                    ", Should have at least 1 numeric number in the password, Has exactly 1 Special Character");
        }
    }

    @Test
    public void testValidPassword_Sad() {
        boolean inValidPassword = UserRegistrationCases.isInValidPassword();
        Assert.assertFalse(inValidPassword);
    }
}