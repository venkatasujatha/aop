package com.example.demo.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@Entity(name="employee")
@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name="firstprocedure",procedureName = "getEmployee"),@NamedStoredProcedureQuery(name="secondprocedure",procedureName = "getEmployeeByCategory",parameters = {@StoredProcedureParameter(mode = ParameterMode.IN,name = "eCatagory", type = String.class)})})

public class Employee implements Serializable{
	@Id
	private int id;
	@Column(name="emp_id")
	private int empid;
	@Column(name="emp_name")
	private String empname;
	@Column(name="contact_number")
	private long contactnumber;
	@Column(name="e_id")
	private int eid;
	private int salary;
	private String catagory;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public long getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(long contactnumber) {
		this.contactnumber = contactnumber;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public Employee(int id, int empid, String empname, long contactnumber, int eid, int salary, String catagory) {
		super();
		this.id = id;
		this.empid = empid;
		this.empname = empname;
		this.contactnumber = contactnumber;
		this.eid = eid;
		this.salary = salary;
		this.catagory = catagory;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empid=" + empid + ", empname=" + empname + ", contactnumber=" + contactnumber
				+ ", eid=" + eid + ", salary=" + salary + ", catagory=" + catagory + "]";
	}
	
	

}
