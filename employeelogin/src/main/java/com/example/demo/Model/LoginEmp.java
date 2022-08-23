package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoginEmp {
	@Id
	private int id;
	private String uname;
	private String pwd;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public LoginEmp(int id, String uname, String pwd) {
		super();
		this.id = id;
		this.uname = uname;
		this.pwd = pwd;
	}
	public LoginEmp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
