package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {
	@Id
	private int cmpid;
	private String cmpname;
	private String department;
	
	private int empid;

	public int getCmpid() {
		return cmpid;
	}

	public void setCmpid(int cmpid) {
		this.cmpid = cmpid;
	}

	public String getCmpname() {
		return cmpname;
	}

	public void setCmpname(String cmpname) {
		this.cmpname = cmpname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public Company(int cmpid, String cmpname, String department, int empid) {
		super();
		this.cmpid = cmpid;
		this.cmpname = cmpname;
		this.department = department;
		this.empid = empid;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Company [cmpid=" + cmpid + ", cmpname=" + cmpname + ", department=" + department + ", empid=" + empid
				+ "]";
	}
	
		
	

}
