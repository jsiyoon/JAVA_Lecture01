package abs.bad;

public class SeoulStore extends HeadStore{
	public void apple() {
		System.out.println("서울지점 사과는 500원 입니다.");
	}
	public void banana() {
		System.out.println("서울지점 바나나는 600원 입니다.");
	}
	public void grape() {
		System.out.println("서울지점 포도는 700원 입니다.");
	}
	//프로그래머 실수로 melon오버라이딩 빼먹음
}
