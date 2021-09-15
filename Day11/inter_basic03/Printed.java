package inter_basic03;

public interface Printed {

	//사용방법을 규격화
	public void print(String document);
	public void color(String document, String color);
	public int copy(int n);
}
