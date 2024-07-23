package com.ait.oto.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_person")
public class Person {
	@Id
	@JoinColumn(name="")
	private Integer person_id;
	
	@JoinColumn(name="person_name")
	private String person_name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="passportid" , unique=true, nullable=false)
	private Passport passport;

	public Integer getPerson_id() {
		return person_id;
	}

	public void setPerson_id(Integer person_id) {
		this.person_id = person_id;
	}

	public String getPerson_name() {
		return person_name;
	}

	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", person_name=" + person_name + ", passport=" + passport + "]";
	}
	
	
	

}
