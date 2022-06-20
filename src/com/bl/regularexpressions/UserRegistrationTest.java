package com.bl.regularexpressions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationTest {
    @Test
    public void testValidName_Happy() {
        boolean validUserName = UserRegistrationCases.isValidUserName();
        Assert.assertTrue(validUserName);
    }

    @Test
    public void testValidName_Sad() {
        boolean inValidUserName = UserRegistrationCases.isInValidUserName();
        Assert.assertFalse(inValidUserName);
    }

    @Test
    public void testValidLastName_Happy() {
        boolean validUserLastName = UserRegistrationCases.isValidUserLastName();
        Assert.assertTrue(validUserLastName);
    }

    @Test
    public void testValidLastName_Sad() {
        boolean inValidUserLastName = UserRegistrationCases.isInValidUserLastName();
        Assert.assertFalse(inValidUserLastName);
    }

    @Test
    public void testValidEmail_Happy() {
        boolean validUserEmail = UserRegistrationCases.isValidUserEmail();
        Assert.assertTrue(validUserEmail);
    }

    @Test
    public void testValidEmail_Sad() {
        boolean inValidUserEmail = UserRegistrationCases.isInValidUserEmail();
        Assert.assertFalse(inValidUserEmail);
    }

    @Test
    public void testValidMobileNumber_Happy() {
        boolean validUserMobileNumber = UserRegistrationCases.isValidUserMobileNumber();
        Assert.assertTrue(validUserMobileNumber);
    }

    @Test
    public void testValidMobileNumber_Sad() {
        boolean inValidUserMobileNumber = UserRegistrationCases.isInValidUserMobileNumber();
        Assert.assertFalse(inValidUserMobileNumber);
    }

    @Test
    public void testValidPassword_Happy() {
        boolean validPassword = UserRegistrationCases.isValidPassword();
        Assert.assertTrue(validPassword);
    }

    @Test
    public void testValidPassword_Sad() {
        boolean inValidPassword = UserRegistrationCases.isInValidPassword();
        Assert.assertFalse(inValidPassword);
    }
}