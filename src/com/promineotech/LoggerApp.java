package com.promineotech;

public class LoggerApp { // Created a class called LogegrApp that has a main method and 

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();  // instantiated instances of each of the logger classes that implement the logger interface 
		
		
		asteriskLogger.log("Hello");
		asteriskLogger.error("Hello");
		
		                                    // testing each method using the word Hello
		spacedLogger.log("Hello");
		spacedLogger.error("Hello");
		
	}

}
