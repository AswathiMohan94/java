package com.gradle.java;

public class MoodAnalyser {
    public static String stringMessage(String message) {
        return message;
    }
    public static String stringMessageHappyBad(String message) {
        if (message.equals("happy"))
            return "happy";
        else
            return "sad";
    }

}
