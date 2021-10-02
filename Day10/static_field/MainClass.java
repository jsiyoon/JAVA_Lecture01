package static_field;

public class MainClass {
	public static void main(String[] args) {
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		
		System.out.println("c1의 a:"+ c1.a);
		System.out.println("c1의 b:"+ c1.b);
		
		Count c2 = new Count(); //새로운 메소드 생성
		c2.a++;
		c2.b++;
		
		System.out.println("c2의 a:"+ c2.a); 
		System.out.println("c2의 b:"+ c2.b); //b는 static변수이기 때문에
											//새로운 메소드의 b여도 값이 초기화 되지않고
											//이전의 값을 가지고 있음.
	}
}
