package overriding.person;

public class Student extends Person {
	
	String studentId;
	
	String info(){
		return "이름:" + name + ", 나이:" + age + ", ID:" + studentId;
	}
	
	Student(String pname, int page, String pstudentId){
		name = pname;
		age = page;
		studentId = pstudentId;
	}
}
