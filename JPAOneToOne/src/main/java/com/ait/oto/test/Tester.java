package com.ait.oto.test;

import java.time.LocalDate;

import com.ait.oto.dao.PersonDAO;
import com.ait.oto.dao.impl.PersonDAOImpl;
import com.ait.oto.entities.Passport;
import com.ait.oto.entities.Person;
public class Tester {

	public static void main(String[] args) {
		PersonDAO dao=new PersonDAOImpl();
		
		/*
		 * create Passport instances
		 */
		/*
		Passport pass1=new Passport();
		pass1.setPassportId(123456);
		pass1.setExpireDate(LocalDate.of(2023, 12, 31));
		*/
		
		/*
		 * create Person instances
		 */
		/*
		Person p1=new Person();
		p1.setPerson_id(101); 
		p1.setPerson_name("Ram");
		p1.setPassport(pass1);
		
		dao.savePerson(p1);
		*/
		
		/*
		 * call  findBook()
		 */
		/*
		Person perId = dao.findPerson(101);
		System.out.println("Person id: "  +perId.getPerson_id());
		System.out.println("Person name : "+perId.getPerson_name());
		Passport passId = perId.getPassport();
		System.out.println("passport Id :" +passId);
		*/
		
		/*
		 * call  removePerson()
		 */
		dao.removePerson(101);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
