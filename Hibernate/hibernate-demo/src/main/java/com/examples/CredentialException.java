package com.examples;

public class CredentialException extends Exception {
	public CredentialException() {
		super("Username or Password is Invalid");
	}
}
