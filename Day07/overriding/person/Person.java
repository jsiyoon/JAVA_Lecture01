package overriding.person;

public class Person {
	
	String name;
	int age;
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
	
	void method01() {
		System.out.println("선생님의 1번 메서드");
	}
	void method02() {
		System.out.println("선생님의 2번 메서드");
	}
	void method03() {
		System.out.println("학생의 1번 메서드");
	}
	void method04() {
		System.out.println("학생의 2번 메서드");
	}
	void method05() {
		System.out.println("고용인의 1번 메서드");
	}
	void method06() {
		System.out.println("고용인의 2번 메서드");
	}
}
