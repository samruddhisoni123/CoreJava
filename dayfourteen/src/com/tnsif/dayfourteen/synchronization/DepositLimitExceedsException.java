package com.tnsif.dayfourteen.synchronization;

public class DepositLimitExceedsException extends Exception {

	public DepositLimitExceedsException()
	{
		super("daily limit of deposit is exceeded");
	}
	public DepositLimitExceedsException(String message) {
		super(message);
	}
}
