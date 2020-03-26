package com.gradle.java;

public class MoodAnalyserException extends Exception {
    public enum ExceptionType{
        ENTERED_NULL,ENTERED_EMPTY,NO_SUCH_CLASS
    }
    public ExceptionType type;
    public MoodAnalyserException(ExceptionType type,String message) {
        super(message);
        this.type=type;
    }
}
