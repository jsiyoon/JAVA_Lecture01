package Quiz02;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20, 100);
		p1.info();
		System.out.println("----------------------------");
		
		//매개변수가 있는 생성자 있으면 기본 생성자를 따로 쓸수 없기 떄문에
		//기본 생성자 생성해 둘 것
		//기본생성자 생성해 두지 않으면 밑 ClassQuiz01생성자 오류 뜸
		Person p2 = new Person();
		p2.age = 40;
		p2.name = "김길동";
		p2.tall = 170;
		p2.info();
	}
}
