package str_ex;

public class MainClass {
	public static void main(String[] args) {
		//문자열 비교
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		char[] arr = {'홍','길','동'};
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		/*
		 * 같은 클래스 내부에서 문자열 저장하면, 동일한 문자일 경우는 같은 주소를 참조
		 * 
		 * 하지만, 직접 문자열생성 하거나, 다른 클래스에서 넘어온 문자열은 다른 주소를 가지게 됨
		 * 그래서 문자열 동등 비교는 ==대신 문자열 자체를 비교해주는 equals()메서드 이용해
		 * 문자열 자체를 비교해야한다.
		 */
		
		System.out.println(str1 == str2); //주소의 비교
		System.out.println(str2 == str3);
		
		if(str1.equals(str2)) {
			System.out.println("문자열 자체가 같음");
		}
	}
}
