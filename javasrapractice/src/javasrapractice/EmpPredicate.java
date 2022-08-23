package javasrapractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Employee {
	private int id;
	private String name;
	private String department;

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Employee(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}

}

public class EmpPredicate {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		// Employee employee=new Employee();
		ArrayList<Employee> arrayList = new ArrayList<>();
		do {
			System.out.println("1.insert");
			System.out.println("2.get details");
			System.out.println("3.remove based on name");
			System.out.println("4.index of an employee");
			System.out.println("5.delete max occurence in list");
			System.out.println("6.exit");
			System.out.println("enter ur choice");
			int choice = sn.nextInt();

			switch (choice) {

			// insert

			case 1:
				System.out.println("enter how many times to insert");
				int n = sn.nextInt();
				for (int i = 1; i <= n; i++) {

					System.out.println("enter id");
					int a = sn.nextInt();
					System.out.println("enter name");
					String b = sn.next();
					System.out.println("enter department");
					String c = sn.next();

					arrayList.add(new Employee(a, b, c));
				}
				break;
			/*
			 * employee.setId(a); employee.setName(b); employee.setDepartment(c);
			 * arrayList.add(employee);
			 */
			// get details
			case 2:

				for (Employee employee : arrayList) {

					System.out.println(employee);

				}
				break;

			// remove based on name
			case 3:

				Iterator<Employee> iterator = arrayList.iterator();

				System.out.println("enter name");
				String s = sn.next();
				while (iterator.hasNext()) {
					Employee employee = (Employee) iterator.next();

					// System.out.println(employee.getDepartment());

					// arrayList.remove(employee.getName());

					if (employee.getName().equals(s)) {

						iterator.remove();

					} else {
						System.out.println("mot found");
					}

				}
				System.out.println(arrayList);
				break;

			// index of employee
			case 4:

				System.out.println("enter name");
				String s2 = sn.next();

				int index = arrayList.stream().filter(i -> i.getName().equals(s2)).collect(Collectors.toList())
						.indexOf(s2);
				/*
				 * if (arrayList.contains(s2)) {
				 * 
				 * System.out.println(arrayList.indexOf(s2));
				 * 
				 * 
				 * } else { System.out.println("not found"); }
				 */
				System.out.println(index);

				break;

			// delete max occurence in list
			case 5:
				// int i=0;

				/*
				 * System.out.println("enter first name"); String r=sn.next(); int i=0;
				 * System.out.println("enter second name"); String r1=sn.next(); int j=0;
				 */
				/*
				 * Iterator<Employee> iterator2=arrayList.iterator();
				 * 
				 * while (iterator2.hasNext()) { Employee employee = (Employee)
				 * iterator2.next();
				 * 
				 * 
				 * 
				 * if(employee.getName().equals(r)) { i++; } else { j++; }
				 * 
				 * // arrayList.stream().max(Comparator.comparing(Employee::getName)).ifPresent(
				 * System.out::println); } //System.out.println(iterator2);
				 * 
				 */
				List<String> l2 = new ArrayList();
				int count = 0;
				for (Employee employee : arrayList) {
					// String s5 =employee.getName();

					for (Employee employee2 : arrayList) {
						if (employee.getName().equals(employee2.getName())) {
							l2.add(employee.getName());
							break;

						}
					}
				}

				System.out.println(l2);
				/*
				 * List<String>l3= l2.stream().distinct().collect(Collectors.toList());
				 * System.out.println(l3); break;
				 */
				break;

			case 6:
				System.exit(0);
			}
		} while (true);

	}
}
