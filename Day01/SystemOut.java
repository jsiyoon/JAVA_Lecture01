package Day01;

public class SystemOut {
	
	public static void main(String[] args) {
		//main이라고 적고 ctrl + space누르면 위와 같이 main블록 자동생성
		
		/* 주석 여러줄로 적기
		 * ctrl + F11 ==> 실행단축키
		 */
		
		System.out.println("줄바꾸기공부~");
		System.out.println("줄바꾸기 테스트");
		
		System.out.println(); //sysout적고 ctrl + space누르면 이와 같이 print문 생성
		
		System.out.print("줄바꿈이 없습니다.\n"); //개행을 포함하지 않는 프린트문
		
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.\n",2021,8,10); //형식지정 출력문 printf()  
															  //ex)%d, %f, %s등을 집어 넣을 수 있는 곳
		
		/*
		 * \n 줄바꿈
		 * \t 탭 띄어쓰기
		 * %d 숫자형식 입력받음
		 * %s 문자열 입력받음
		 * %f 실수형식 입력받음
		 */
		
		
		  System.out.printf("원주율은 %f입니다.\n",3.141592);
		  System.out.printf("제 이름은 %s입니다.\n", "정시윤");
		 
		
		
		/*
		 * 전체선택 - ctrl + A
		 * 주석단축키 - ctrl + / 
		 * 주석전체 단축기 - ctrl + shift + /	==> 주석전체 취소방법 ctrl + shift + \ 
		 * 되돌리기 - ctrl + z
		 * 코드이동 커서두고 -  alt + 방향키
		 * 이름 한번에 수정  - alt + shift + r
		 * 블록지정  - shift + 방향키
		 * 코드 정리 - ctrl + shift + f
		 */
		
		
	}
}
