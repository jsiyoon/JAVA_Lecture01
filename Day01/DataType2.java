package Day01;

public class DataType2 {
	public static void main(String[] args) {
		//문자형
		char c1 = 'A';
		char c2 = 65;
		
		System.out.println(c1);
		System.out.println(c2);
		
		//유니코드의 등장 -> 2byte의 크기가 65536가지의 문자를 표현이 가능해짐
		char c3 = '가';
		char c4 = 44032;
		char c5 = '\uAC00'; // \\u는 유니코드를 표현하는 탈출문자
		
		System.out.println(c3 + "" + c4 + "" + c5);
		
		//문자열
		String s1 = "hello";
		String s2 = "world";
		String s3 = "java";
		
		System.out.println(s1 + s2 + s3);
		System.out.println(s1.length());//s1의 문자열길이
		
		//문자열과 다른데이터 타입의 +연산
		System.out.println(100 + 200);
		System.out.println(100 + "200");
		System.out.println(100 + 200 + "300"); //문자열에 다른타입이 붙으면 -> 결과는 무조건 문자열
		
		System.out.println('A' + 10);
		System.out.println("A" + 10);
		
		
		
	}
}
