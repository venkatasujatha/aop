package com.example.demo.vo;

import com.example.demo.model.User1;

public class ResponseTemplateVo {
	
	private User1 user1;
	private Department department;
	public User1 getUser1() {
		return user1;
	}
	public void setUser1(User1 user1) {
		this.user1 = user1;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public ResponseTemplateVo(User1 user1, Department department) {
		super();
		this.user1 = user1;
		this.department = department;
	}
	public ResponseTemplateVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ResponseTemplateVo [user1=" + user1 + ", department=" + department + "]";
	}
	
	
	

}
