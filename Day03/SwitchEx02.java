package Day03;

import java.util.Scanner;

public class SwitchEx02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수입력 :");
		int point = scan.nextInt();
		
		switch(point/10) {
		
		case 9 :
			if(point >= 95) {
				System.out.println("A+");
			}
			else {
				System.out.println("A0");
			}
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		case 6 :
			System.out.println("D");
			break;
		default :
			System.out.println("F");
			break;
		}
	}
}
