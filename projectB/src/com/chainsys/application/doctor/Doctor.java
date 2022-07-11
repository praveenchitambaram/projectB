package com.chainsys.application.doctor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;
@Entity
@Table(name="Doctor")
public class Doctor {
	@Id
	private int id ;
	private String Name;
	private Date Dob;
    private String Spaciality;
    private String City;
	private long Phone_no;
	@Column(name="Standard_fees")
	private float Standard_fees;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Date getDob() {
		return Dob;
	}

	public void setDob(Date dob) {
		Dob = dob;
	}

	public String getSpaciality() {
		return Spaciality;
	}

	public void setSpaciality(String spaciality) {
		Spaciality = spaciality;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public long getPhone_no() {
		return Phone_no;
	}

	public void setPhone_no(long phone_no) {
		Phone_no = phone_no;
	}

	public float getStandard_fees() {
		return Standard_fees;
	}

	public void setStandard_fees(float standard_fees) {
		Standard_fees = standard_fees;
	}
		@Override
	public String toString() {
		return String.format("%d, %s, %s, %s, %d",id,Name,Dob,City,Phone_no);
	}

}
