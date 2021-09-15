package this_.basic;

public class Employee extends Person {
	String department;
	
	String info(){
		return "이름:" + name + ", 나이:" + age + ", 과목:" + department;
	}
	
	Employee(String name, int age, String department){
		this.name = name;
		this.age = age;
		this.department = department;
	}
}
