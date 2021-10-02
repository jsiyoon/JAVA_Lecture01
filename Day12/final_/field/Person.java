package Day12.final_.field;

public class Person {
	//final변수는 반드시 초기화 시켜줘야함.
	public final String nation = "대한민국"; //직접초기화 - 한가지 값만 가짐
	public final String number;
	String name;
	
	//String final number변수 생성자로 초기화 - 객체마다 다른 값을 가짐.
	public Person(String number, String name) {
		this.number = number;
		this.name = name;
	}
}
