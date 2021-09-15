package overriding.person;

public class MainClass {
	
	public static void main(String[] args) {
		//학생, 직원, 선생님을 객체의 info메서드를 각 변수에 알맞게 오버라이딩 해서 확인
		
		Student student = new Student("홍길동", 20, "20210826");
		Teacher teacher = new Teacher("슨생님", 50, "JAVA");
		Employee employee = new Employee("고용인", 30, "회계부");
		
		System.out.println(student.info());
		System.out.println(teacher.info());
		System.out.println(employee.info());	
	}
}

