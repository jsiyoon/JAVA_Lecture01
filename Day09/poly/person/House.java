package poly.person;

public class House { //매개변수의 다형성
	/* 다형성을 사용하지 않은 코딩
	public void print(Student s) {
		
		System.out.println(s.info());
	}
	
	public void print(Teacher t) {
		System.out.println(t.info());
	}
	
	public void print(Employee e) {
		System.out.println(e.info());
	}
	*/
	
	//다형성 적용
	public void print(Person p) {
		System.out.println(p.info());
	}
}
