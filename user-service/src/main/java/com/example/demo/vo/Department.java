package com.example.demo.vo;

public class Department {
	
	private int deptid;
	private String deptname;
	private String deptaddress;
	private String deptcode;
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getDeptaddress() {
		return deptaddress;
	}
	public void setDeptaddress(String deptaddress) {
		this.deptaddress = deptaddress;
	}
	public String getDeptcode() {
		return deptcode;
	}
	public void setDeptcode(String deptcode) {
		this.deptcode = deptcode;
	}
	public Department(int deptid, String deptname, String deptaddress, String deptcode) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
		this.deptaddress = deptaddress;
		this.deptcode = deptcode;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + ", deptaddress=" + deptaddress
				+ ", deptcode=" + deptcode + "]";
	}
	
	

}
