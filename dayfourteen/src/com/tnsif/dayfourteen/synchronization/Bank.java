package com.tnsif.dayfourteen.synchronization;

public interface Bank {
	int MINBAL=5000;
	static final int DAILY_LIMIT=25000;
	public abstract void deposit(int amt) throws DepositLimitExceedsException;
	void withdraw(int amt)throws InsufficientBalanceException;
	


}
