package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee {
	@Id
	private int eno;
	private String fname;
	private String lname;
	private String designation;
	private String email;
	private String password;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Employee(int eno, String fname, String lname, String designation, String email, String password) {
		super();
		this.eno = eno;
		this.fname = fname;
		this.lname = lname;
		this.designation = designation;
		this.email = email;
		this.password = password;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", fname=" + fname + ", lname=" + lname + ", designation=" + designation
				+ ", email=" + email + ", password=" + password + "]";
	}
	
	
}
