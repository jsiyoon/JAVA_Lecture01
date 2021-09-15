package Quiz10;

public class MainClass {
	public static void main(String[] args) {
		Computer c = new Computer();
		
		KeyBoard kb = c.getKB();
		kb.info();
		
		Monitor mt = c.getMt();
		mt.info();
		
		c.getMs().info();
		
//		KeyBoard k = new KeyBoard();
//		c.setKB(k);
		c.setKB(new KeyBoard());
		c.setMt(new Monitor());
		c.setMs(new Mouse());
		
		System.out.println("======================");
		c.computerInfo();
	}
}
