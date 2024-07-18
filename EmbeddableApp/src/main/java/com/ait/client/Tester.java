package com.ait.client;

import com.ait.entity.StudentCompositeKey;
import com.ait.entity.StudentEntity;
import com.ait.dao.StudentDAO;
import com.ait.dao.impl.StudentDAOImpl;


public class Tester {

	public static void main(String[] args) {
		StudentDAO dao=new StudentDAOImpl();
		/*
		 * save sudent entity
		 */
		/*StudentCompositeKey compositeKey=new StudentCompositeKey();
		compositeKey.setRollNumber(101);
		compositeKey.setSection("B");
		
		StudentEntity entity=new StudentEntity();
		entity.setCompositeKey(compositeKey);
		entity.setStudentName("RAHUL");
		entity.setMarks(600);
		
		dao.saveStudent(entity);
		*/
		
		/*
		 * fetch student entity
		 */
		StudentCompositeKey compositeKey=new StudentCompositeKey();
		compositeKey.setRollNumber(101);
		compositeKey.setSection("A");
		
		StudentEntity fetchStudent = dao.fetchStudent(compositeKey);
		System.out.println("name            :"+fetchStudent.getStudentName());
		System.out.println("marks           :"+fetchStudent.getMarks());
		
	}

}
