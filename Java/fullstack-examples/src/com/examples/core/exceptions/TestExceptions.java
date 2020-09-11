package com.examples.core.exceptions;

@SuppressWarnings("serial")
class InsufficientBalanceException extends Exception {
	
	public InsufficientBalanceException() {
		super("Insufficient Balance");
	}
}
public class TestExceptions {
	public static void main(String[] args) {
		try {
			payment(4000);
			test(20, 0);
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		} catch(Exception e) { // AE, AIOBE, NFE, NPE, CNFE, IOE
			e.printStackTrace();
		}
		finally {
			System.out.println("This is a finally");
		}
		System.out.println("Last line of the code");
	}
	static void payment(double amount) throws InsufficientBalanceException { 
		double balance = 5000;
		if(amount <= balance) {
			balance = balance - amount;
			System.out.println("Amount debited, Balance is: "+balance);
		} else {
			throw new InsufficientBalanceException();
		}
	}
	static void test(int a, int b) {
		int result = a / b;
		System.out.println("Result: "+result);
	}

}
