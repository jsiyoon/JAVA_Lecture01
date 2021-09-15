package overriding.person;

public class Teacher extends Person{
	
	String subject;
	
	String info(){
		return "이름:" + name + ", 나이:" + age + ", 과목:" + subject;
	}
	
	Teacher(String pname, int page, String psubject){
		name = pname;
		age = page;
		subject = psubject;
	}
}
