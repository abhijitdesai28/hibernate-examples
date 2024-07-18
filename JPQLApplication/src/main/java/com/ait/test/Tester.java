package com.ait.test;

import com.ait.dao.impl.EmployeeDAOImpl;
import com.ait.entity.EmployeeEntity;

import java.util.List;

import com.ait.dao.EmployeeDAO;

public class Tester {

	public static void main(String[] args) {
		EmployeeDAO  dao = new EmployeeDAOImpl();
		/*
		 * select single record query execution
		 */
		
		/*EmployeeEntity fetchEmployeeById = dao.fetchEmployeeById(1);
		System.out.println(fetchEmployeeById);*/
		
		/*
		 * select ALL record query execution
		 */
		/*List<EmployeeEntity> fetchEmployees = dao.fetchEmployees();
		 * fetchEmployees.forEach(System.out::println)
		 * below is alternate for above
		System.out.println(fetchEmployees);*/
		
		List<Object[]> fetchNamesAndSalaries = dao.fetchNamesAndSalaries();
		
		fetchNamesAndSalaries.forEach(obj -> {
			System.out.println(obj[0] +"   ,  "+ obj[1]);
		});
	}

}
