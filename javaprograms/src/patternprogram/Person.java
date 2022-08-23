package patternprogram;

public class Person {
	private int id;
	private String name;
	private long mobileno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public Person(int id, String name, long mobileno) {
		super();
		this.id = id;
		this.name = name;
		this.mobileno = mobileno;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mobileno=" + mobileno + "]";
	}
	

}
