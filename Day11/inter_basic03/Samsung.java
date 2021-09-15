package inter_basic03;

public class Samsung implements Printed{

	@Override
	public void print(String document) {
		System.out.println("삼성프린트");
	}

	@Override
	public void color(String document, String color) {
		System.out.println("삼성프린트");		
	}

	@Override
	public int copy(int n) {
		System.out.println("삼성프린트");
		return n;
	}
}
