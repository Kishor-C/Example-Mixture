package com.examples;

public class UserNotFoundException extends RuntimeException {
	public UserNotFoundException(String errorMessage) {
		super(errorMessage);
	}
}