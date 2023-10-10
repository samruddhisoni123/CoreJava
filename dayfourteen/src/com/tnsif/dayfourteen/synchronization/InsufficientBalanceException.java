package com.tnsif.dayfourteen.synchronization;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException() {
		super("insufficient balance in ur acc");
	}
	public InsufficientBalanceException(String message) {
		super(message);
	}

}
