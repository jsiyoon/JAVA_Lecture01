package Day05;

import java.util.Arrays;

public class MethodEx04 {
	public static void main(String[] args) {
		//배열을 매개변수로 전달하고 받는 방법.
		//int[] arr;
		
		int[] arr = {1,2,3,4,5};
		method01(arr);
		
		String[] arr2 = method02();
		
		int[] arr3 = method03(arr);
		System.out.println(Arrays.toString(arr3));
		
	}
	
	//매개변수로 배열을 받는 메서드
	static void method01(int[] a) {
		System.out.println(Arrays.toString(a));
	}
	//배열을 반환유형으로 돌려주는 메서드
	static String[] method02() {
		
		String[] arr = {"월", "화", "수"};
		
		return arr;
	}
	//int배열을 매개변수로 받고, 전달받은 배열의 2배 크기를 만들어서 돌려주는 method3
	//안에 들어있는 원소값도 복사해서
	static int[] method03(int[] a) {
		
		int[] arr = new int[a.length * 2];
		
		for(int i = 0; i < a.length; i++) {
			arr[i] = a[i];
		}
		return arr;
	}
}
