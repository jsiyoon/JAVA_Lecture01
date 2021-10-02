package Quiz02;

public class Animal {
	String name;
	int age;
	String dog;
	
	Animal(){
		
	}
	
	Animal(String pName, int pAge, String pFood){
		name = pName;
		age = pAge;
		dog = pFood;
	}
	
	Animal(String pName){
		name = pName;
		age = 13;
		dog = "말티즈";
	}
	
	void info() {
		System.out.println("강아지의 이름:" + name);
		System.out.println("강아지의 나이:" + age);
		System.out.println("강아지의 종:" + dog);
	}
}
