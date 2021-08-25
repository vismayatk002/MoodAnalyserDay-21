package com.moodanalyserday_21;

public class MoodAnalyser {
    
	final String HAPPY = "Happy";
	final String SAD = "Sad";
	
	public String moodAnalyser(String message) {
		
		if(message.contains(SAD)) {
			return SAD;
		}
		else {
			return HAPPY;
		}
	}
	public static void main( String[] args ) {
		
		MoodAnalyser mood = new MoodAnalyser();
		String message = "I am Sad";
		System.out.println(mood.moodAnalyser(message) + " Mood ");
    }
}
