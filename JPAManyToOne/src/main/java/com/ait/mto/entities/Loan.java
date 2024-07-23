package com.ait.mto.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_loan")
public class Loan {
	@Id
	@Column(name="loan_id")
	private Integer LoanId;
	
	@Column(name="loan_type")
	private String loanType;
	
	@Column(name="amount")
	private Double amount;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="customer_id")
	private Customer customer;

	public Integer getLoanId() {
		return LoanId;
	}

	public void setLoanId(Integer loanId) {
		LoanId = loanId;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Loan [LoanId=" + LoanId + ", loanType=" + loanType + ", amount=" + amount + "]";
	}
	
	

}
