package Day06;

public class ObjectBasic02 {
	public static void main(String[] args) {
		System.out.println("======1번계산기======");
		
		Calculator cal1 = new Calculator();
		System.out.println(cal1.add(5));
		System.out.println(cal1.add(10));
		System.out.println(cal1.add(3));
		
		System.out.println("======2번계산기======");
		Calculator cal2 = new Calculator();
		System.out.println(cal2.add(10));
		System.out.println(cal2.add(20));
	}

}