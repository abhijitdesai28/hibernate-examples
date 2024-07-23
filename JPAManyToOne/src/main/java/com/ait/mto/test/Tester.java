package com.ait.mto.test;
import com.ait.mto.dao.impl.LoanDAOImpl;
import com.ait.mto.entities.Customer;
import com.ait.mto.entities.Loan;
import com.ait.mto.dao.LoanDAO;
public class Tester {

	public static void main(String[] args) {
		LoanDAO dao=new LoanDAOImpl();
		/*
		 * call saveLoan()
		 */
		/*
		Loan pLoan=new Loan();
		pLoan.setLoanId(123);
		pLoan.setLoanType("PERSONAL LOAN");
		pLoan.setAmount(500000.00);
		
		Loan vLoan=new Loan();
		vLoan.setLoanId(456);
		vLoan.setLoanType("VEHICLE LOAN");
		vLoan.setAmount(800000.00);
		
		Loan hLoan=new Loan();
		hLoan.setLoanId(789);
		hLoan.setLoanType("HOME LOAN");
		hLoan.setAmount(210000.00);
		
		Customer customer=new Customer();
		customer.setCustomerId(101);
		customer.setCustomerName("A");
		
		pLoan.setCustomer(customer);
		vLoan.setCustomer(customer);
		hLoan.setCustomer(customer);
		
		dao.saveLone(pLoan);
		dao.saveLone(vLoan);
		dao.saveLone(hLoan);
		*/
		
		/*
		 * call fetchLoanDetailsById()
		 */
		/*
		Loan loan = dao.fetchDetailsById(123);
		System.out.println(loan);
		Customer c= loan.getCustomer();
		System.out.println(c);
		*/
		/*
		 * call fetchLoanDetailsById()
		 */
		dao.removeLoan(789);
	}
}
