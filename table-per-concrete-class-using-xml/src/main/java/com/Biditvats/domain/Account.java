package com.Biditvats.domain;

public abstract class Account {
	protected Long accNo;
	protected Double balance;
	protected Long customerId;

	public Account() {
		// Do Nothing
	}

	public Account(Double balance, Long customerId) {
		super();
		this.balance = balance;
		this.customerId = customerId;
	}

	public Long getAccNo() {
		return accNo;
	}

	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
}
