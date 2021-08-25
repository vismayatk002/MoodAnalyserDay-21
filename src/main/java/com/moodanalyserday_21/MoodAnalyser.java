package com.moodanalyserday_21;

public class MoodAnalyser {
    
	final String HAPPY = "Happy";
	final String SAD = "Sad";
	String message;
	
	public MoodAnalyser() {
		
		this.message = "Sad";
	}
	public MoodAnalyser(String message) {
		
		this.message = message;
	}
	public String moodAnalyser() {
		
		if(message.contains(SAD)) {
			return SAD;
		}
		else {
			return HAPPY;
		}
	}
	public static void main( String[] args ) {
		
		MoodAnalyser mood = new MoodAnalyser("I am Happy");
		System.out.println(mood.moodAnalyser() + " Mood ");
    }
}
