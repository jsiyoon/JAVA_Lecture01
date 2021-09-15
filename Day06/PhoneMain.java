package Day06;

public class PhoneMain {
	public static void main(String[] args) {
		Phone black = new Phone();
		black.info();
		
		Phone iphone = new Phone("아이폰");
		iphone.info();
		
		Phone galaxy = new Phone("갤럭시노트10",1000000);
		galaxy.info();
		
		//모든 멤버변수 받는 생성자 만들고, 초록색, 100000원, 가로본능으로 객체 생성
		Phone nPhone = new Phone("green", 100000, "가로본능");
		nPhone.info();
	}
}
