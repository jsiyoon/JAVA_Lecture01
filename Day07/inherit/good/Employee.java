package inherit.good;

public class Employee extends Person {
	String department;
	
	Employee(String pname, int page, String pdepartment){
		name = pname;
		age = page;
		department = pdepartment;
	}
}
