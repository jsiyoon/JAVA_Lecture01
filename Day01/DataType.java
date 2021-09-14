package Day01;

public class DataType {
	public static void main(String[] args) {
		
		byte a = 127;
		byte a1 = -128;
		
		short b = 32767; //short는 2byte 
		short b1 = -32768;
		
		int c = 2147483647; //int는 4byte
		int c1 = -2147483648;
		
		long d = 214748648L; //L을 붙임
		System.out.println(d);
		
		/*
		 * 2진수 값으로 저장할떄 0b를 붙여저장
		 * 8진수 값으로 저장할때 0을 붙임
		 * 16진수 값으로 저장할때는 0x를 붙임
		 */
		
		int bin = 0b1010;
		System.out.println("2진수 1010의 값:"+ bin + "입니다.");
		
		System.out.println("------------------------------");
		
		//실수형
		float f1 = 3.14F; //f를 붙임 - 소수점 뒤 7자리까지 유효
		double d1 = 3.14; // 소수점 뒤 15자리 까지 유효
		
		System.out.println(f1);
		System.out.println(d1);
		
		//e표기법
		float f2 = 3.14159265e-2F;
		double d2 = 3.14159265e3;
		System.out.println(f2);
		System.out.println(d2);
		
		System.out.println("------------------------------");
		
		//논리형  참, 거짓(1바이트)
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println("------------------------------");
		
		
		
	}
}
