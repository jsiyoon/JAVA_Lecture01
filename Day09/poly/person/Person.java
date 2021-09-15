package poly.person;

public class Person {
	
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
}
