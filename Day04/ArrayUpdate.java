package Day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUpdate {
	public static void main(String[] args) {
		//배열의 변경
		//입력 -> 있는지 없는지 탐색 -> 변경
		
		Scanner scan = new Scanner(System.in);
		String[] arr = {"남준", "석진", "윤기", "호석", "지민", "태형", "정국"};
		
		System.out.print("수정할 별명을 입력하세요>");
		String name = scan.next();
		
		boolean flag = false;
		for(int i = 0; i < arr.length; i++) {
			if(name.equals(arr[i])) {//수정할 학생이 있는 경우
				System.out.print("변경할 이름을 작성하세요>");
				String s = scan.next();
				arr[i] = s;
				flag = true; //if문을 실행했다는 증거
			}
		}
		//결과
		if(flag) {
			System.out.println("이름이 정상적으로 수정되었습니다!");
			System.out.println(Arrays.toString(arr));
		}
		else {
			System.out.println("찾는 이름이 없습니다!");
		}
	}
}
