package Quiz02;

public class AnimalMain {
	public static void main(String[] args) {
		
		Animal ani = new Animal("참둥이", 7, "말티즈");
		ani.info();
		System.out.println("---------------------");
		
		Animal ani2 = new Animal("아리");
		ani2.info();
		System.out.println("---------------------");
		
		Animal ani3 =new Animal();
		ani3.name = "초코";
		ani3.age = 5;
		ani3.dog = "푸들";
		ani3.info();
		

	}
}
