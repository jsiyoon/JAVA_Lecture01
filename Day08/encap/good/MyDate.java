package encap.good;

public class MyDate {
	private int year;
	private int month;
	private int day;
	private String ssn;
	
	/*
	 * 은닉된 변수에 값을 저장할 때, 클래스 설계자가 미리 작성해놓은
	 * getter / setter 메서드 사용.
	 */
	
	 /* setter메서드 선언
	 * 1. 값을 저장하기 위한 메서드
	 * 2. 접근제어자 public으로, 이름은 set + 멤버변수명으로 지정
	 */
	public void setYear(int year) {
		if(year < 1900 || year > 2021) {
			System.out.println("잘못된 값 입력입니다");
		}
		else {
			this.year = year;
		}
	}
	public void setMonth(int month) { //month 1~12월
		if(month < 1 || month > 12) {
			System.out.println("잘못된 입력 값 입니다.");
		}
		else {
			this.month = month;
		}
	}
	public void setDay(int day) { //day 1~31일
		if(day < 1 || day > 31) {
			System.out.println("잘못된 입력 값 입니다.");
		}
		else {
			this.day = day;
		}
	}
	public void setSsn(String ssn) { //ssn 13자리 까지만 저장 .length()이용
		if(ssn.length() == 13) {
			this.ssn = ssn;
		}
		else {
			System.out.println("-를 제외한 13자리 수를 입력하세요.");
		}
	}
	
	/*
	 * getter메서드의 선언
	 * 1. 값을 조회하기 위한 메서드
	 * 2. 접근제어자 public으로, 이름은 get + 멤버변수명으로 지정
	 */
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public String getSsn() {
		return ssn;
	}
}
