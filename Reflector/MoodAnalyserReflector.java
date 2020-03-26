package com.gradle.java;

public class MoodAnalyserReflector {
    private String message;
    public MoodAnalyserReflector(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserReflectorException {
        try {
            if (message.length()==0)
                throw new MoodAnalyserReflectorException(MoodAnalyserReflectorException.exceptionType.ENTERED_EMPTY,"ENTERED_EMPTY");
            if (message.contains("sad"))
                return "SAD";
            return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalyserReflectorException(MoodAnalyserReflectorException.exceptionType.ENTERED_NULL, "ENTERED_NULL");
        }
    }

    public boolean equals(Object another){
        if (this.message.equals(((MoodAnalyserReflector)another).message))
            return true;
        return false;
    }

    public boolean equalsMethod_ForObject(Object another){
        if (this == another)
            return true;
        return false;
    }

}
