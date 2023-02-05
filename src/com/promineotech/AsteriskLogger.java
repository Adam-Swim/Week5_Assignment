package com.promineotech;

public class AsteriskLogger implements Logger {  // Created an AsteriskLogger class that implements the Logger interface

	@Override
	public void log(String message) {
		System.out.println("***" + message + "***");	// Log method that prints the message out between three asterisks on either side	
	}

	@Override
	public void error(String message) {
		System.out.println("****************");
		System.out.println("***ERROR: " + message + "***"); // Error method that prints out ERROR: + the message received in a box of asterisks.
		System.out.println("****************");
		
	}
}
