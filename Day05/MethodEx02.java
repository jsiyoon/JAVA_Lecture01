package Day05;

public class MethodEx02 {
	public static void main(String[] args) {
		//매개변수
		//1.매개변수는 메서드를 호출할 때 값 전달하는 매개채
		//2.메서드의 소괄호 안에 몇개를 입력받을지 결정.
		//3.매개변수가 여러개 라면 ','로 연결하면 됨.
		
		System.out.println("1~10까지 합:" + calSum(10));
		System.out.println("1~100까지 합:" + calSum(100));
		
		int result = calSum2(10,20);
		System.out.println("10~20까지 합:" + result);
		
		String result2 = calSum3(1, 10, "가");
		System.out.println(result2);
	}
	
	static int calSum(int end) {
		
		int sum = 0;
		
		for(int i = 1; i <= end; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	static int calSum2(int start, int end) {
		
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	static String calSum3(int start, int end, String s) {
		
		String str = "";
		for(int i = start; i <= end; i++) {
			str += s;
		}
		return str;
	}
}
