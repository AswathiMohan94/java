package com.mood.testcase;

import com.gradle.java.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
        String expected=MoodAnalyser.stringMessage("This is Sad message");
        Assert.assertEquals(expected,"This is Sad message");
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() {
        String expected = MoodAnalyser.stringMessageHappySad("happy");
        Assert.assertEquals("happy", "happy");
    }
    @Test
    public void givenMessage_AnyMood_ShouldReturnHappy() {
        String expected = MoodAnalyser.stringMessageHappySad("happy");
        Assert.assertEquals("happy", "happy");
    }

}
