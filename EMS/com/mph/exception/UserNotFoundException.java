package com.mph.exception;

public class UserNotFoundException extends Exception{

	 public UserNotFoundException() {
		
		// TODO Auto-generated constructor stub
		System.out.println("User Not Found Exception thrown");
	}

	@Override
	public String toString() {
		return "UserNotFoundException []";
	}

}
