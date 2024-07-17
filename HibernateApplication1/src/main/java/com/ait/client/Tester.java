package com.ait.client;

import com.ait.dao.StudentDAO;
import com.ait.dao.impl.StudentDAOImpl;
import com.ait.entity.Student;

public class Tester {

public static void main(String[] args) {
		
		StudentDAO  dao = new StudentDAOImpl();
		/*
		 * creating Student object
		 */
		/*Student student = new Student();
		student.setSid(101);
		student.setSname("ram");
		student.setGender("Male");
		student.setMarks(700);
		dao.saveStudent(student);*/
		
		/*for select/fetch/retrieve
		 * Student student=dao.loadStudent(102);
		System.out.println(student);*/
		
		/* for update /modify
		 * Student student=dao.updatedStudent(103, 200);
		System.out.println(student);*/
		
		/*for delete/remove*/
		dao.deleteStudent(103);
}
}
