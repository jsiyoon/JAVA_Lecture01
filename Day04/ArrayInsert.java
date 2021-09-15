package Day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[100];//크기 100인 배열
		int count = 0; //음식의 개수
		
		System.out.println("먹고 싶은 음식이 뭐에요?");
		System.out.println("입력만 한번 해보세요.");
		
		while(true) {
			System.out.print(">");
			String menu = scan.nextLine();
			
			if(menu.equals("그만")) { //문자열은 '=='동등기호 사용 불가
				System.out.println("입력종료!");
				break;
			}
			
			arr[count] = menu;
			count++;
			
		}
		//System.out.println(Arrays.toString(arr));
		
		System.out.print("먹고싶은 음식:[");
		for(int i = 0; i < count; i++) {
			System.out.print(arr[i]);
			if(i == count - 1) break;
			System.out.print(",");
		}
		System.out.println("]");
	}
}
