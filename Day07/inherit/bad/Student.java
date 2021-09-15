package inherit.bad;

public class Student {
	//상속이 없다면?
	String name;
	int age;
	String studentId;
	
	String info() {
		return "이름:" + name + ",나이" + age;
	}
}
