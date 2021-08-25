package com.moodanalyserday_21;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MoodAnalyserTest {
    
    @Test
    public void shouldReturnSad() {
    	
    	MoodAnalyser mood = new MoodAnalyser("I am in Sad");
        assertEquals(mood.SAD, mood.moodAnalyser());
    }
    
    @Test
    public void givenAnyMoodShouldReturnHappy() {
    	
    	MoodAnalyser mood = new MoodAnalyser("I am in Any Mood");
        assertEquals(mood.HAPPY, mood.moodAnalyser());
    }
    
    @Test
    public void notGivenAnyMessageShouldReturnSad() {
    	
    	MoodAnalyser mood = new MoodAnalyser();
        assertEquals(mood.SAD, mood.moodAnalyser());
    }
    
    @Test
    public void givenNullMessageShouldReturnHappy() {
    	
    	MoodAnalyser mood = new MoodAnalyser(null);
        assertEquals(mood.HAPPY, mood.moodAnalyser());
    }
}
