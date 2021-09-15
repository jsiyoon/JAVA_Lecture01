package Day06;

public class Variable {
	//초기화 하지 않더라도 기본값으로 자동초기화됨.(0 0.0 false null중 하나)
	int a;
	
	void printNumber(int c) {
		int b = 1; //지역변수 초기화 필요
		System.out.println("멤버변수:" + a);
		System.out.println("지역변수:" + b);
		System.out.println("매개변수:" + c);
	}
}
