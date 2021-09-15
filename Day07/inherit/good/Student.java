package inherit.good;

public class Student extends Person {
	
	String studentId;
	
	Student(String pname, int page, String pstudentId){
		name = pname;
		age = page;
		studentId = pstudentId;
	}
}
