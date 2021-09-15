package Day01;

public class Casting02 {
	public static void main(String[] args) {
		/*
		 * 크기가 큰 타입을 작은 타입으로 변환할 때는 (Type)캐스팅을 이용하여
		 * 명시적으로 변환 해야합니다. 
		 */
		int i = 65;
		char c = (char)i; 
		short s = (short)i;
		
		System.out.println(c);
		System.out.println(s);
		
		double d =3.14;
		int k = (int)d; 
		
		//강제 타입변환시 주의점은 해당 값을 받을 수 없는 범위가 들어오면 잘려나가고 남은값이 저장됨.
		int a = 1000;
		byte b = (byte)a;
		System.out.println(b);
		
		//예외경우
		//char, short는 예외적으로 명시적 형변환을 해야합니다.
		char cc = 'A';
		short ss = (short)cc;
		
	}
}
