package com.moodanalyserday_21;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MoodAnalyserTest {
    
    @Test
    public void shouldReturnSad() {
    	
    	MoodAnalyser mood = new MoodAnalyser();
        assertEquals("Sad", mood.moodAnalyser("I am in Sad"));
    }
    
    @Test
    public void shouldReturnHappy() {
    	
    	MoodAnalyser mood = new MoodAnalyser();
        assertEquals("Happy", mood.moodAnalyser("I am in Any Mood"));
    }
}
