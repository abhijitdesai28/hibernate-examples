package com.ait.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StudentCompositeKey implements Serializable {
	@Column(name="ROLLNO")
	private Integer rollNumber;
	
	@Column(name="SECTION")      //optional
	private String section;
	
	//generate getter and setter
	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rollNumber, section);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentCompositeKey other = (StudentCompositeKey) obj;
		return Objects.equals(rollNumber, other.rollNumber) && Objects.equals(section, other.section);
	}
}
