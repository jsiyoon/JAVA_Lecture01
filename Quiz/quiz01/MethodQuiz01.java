package quiz01;

import java.util.Arrays;

public class MethodQuiz01 {
	public static void main(String[] args) {
		method1();
		
		String str = method2("A");
		System.out.println(str);
		
		double sum = method3(5, 7, 3.5);
		System.out.println(sum);
		
		System.out.println(method4(5));
		
		method5("가", 10);
		System.out.println();
		
		System.out.println(maxNum(100, 37));
		
		System.out.println(abs(-75));
		
		
		char[] arr2 = {'A', 'p', 'p', 'l', 'e'};
		System.out.println(method6(arr2));
		
		int[] arr = {1,2,3,4,5};
		System.out.println(method7(arr));
		
		System.out.println(Arrays.toString(method8("시윤","윤선")));
	}
	
	static void method1(){
		System.out.println("안녕");
	}
	
	static String method2(String a) {
		return a;
	}
	
	static double method3(int b, int c, double d) {
		double sum = 0;
		sum = b + c + d;
		return sum;
	}
	
	static String method4(int num) {
		
		if(num % 2 == 0) {
			return "짝수";
		}
		else {
			return "홀수";
		}
	}
	
	static void method5(String a, int b) {
		
		for(int i = 1; i <= b; i++) {
			System.out.print(a);
		}
	}
	
	static int maxNum(int a, int b) {
//		if(a>b) {
//			return a;
//		}
//		else {
//			return b;
//		}
		return a == b ? 0 : (a > b ? a : b);
	}
	
	static int abs(int num) {
//		if(num < 0) {
//			return -num;
//		}
//		else {
//			return num;
//		}
		return num > 0 ? num : -num;
	}
	
	static String method6(char[] a) {
		String str = "";
//		for(int i = 0; i < a.length; i++) {
//			System.out.print(a[i]);
//		}
		for(char c : a) {
			str += c;
		}
		return str;
	}
	
	static int method7(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	static String[] method8(String a, String b) {
		String arr[] = {a,b};
				
		return arr;
	}
}
