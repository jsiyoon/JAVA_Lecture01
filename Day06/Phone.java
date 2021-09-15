package Day06;

public class Phone {
	String model;
	int price;
	String color;
	
	//생성자는 클래스 이름과 동일하고, 반환유형 없음.
	//반환타입을 가진것은 생성자가 아님.
	Phone() {
		System.out.println("생성자 호오오출!");
		model = "햅틱";
		price = 20000;
		color = "black";
	}
	
	//생성자 여러개 선언할 수 있습니다.
	//단, 매개변수 종류 or 개수를 다르게 해야함.
	Phone(String pModel){
		model = pModel;
		price = 30000;
		color = "red";
	}
	
	Phone(String pModel, int pPrice){
		model = pModel;
		price = pPrice;
		color = "white";
	}
	
	Phone(String pColor, int pPrice, String pModel){
		model = pModel;
		price = pPrice;
		color = pColor;
	}
	void info() {
		System.out.println("====휴대폰 정보====");
		System.out.println("모델:" + model);
		System.out.println("가격:" + price);
		System.out.println("색상:" + color);
	}
}
