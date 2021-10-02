package super_.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Student s = new Student("홍길동", 10, "20001212");
		System.out.println(s.info());
		
		Mother m = new Mother();
		System.out.println(m.info());
	}
}
