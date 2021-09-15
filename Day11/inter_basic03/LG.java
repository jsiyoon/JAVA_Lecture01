package inter_basic03;

public class LG implements Printed{

	@Override
	public void print(String document) {
		System.out.println("Life is good");
		System.out.println("문서내용:" + document);
	}

	@Override
	public void color(String document, String color) {
		System.out.println("Life is good");
		System.out.println("문서내용:" + document + ", 색상:" + color);
	}

	@Override
	public int copy(int n) {
		System.out.println("Life is good");
		for(int i = 0; i <= n; i++) {
			System.out.println(i+"장 복사완료");
		}
		return n;
	}
}
