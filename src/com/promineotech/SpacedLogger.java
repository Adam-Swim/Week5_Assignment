package com.promineotech;

public class SpacedLogger implements Logger { // Created a class that implements the Logger interface

	@Override
	public void log(String message) {
		for (char c : message.toCharArray()) { // Log method that prints out the message concatenated with spaces
			System.out.print(c + " ");
		}
		System.out.println();
		
	}

	@Override
	public void error(String message) {
		System.out.print("ERROR: ");
		for (char c : message.toCharArray()) { // Error method that prints out the same as above but with an ERROR: preceding the message
			System.out.print(c + " ");
		}
		System.out.println();
		
	}
	
}
