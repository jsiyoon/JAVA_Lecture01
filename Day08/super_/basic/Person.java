package super_.basic;

public class Person {
	
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("누구로 생성하던 이문장 실행");
	}
	
	Person(String name) {
		this(name , 1);
//		this.name = name;
//		this.age = 1;
	}
	
	Person(){
		this("미정",1);
//		this.name = "미정";
//		this.age = 1;
	}
	
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
