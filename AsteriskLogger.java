package com.promineotech;

public class AsteriskLogger implements Logger{  //Class AsteriskLogger that implements the Logger interface
	
	@Override
	public void log(String log) {  //Pulling the log method from the logger interface
		
	System.out.println("***" + log + "***");  //to put *** around the word we have coming in
	
	}
	
	@Override
	public void error(String error) {  //Pulling the error method from logger interface
		int i = 0;
		while(i < (13 + error.length())) {    //This will put asterisks surrounding the word above 
			System.out.print("*");
			i++;
		}
		
		System.out.println("\n***Error: " + error + "***"); //This will put the asterisk around the word
		i=0;
		while(i < (13 + error.length())) {    //This will put asterisks surrounding the word below 
			System.out.print("*");
			i++;
		}
		
	}

}
