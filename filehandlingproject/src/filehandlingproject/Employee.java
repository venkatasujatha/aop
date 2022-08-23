package filehandlingproject;

public class Employee {
	private int empno;
	private String ename;
	private String phoneno;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public Employee(int empno, String ename, String phoneno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.phoneno = phoneno;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", phoneno=" + phoneno + "]";
	}
	

}
