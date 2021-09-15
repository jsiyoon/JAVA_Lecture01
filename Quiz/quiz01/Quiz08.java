package quiz01;

public class Quiz08 {
	public static void main(String[] args) {
		
		String[] arr = {"안녕하세요", "hi", "니취팔로마", "#$%"};
		
		int num = (int)(Math.random() * arr.length);//배열의 길이로 설정해주는것이 좋음
		
		System.out.println("선택된 단어:" + arr[num]);
		
		switch(num) {
		
		case 0:
			System.out.println("한국어");
			break;
		case 1: 
			System.out.println("영어");
			break;
		case 2:
			System.out.println("중국어");
			break;
		case 3:
			System.out.println("외계어");
			break;
		}
	}	
}
