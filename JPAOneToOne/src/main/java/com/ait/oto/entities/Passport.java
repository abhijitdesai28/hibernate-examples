package com.ait.oto.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_passport")
public class Passport {
	@Id
	private Integer passportId;
	
	private LocalDate expireDate;
	
	@OneToOne(mappedBy = "passport")
    private Person person;

	public Integer getPassportId() {
		return passportId;
	}

	public void setPassportId(Integer passportId) {
		this.passportId = passportId;
	}

	public LocalDate getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}

	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", expireDate=" + expireDate + "]";
	}
}
