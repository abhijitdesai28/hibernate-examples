package com.ait.oto.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.oto.dao.PersonDAO;
import com.ait.oto.entities.Person;

public class PersonDAOImpl implements PersonDAO {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
	

	@Override
	public void savePerson(Person person) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		try {
			em.persist(person);
			tx.commit();
			System.out.println("Person data saved");
		}catch(Exception ex) {
			tx.rollback();
			ex.printStackTrace();
			System.out.println("Unable to save Person ");
		}finally {
			em.close();
		}
	}

	@Override
	public Person findPerson(Integer personId) {
		EntityManager em=factory.createEntityManager();
		Person findPerson = em.find(Person.class, personId);
		em.close();
		return findPerson;
	}

	@Override
	public void removePerson(Integer personId) {
		EntityManager em=factory.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		try {
			Person findPerson = em.find(Person.class, personId);
			em.remove(findPerson);
			em.close();
			System.out.println("Person is deleted...........");
		}catch(Exception ex) {
			tx.rollback();
			ex.printStackTrace();
		}finally {
			em.close();
		}
	}
}
