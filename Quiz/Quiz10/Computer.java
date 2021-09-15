package Quiz10;

public class Computer {
	//키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	private KeyBoard KB;
	private Monitor Mt;
	private Mouse Ms;
	
	//기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	public Computer(){
		this.KB = new KeyBoard();
		this.Mt = new Monitor();
		this.Ms = new Mouse();
	}

	//키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	public void computerInfo() {
		this.KB.info(); //this를 붙이든 안붙이든 상관없음
		Mt.info();
		Ms.info();
	}
	
	//키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
	public void setKB(KeyBoard KB) {
		this.KB = KB;
	}
	public KeyBoard getKB() {
		return KB;
	}
	
	public void setMt(Monitor Mt) {
		this.Mt = Mt;
	}
	public Monitor getMt() {
		return Mt;
	}
	
	public void setMs(Mouse Ms) {
		this.Ms = Ms;
	}
	public Mouse getMs() {
		return Ms;
	}
	//메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
	
	
	
}
