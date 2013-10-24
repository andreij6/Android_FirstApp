package com.andreij6.crystalball;

import java.util.Random;

public class CrystalBall {
	//member Variables (properties about the object)
	public String[] mAnswers = {
			"It is certain",
			"It is decidely so",
			"All signs say YES",
			"The starts are not aligned",
			"My reply is no",
			"It is doubtful",
			"Better not tell you now",
			"Concentrate and ask again",
			"Unable to answer now" };
	
	//Methods (abilities: things the object can do)
	public String getAnAnswer() {
		
		
		
		String answer = "";
		
		//Randomly select one of three answers: Yes, No, or Maybe
		Random randomGenerator = new Random();  //Construct a new Random number generator
		int randomNumber = randomGenerator.nextInt(mAnswers.length);  //exclusive upper bound - up to but no including 9 or the length of the answers array
		
		 
		answer = mAnswers[randomNumber];
		
		
		return answer;
	}
}
