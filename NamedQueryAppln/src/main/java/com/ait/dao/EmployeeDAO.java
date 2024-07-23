package com.ait.dao;

import java.util.List;

import com.ait.entity.EmployeeEntity;

public interface EmployeeDAO {

	List<EmployeeEntity> executeNamedQuery(String deptName);

	List executeNamedNativeQuery(double empSalary);

	List<EmployeeEntity> executeCriteriaQuery();

}
