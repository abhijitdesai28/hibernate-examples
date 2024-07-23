package com.ait.mto.dao;

import com.ait.mto.entities.Loan;

public interface LoanDAO {
	
	void saveLone(Loan lone);
	
	Loan fetchDetailsById(Integer loanId);
	
	void removeLoan(Integer loanId);

}
