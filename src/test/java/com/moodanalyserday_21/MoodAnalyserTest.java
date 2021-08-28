package com.moodanalyserday_21;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    
    @Test
    public void shouldReturnSad() throws MoodAnalysisException {
    	
    	MoodAnalyser mood = new MoodAnalyser("I am in Sad");
        assertEquals(mood.SAD, mood.moodAnalyser());
    }
    
    @Test
    public void givenAnyMoodShouldReturnHappy() throws MoodAnalysisException{
    	
    	MoodAnalyser mood = new MoodAnalyser("I am in Any Mood");
        assertEquals(mood.HAPPY, mood.moodAnalyser());
    }
    
    @Test
    public void notGivenAnyMessageShouldReturnSad() throws MoodAnalysisException{
    	
    	MoodAnalyser mood = new MoodAnalyser();
        assertEquals(mood.SAD, mood.moodAnalyser());
    }
    
    @Test
    public void givenNullMessageShouldReturnHappy() throws MoodAnalysisException{
    	
    	MoodAnalyser mood = new MoodAnalyser(null);
        assertEquals(mood.HAPPY, mood.moodAnalyser());
    }
    
    @Test
    public void givenNullMessageShouldGetThrowsExceptionMessage() {
    	
    	try {
    		
	    	MoodAnalyser mood = new MoodAnalyser(null);
	    	ExpectedException exceptionRule = ExpectedException.none();
	    	exceptionRule.expect(MoodAnalysisException.class);
	    	mood.moodAnalyser();
	        
    	}catch(MoodAnalysisException e) {
    		e.printStackTrace();
    	}
    }
    
    @Test
    public void givenEmptyMessageShouldGetThrowsExceptionMessage() {
    	
    	try {
    		
	    	MoodAnalyser mood = new MoodAnalyser("");
	    	ExpectedException exceptionRule = ExpectedException.none();
	    	exceptionRule.expect(MoodAnalysisException.class);
	    	mood.moodAnalyser();
	        
    	}catch(MoodAnalysisException e) {
    		e.printStackTrace();
    	}
    }
}
