package com.promineotech;

public class SpacedLogger implements Logger {

	@Override
	public void log(String message) {
		for (char c : message.toCharArray()) {
			System.out.print(c + " ");
		}
		System.out.println();
		
	}

	@Override
	public void error(String message) {
		System.out.print("ERROR: ");
		for (char c : message.toCharArray()) {
			System.out.print(c + " ");
		}
		System.out.println();
		
	}
	
}
