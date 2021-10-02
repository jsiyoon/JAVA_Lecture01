package poly.basic02;

public class MainClass {
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.method1(); //상속받은 메서드
		c.method2(); //오버라이딩된 메서드
		c.method3(); //자식의 3번메서드
		
		Parent p = c; //Parent p = new Child();
		System.out.println(p == c);
		
		p.method1();
		p.method2(); //오버라이딩 된 메서드 실행됨.
//		p.method3(); //사용불가
		
		System.out.println("--------------------");
		
		//Child가 갖는 고유한 성질 잃어버림.
		Parent pp = new Child();
		
		System.out.println("----"
				+ "----------------");
		
		Child cc = (Child)pp; //캐스팅(강제 형변환)
							 //ClassCasting통해 고유한성질 되찾아옴
							
		System.out.println(cc == pp);
		
		cc.method1();
		cc.method2();
		cc.method3();
		
		System.out.println("---------------------");
		
		Parent ppp = new Parent();
		Child ccc = (Child)ppp; //타입이 변환된것 중 
								//본래의 기능으로만 다시 ClassCasting 가능
								//==>본래의 기능으로만 형변환 가능하다는 뜻
		
	}
}
