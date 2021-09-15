package Day02;

public class Operator01 {
	public static void main(String[] args) {
		//단항 연산자
		
		//부호 연산자 + , -
		int i = +3;
		int j = -i;
		
		//증감연산자 ++ , -- 
		int k = 1;
		int h = ++k; //전위 연산자: 먼저 값을 증가시키고, 그다음에 대입
		System.out.println("k의 값:" + k );
		System.out.println("h의 값:" + h);
		
		int x = 1;
		int y = x++; //후위 연산자: 먼저 값을 대입하고, 그다음에 증가
		System.out.println("x의 값:" + x);
		System.out.println("y의 값:" + y);
		System.out.println("-------------------------");
		
		x=1;
		int result = (x++) + (x++) + 10;
		System.out.println(result);
		System.out.println("-------------------------");
		
		//비트반전 연산자~
		byte a = 10; //0000_1010
		System.out.println(~a); //1111_0101 (-11)
		System.out.println(~a+1);//-10
		System.out.println("-------------------------");
		
		//논리 반전연산자!
		boolean bool = true;
		System.out.println(!bool);
		System.out.println(!true);
		System.out.println(!false);
		
	}
}
