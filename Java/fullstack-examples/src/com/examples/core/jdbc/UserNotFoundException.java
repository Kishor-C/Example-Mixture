package com.examples.core.jdbc;

@SuppressWarnings("serial")
public class UserNotFoundException extends Exception {
	public UserNotFoundException(String msg) {
		super(msg);
	}
	public UserNotFoundException() {
		super("Sorry User is not found");
	}
}
