package com.ait.dao;

import com.ait.entity.Student;

public interface StudentDAO {
	      
	void saveStudent(Student student) ;
	
	Student loadStudent(int sid);
	
	Student updatedStudent(int sid,int marks);
	
     void  deleteStudent(int sid);
	
}
