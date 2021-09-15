package static_method;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		//Main문도 static메서드임.
		//그렇기 때문에 Main안에서 클래스 생성해 접근해 주어야함.
		Count c = new Count();
		c.a = 10;
		
//		Count.a++; //일반변수,메서드는 클래스통해 접근해야함.
//		Count.method();
		
		Count.b++; //static변수,메서드는 클래스 통하지않고 바로 접근가능.
		Count.method2();
		
		
		//////////자바에서 기본적으로 가지고 있는 static메서드//////////
		System.out.println(Math.random());
//		System.out.println(Arrays.toString(배열명));
		System.out.println(Integer.parseInt("1"));
	}
}
