package com.ait.test;

import java.util.List;

import com.ait.dao.EmployeeDAO;
import com.ait.dao.impl.EmployeeDAOImpl;
import com.ait.entity.EmployeeEntity;

public class Tester {

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAOImpl();

		/*
		 * List<EmployeeEntity> lst = dao.executeNamedQuery("HR");
		 * lst.forEach(System.out::println);
		 */

		List lst = dao.executeNamedNativeQuery(3000);
		lst.forEach(System.out::println);

		// List<EmployeeEntity> lst = dao.executeCriteriaQuery();
		// lst.forEach(System.out::println);

	}

}
