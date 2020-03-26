package com.gradle.java;

public class UserRegUtils {

    public static boolean isFirstNameValid(String firstName) throws UserRegException{
        if( firstName.matches( "[0-9]*" ))
            throw new UserRegException("FirstNameInvalidException:");
        else
            return firstName.matches( "^[A-Z][a-z\\s]{1,}");//"[A-Z][a-z]*" );

    }
    public static boolean isLastNameValid(String lastName) throws UserRegException{
        if( lastName.matches( "[0-9]*" ))
            throw new UserRegException("lastNameInvalidException:");
        else
            return lastName.matches( "[A-Z]+([ '-][a-zA-Z]+)*" );

    }

    public static boolean isEmailValid(String email){
        return email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");

    }

    public static boolean isPhnoValid(String phno){
        return  phno.matches("(0/91)?[7-9][0-9]{9}");
    }

    public static boolean isPasswordValid(String pass){
        return pass.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,})");
    }

}//class
