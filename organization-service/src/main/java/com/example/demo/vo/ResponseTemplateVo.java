package com.example.demo.vo;

import com.example.demo.Model.Company;

public class ResponseTemplateVo {
	
	private Employee employee;
	private Company company;
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public ResponseTemplateVo(Employee employee, Company company) {
		super();
		this.employee = employee;
		this.company = company;
	}
	public ResponseTemplateVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ResponseTemplateVo [employee=" + employee + ", company=" + company + "]";
	}
	
	

}
