package Day01;

public class VariableScope {
	public static void main(String[] args) {
		
		//int num1 = 10;
		//int num2 = 20;
		int num1 = 10, num2 = 20;
		int num4 = 100;
		if(true) {
			int num3 = num1 + num2; //30
			num4 = 100;
			System.out.println(num3); //30
			System.out.println(num4);
		}
		//system.out.println(num3); //중괄호(Main문)안에서 사용되니 변수는 중괄호(Main문) 밖에서 사용할 수 없음
								    //선언된 곳 외부에서 사용 불가
	}
}
