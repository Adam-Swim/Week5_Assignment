package com.promineotech;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("***" + message + "***");		
	}

	@Override
	public void error(String message) {
		System.out.println("****************");
		System.out.println("***ERROR: " + message + "***");
		System.out.println("****************");
		
	}
}
