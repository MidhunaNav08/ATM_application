package com.capg.ApplicationATM.exception;

public class IncorrectLoginCredentialsException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public IncorrectLoginCredentialsException(String msg) {
		super(msg);
	}

}
