package com.moodanalyserday_21;

import com.moodanalyserday_21.MoodAnalysisException.ExceptionType;

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
	
	public String moodAnalyser() throws MoodAnalysisException{
		
		if(message == null) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL, "Input is Null !");
		}
		else if(message.isEmpty()) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY, "Input is Empty !");
		}
		else {
			if(message.contains(SAD)) {
				return SAD;
			}
			else {
				return HAPPY;
			}
		}
	}
	
	public static void main( String[] args ) {
		
		try {
			
			MoodAnalyser mood = new MoodAnalyser("I am Happy");
			System.out.println(mood.moodAnalyser() + " Mood ");
			
		}catch(MoodAnalysisException e) {
			
			System.out.println(e.getMessage());
		}
	}
}
