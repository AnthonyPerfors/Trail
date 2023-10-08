package com.promineotech;

public class App {

	public static void main(String[] args) {        //My main application class
		
		 AsteriskLogger asterisk1 = new AsteriskLogger();   //This pulls in the AsteriskLogger class
		 
		 asterisk1.log("Hello");   //Pulling the log method from the AsteriskLogger class
		 asterisk1.error("Hello");  //Pulling the error method from the AsteriskLogger class
		
		 SpacedLogger spaced = new SpacedLogger();      //This pulls in the SpacedLogger class
	
		 System.out.print("\n");    //Giving a space between my prints
		 
		 spaced.log("Hello");   //Pulling the log method from the SpacedLogger class
		 spaced.error("Hello");   //Pulling the error method from the SpacedLogger class
		 
		
	}

}
