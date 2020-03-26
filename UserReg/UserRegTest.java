package com.mood.testcase;

import com.gradle.java.UserRegException;
import com.gradle.java.UserRegUtils;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserRegTest {
    @Test
    public void givenFirstName_WhenValid_ReturnTrue() throws UserRegException {
        boolean result= UserRegUtils.isFirstNameValid("Aswathi");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenInValid_ReturnFalse() throws UserRegException {
        assertFalse(UserRegUtils.isFirstNameValid("Aswathi@"));
        assertFalse(UserRegUtils.isFirstNameValid("A"));
        assertFalse(UserRegUtils.isFirstNameValid("aswathI"));
        assertFalse(UserRegUtils.isFirstNameValid("Aswathi123@"));
        assertFalse(UserRegUtils.isFirstNameValid("aswathi"));
    }
    @Test
    public void givenLastName_WhenValid_ReturnTrue() throws UserRegException {
        boolean result= UserRegUtils.isLastNameValid("Mohan");
        assertFalse(result);
    }
    @Test
    public void givenLastName_WhenInValid_ReturnFalse() throws UserRegException {
        assertFalse(UserRegUtils.isLastNameValid("aswathi"));
        assertFalse(UserRegUtils.isLastNameValid("12ASWATHI"));
        assertFalse(UserRegUtils.isLastNameValid("ASWATHI@"));
        assertFalse(UserRegUtils.isLastNameValid("aswaTHI"));

    }
    @Test
    public void givenEmailAdd_WhenValid_ReturnTrue() {
        assertTrue(UserRegUtils.isEmailValid("aswathi@gmail.com"));
        assertTrue(UserRegUtils.isEmailValid("abc-100@yahoo.com"));
        assertTrue(UserRegUtils.isEmailValid("abc007@jahoo.com"));

    }
    @Test
    public void WhenGiven_ValidEmail_ReturnFalse() throws UserRegException {
        assertFalse(UserRegUtils.isEmailValid("abc@gmail.com.aa$@.au"));
        assertFalse(UserRegUtils.isEmailValid("abc@gmail.com.a"));
        assertFalse(UserRegUtils.isEmailValid("abc@gmail.com.12"));
        assertFalse(UserRegUtils.isEmailValid("%$abc()*@gmail.com"));

    }
    @Test
    public void WhenGiven_ValidPhno_ReturnTrue() {
        assertTrue(UserRegUtils.isPhnoValid("8746383938"));
        assertTrue(UserRegUtils.isPhnoValid("9496097342"));

    }
    @Test
    public void WhenGiven_InValidPhno_ReturnFalse() {
        assertFalse(UserRegUtils.isPhnoValid("91 983427190"));
        assertFalse(UserRegUtils.isPhnoValid("91836189302145"));
        assertFalse(UserRegUtils.isPhnoValid("917 98376809"));
        assertFalse(UserRegUtils.isPhnoValid(" 6701017"));

    }
    @Test
    public void WhenGiven_ValidPassword_ReturnTrue() {
        assertTrue(UserRegUtils.isPasswordValid("@Aswathi@123@"));
        assertTrue(UserRegUtils.isPasswordValid("Aswathi@@123"));

    }
    @Test
    public void givenPasswd_WhenInValid_ReturnFalse() {
        assertFalse(UserRegUtils.isPasswordValid("@@@@@@@@"));
        assertFalse(UserRegUtils.isPasswordValid("achu@94"));
        assertFalse(UserRegUtils.isPasswordValid("aaaabbbb"));
        assertFalse(UserRegUtils.isPasswordValid("AABBAABB"));
        assertFalse(UserRegUtils.isPasswordValid("ACHU@@"));
        assertFalse(UserRegUtils.isPasswordValid("@@achu"));

    }

}
