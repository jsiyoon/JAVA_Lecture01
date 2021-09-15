package encap.good;

public class MainClass {
	public static void main(String[] args) {
		MyDate me = new MyDate();
//		me.year = 2021;	//private임으로 선언 불가
//		me.setYear(2022);  //범위값을 초과함
		
		me.setYear(2021);
		System.out.println("년도:" + me.getYear());
		me.setMonth(7);
		System.out.println("월:" + me.getMonth());
		me.setDay(22);
		System.out.println("일:" + me.getDay());
		me.setSsn("2107220123456");
		System.out.println("주민등록번호:" + me.getSsn());
	}
}
