package com.promineotech;

public class SpacedLogger implements Logger{     //Class SpacedLogger that implements the Logger interface
	
	@Override
	public void log(String log) {    //Pulling the log method from logger interface
	char[] wordSpace = new char[log.length()];   //Making a new array for each character
	
	for(int i = 0; i < wordSpace.length; i++) {  //This will put the character of the string into the new array
		wordSpace[i] = log.charAt(i);
		System.out.print(wordSpace[i] + " ");  //Prints the character with a space after
	}
	
}

	@Override
	public void error(String error) {    //Pulling the error method from logger interface
		
		char[] wordSpace = new char[error.length()];  //Making a new array for each character
		System.out.print("\nERROR: ");                //This will print out the Message before my loop
		for(int i = 0; i < wordSpace.length; i++) {   //This will put the character of the string into the new array
			wordSpace[i] = error.charAt(i);
			System.out.print(wordSpace[i] + " ");     //Prints the character with a space after
			
		}
	
	}

}
