package abs.bad;

public class MainClass {
	public static void main(String[] args) {
		
		//프로그래머가 실수로 오버라이딩 빼먹었다면,
		//바로 잘못된 메서드 실행으로 이어질 수 있음.
		SeoulStore s = new SeoulStore();
		s.apple();
		s.banana();
		s.grape();
		s.melon(); 
		//큰 프로그램을 만드는경우 아주 큰 실수가 될수 있음
	}
}
