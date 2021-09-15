package quiz01;

import java.util.Scanner;

public class Quiz23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액을 투입해 주세요>");
		int money = scan.nextInt();
		
		while(money >= 0) {
			System.out.println("남은금액: " + money + "원");
			System.out.println("[1]뎀이소다: 400원, [2]밀킥스: 500원, [3]코카콜라: 600원, [4]잔돈받기");
			System.out.print("음료수 선택>");
			int menu = scan.nextInt();
			boolean flag = false; //참, 거짓을 판단해 while문 실행 혹은 종료
			
			switch(menu) {
			case 1: 
				if(money >= 400) {
					money -= 400;
					System.out.println("뎀이소다를 받았습니다.\n");
				}
				else {
					System.out.println("금액이 부족합니다. 돈을 넣어 주세요!\n");
				}
				break;
				
			case 2:
				if(money >= 500) {
					money -= 500;
					System.out.println("밀킥스를 받았습니다.\n");
				}
				else {
					System.out.println("금액이 부족합니다. 돈을 넣어 주세요!\n");
				}
				break;
			case 3:
				if(money >= 600) {
					money -= 600;
					System.out.println("코카콜라를 받았습니다.\n");
				}
				else {
					System.out.println("금액이 부족합니다. 돈을 넣어 주세요!\n");
				}
				break;
			case 4:
				System.out.printf("남은 금액 %d을 반환합니다.\n\n", money);
				flag = true;
				break;
			default:
				System.out.println("잘못 입력 했습니다.");
				System.out.println("메뉴를 정확히 입력하세요.\n");
				break;
			}
			if(flag) break; //true라면 탈출
		}
	}
}
