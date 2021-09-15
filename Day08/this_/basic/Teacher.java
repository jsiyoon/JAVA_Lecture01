package this_.basic;

public class Teacher extends Person{
	
	String subject;
	
	String info(){
		return "이름:" + name + ", 나이:" + age + ", 과목:" + subject;
	}
	
	Teacher(String name, int age, String subject){
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
}
