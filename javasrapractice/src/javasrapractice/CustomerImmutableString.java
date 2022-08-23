package javasrapractice;

final class Immutables
{
	private String name;

	public String getName() {
		return name;
	}

	

	public void setName(String name) {
		this.name = name;
	}



	public Immutables(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Immutables [name=" + name + "]";
	}
	
	
}

public class CustomerImmutableString {

	public static void main(String[] args) {
		
		Immutables immutables=new Immutables("sujatha");
		
		System.out.println(immutables);	

	}

}
