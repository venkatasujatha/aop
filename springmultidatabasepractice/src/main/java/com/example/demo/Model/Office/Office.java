package com.example.demo.Model.Office;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Office {
	@Id
	private int id;
	private String companyname;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Office(int id, String companyname, String address) {
		super();
		this.id = id;
		this.companyname = companyname;
		this.address = address;
	}
	public Office() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Office [id=" + id + ", companyname=" + companyname + ", address=" + address + "]";
	}
	
	

}
