package inherit.good;

public class Teacher extends Person{
	
	String subject;
	
	Teacher(String pname, int page, String psubject){
		name = pname;
		age = page;
		subject = psubject;
	}
}
