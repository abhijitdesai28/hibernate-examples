package com.ait.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.ait.constants.AppConstants;
import com.ait.dao.EmployeeDAO;
import com.ait.entity.EmployeeEntity;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
	
	@Override
	public EmployeeEntity fetchEmployeeById(Integer empId) {
		EntityManager em = factory.createEntityManager();
		TypedQuery<EmployeeEntity> tq= em.createQuery(AppConstants.QUERY_1,EmployeeEntity.class);
		tq.setParameter(1, empId);
		EmployeeEntity e=tq.getSingleResult();
		em.close();
		return e;
	}

	@Override
	public List<EmployeeEntity> fetchEmployees() {
		EntityManager em = factory.createEntityManager();
		TypedQuery<EmployeeEntity> tq= em.createQuery(AppConstants.QUERY_2,EmployeeEntity.class);
		List<EmployeeEntity> employeetList = tq.getResultList();
		em.close();
		
		return employeetList ;
	}

	@Override
	public List<Object[]> fetchNamesAndSalaries() {
		EntityManager em = factory.createEntityManager();
		TypedQuery<Object[]> tq= em.createQuery(AppConstants.QUERY_3,Object[].class);
		List<Object[]> listOfEmpNameSal = tq.getResultList();
		em.close();
		return listOfEmpNameSal;
	}

}
