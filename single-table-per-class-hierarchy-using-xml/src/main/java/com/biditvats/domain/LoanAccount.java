package com.biditvats.domain;

public class LoanAccount extends Account {
	private Double interestRate;
	private Double emi;
	private Double outStdAmount; // Outstanding Amount

	public LoanAccount() {
		// Do Nothing
	}

	public LoanAccount(Double balance, Long customerId, Double interestRate, Double emi, Double outStdAmount) {
		super(balance, customerId);
		this.interestRate = interestRate;
		this.emi = emi;
		this.outStdAmount = outStdAmount;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public Double getEmi() {
		return emi;
	}

	public void setEmi(Double emi) {
		this.emi = emi;
	}

	public Double getOutStdAmount() {
		return outStdAmount;
	}

	public void setOutStdAmount(Double outStdAmount) {
		this.outStdAmount = outStdAmount;
	}

	@Override
	public String toString() {
		return "LoanAccount [interestRate=" + interestRate + ", emi=" + emi + ", outStdAmount=" + outStdAmount
				+ ", accNo=" + accNo + ", balance=" + balance + ", customerId=" + customerId + "]";
	}
}
