package com.Biditvats.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNT_MASTER2")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Account {
	protected Long accNo;
	protected Double balance;
	protected Long customerId;
	
	public Account() {
		//Do Nothing
	}

	public Account(Double balance, Long customerId) {
		super();
		this.balance = balance;
		this.customerId = customerId;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ACC_NUMBER")
	public Long getAccNo() {
		return accNo;
	}

	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}
	
	@Column(name="BALANCE")
	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	@Column(name="CUSTOMER_ID")
	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	
}
