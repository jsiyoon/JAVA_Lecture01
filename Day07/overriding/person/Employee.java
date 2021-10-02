package overriding.person;

public class Employee extends Person {
	String department;
	
	String info(){
		return "이름:" + name + ", 나이:" + age + ", 과목:" + department;
	}
	
	Employee(String pname, int page, String pdepartment){
		name = pname;
		age = page;
		department = pdepartment;
	}
}
