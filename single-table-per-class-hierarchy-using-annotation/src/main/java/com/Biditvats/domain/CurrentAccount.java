package com.Biditvats.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CA")
public class CurrentAccount extends Account {
	private Double mab; // Minimum Average Balance
	private Integer maxTxn; // Maximum Transaction Per Month

	public CurrentAccount() {
		// Do Nothing
	}

	public CurrentAccount(Double balance, Long customerId, Double mab, Integer maxTxn) {
		super(balance, customerId);
		this.mab = mab;
		this.maxTxn = maxTxn;
	}
	
	@Column(name="MAB")
	public Double getMab() {
		return mab;
	}

	public void setMab(Double mab) {
		this.mab = mab;
	}
	
	@Column(name="MAX_TX")
	public Integer getMaxTxn() {
		return maxTxn;
	}

	public void setMaxTxn(Integer maxTxn) {
		this.maxTxn = maxTxn;
	}

	@Override
	public String toString() {
		return "CurrentAccount [mab=" + mab + ", maxTxn=" + maxTxn + ", accNo=" + accNo + ", balance=" + balance
				+ ", customerId=" + customerId + "]";
	}
	
}
