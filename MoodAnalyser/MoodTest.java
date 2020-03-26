package com.mood.testcase;

import com.gradle.java.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
//        MoodAnalyser mdo=new MoodAnalyser();
        String expected=MoodAnalyser.stringMessage("This is Sad message");
        Assert.assertEquals(expected,"This is Sad message");
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy(){
//        MoodAnalyser mdo=new MoodAnalyser();
        String expected=MoodAnalyser.stringMessageHappySad("happy");
        Assert.assertEquals("happy","happy");
    }
}
