package super_.basic;

public class Employee extends Person {
	String department;
	
	String info(){
		return "이름:" + name + ", 나이:" + age + ", 과목:" + department;
	}
	
	Employee(String name, int age, String department){
		super(name, age); //빌려쓰기 때문에 이렇게 사용가능.
		this.department = department;
	}
}
