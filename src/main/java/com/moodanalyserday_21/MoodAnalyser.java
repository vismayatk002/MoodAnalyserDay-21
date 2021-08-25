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
		try {
			
			if(message.contains(SAD)) {
				return SAD;
			}
			else {
				return HAPPY;
			}
			
		}catch(NullPointerException e) {
			
			return HAPPY;
		}
	}
	public static void main( String[] args ) {
		
		MoodAnalyser mood = new MoodAnalyser(null);
		System.out.println(mood.moodAnalyser() + " Mood ");
		
	}
}
