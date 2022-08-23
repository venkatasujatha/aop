package patternprogram;

import java.util.ArrayList;
import java.util.List;

public class ArrayToJson {

	public static void main(String[] args) {
		List<Person> person=new ArrayList<Person>();
		person.add(new Person(1,"sujatha",9876589));
		person.add(new Person(2,"sunny",898765));
		person.add(new Person(3,"sasi",7689990));
		System.out.println(person);
		//Gson gson=new Gson();
	}

}
