package com.Biditvats.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SA")
public class SavingAccount extends Account {
	private Double interestRate;

	public SavingAccount() {
		// Do Nothing
	}

	public SavingAccount(Double balance, Long customerId, Double interestRate) {
		super(balance, customerId);
		this.interestRate = interestRate;
	}

	@Column(name="INTEREST_RATE")
	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "SavingAccount [interestRate=" + interestRate + ", accNo=" + accNo + ", balance=" + balance
				+ ", customerId=" + customerId + "]";
	}
}
