package Inter_basic02;

public class MainClass {
	public static void main(String[] args) {
		
		//생성자 Animal부모타입에 저장됨.
		//Animal의 기능만 실행이됨.
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		Animal[] ani = {dog, cat, tiger};
		
		for(Animal a : ani) {
			a.eat();
		}
		
		System.out.println("-------------------");
		
		//IPet기능활용
		IPet dog2 = new Dog();
		IPet cat2 = new Cat();
		IPet fish2 = new GoldFish();
		
		IPet[] pets = {dog2, cat2, fish2};
		
		for(IPet p : pets) {
			p.play();
		}
	}
}
