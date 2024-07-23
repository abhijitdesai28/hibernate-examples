package com.ait.mto.dao.impl;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.mto.dao.LoanDAO;
import com.ait.mto.entities.Loan;

public class LoanDAOImpl implements LoanDAO {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");

	@Override
	public void saveLone(Loan lone) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		try {
			em.merge(lone);
			tx.commit();
			System.out.println("loan object is persisted succesfully");
		}catch(Exception ex) {
			tx.rollback();
			ex.printStackTrace();
			System.out.println("unable to persist loan object");
		}finally {
			em.close();
		}
	}

	@Override
	public Loan fetchDetailsById(Integer loanId) {
		EntityManager em=factory.createEntityManager();
		Loan loan = em.find(Loan.class, loanId);
		em.close();
		return loan;
	}

	@Override
	public void removeLoan(Integer loanId) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			Loan loan = em.find(Loan.class, loanId);
			em.remove(loan);
			tx.commit();
			System.out.println("loan object is removed");
		}catch(Exception ex) {
			tx.rollback();
			System.out.println("unable to remove loan object");
			ex.printStackTrace();
		}finally {
			em.close();
		}	
	}
}
