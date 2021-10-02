package this_.basic;

public class Student extends Person {
	
	String studentId;
	
	Student(String name, int age, String studentId){
//		super();가 생략되어 있는 것과 마찬가지
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	
	String info(){
		return "이름:" + name + ", 나이:" + age + ", ID:" + studentId;
	}
}
