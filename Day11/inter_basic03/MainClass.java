package inter_basic03;

public class MainClass {
	public static void main(String[] args) {
		
		Printed lg = new LG();
		lg.print("가나다라마바사");
		lg.color("마자차카타파하", "검정");
		lg.copy(5);
		
		System.out.println("-----------------");
		
		Printed samsung = new Samsung();
		samsung.print("가나다라마바사");
		samsung.color("마자차카타파하", "검정");
		samsung.copy(5);
		
	}
}
