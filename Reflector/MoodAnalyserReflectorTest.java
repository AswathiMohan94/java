package com.mood.testcase;

import com.gradle.java.MoodAnalyserReflector;
import com.gradle.java.MoodAnalyserReflectorException;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserReflectorTest {

    @Test
    public void whenMood_IsSad_ShouldReturnSad() {
        MoodAnalyserReflector variable = new MoodAnalyserReflector("I am in sad Mood");
        String mood = null;
        try {
            mood = variable.analyseMood();
        } catch (MoodAnalyserReflectorException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void whenIn_AnyMood_ShouldReturnHappy() {
        MoodAnalyserReflector variable = new MoodAnalyserReflector("I am in happy Mood");
        String mood = null;
        try {
            mood = variable.analyseMood();
        } catch (MoodAnalyserReflectorException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void whenMood_IsNull_ShouldReturnHappy() {
        MoodAnalyserReflector variable = new MoodAnalyserReflector("I am in happy Mood");
        String mood = " ";
        try {
            mood = variable.analyseMood();
        } catch (MoodAnalyserReflectorException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void whenMood_IsNull_ShouldReturn_CustomException() {
        MoodAnalyserReflector variable = new MoodAnalyserReflector(null);
        try {
            String mood = variable.analyseMood();
        } catch (MoodAnalyserReflectorException e) {
            Assert.assertEquals("ENTERED_NULL", e.getMessage());
        }
    }

    @Test
    public void whenMood_IsNull_ShouldReturn_CustomException_WithExceptionType() {
        MoodAnalyserReflector variable = new MoodAnalyserReflector(null);
        try {
            String mood = variable.analyseMood();
        } catch (MoodAnalyserReflectorException e) {
            Assert.assertEquals("ENTERED_NULL", e.getMessage());
        }
    }

    @Test
    public void whenMood_IsEmpty_ShouldReturn_CustomException_WithExceptionType() {
        MoodAnalyserReflector variable = new MoodAnalyserReflector("");
        try {
            String mood = variable.analyseMood();
        } catch (MoodAnalyserReflectorException e) {
            Assert.assertEquals("ENTERED_EMPTY", e.getMessage());
        }
    }

    /*@Test
    public void whenMood_ClassIsNotAvailable_ShouldReturn_CustomException_WithNoSuchMETHOD() {
        try {
           MoodAnalyserReflector variable = MoodAnalyserReflector.createMoodAnalyserObject();
        } catch (MoodAnalyserReflectorException e) {
            Assert.assertEquals("NO_SUCH_METHOD_ERROR", e.getMessage());
        }
    }*/
}
