package import_ex;

//패키지 선언부 아래, 클래스 상단부에 import선언으로 패키지명을 포함한 사용할 클래스 지정.
import java.util.Scanner;

import fruit.*;
import com.abc.ABC;
import com.def.DEF;

public class MainClass {
	public static void main(String[] args) {
		Apple a = new Apple();
		Melon m = new Melon(); //import fruit.*로 fruit패키지에 있는 클래스 모두 사용가능
		
		ABC abc = new ABC();
		DEF def = new DEF(); //ctrl + space
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(a);
		System.out.println(m);
		System.out.println(abc);
		System.out.println(def);
		System.out.println(scan);
	}
}
