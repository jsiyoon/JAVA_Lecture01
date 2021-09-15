package Day04;

import java.util.Scanner;

public class ArrayDelete {
	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		//4번째 인덱스의 삭제 표현
//		for(int i = 4; i < arr.length-1; i++) {
//			arr[i] = arr[i+1];
//		}
//		System.out.println(Arrays.toString(arr));
		
		//별명입력 -> 탐색 -> 당겨오기
		Scanner scan = new Scanner(System.in);
		String[] arr = {"남준", "석진", "윤기", "호석", "지민", "태형", "정국"};
		String name = scan.next();
		
		int count = arr.length; //사람수(변수화)
		boolean flag = false;//삭제 여부 변수
		
		for(int i = 0; i < count; i++) {
			if(name.equals(arr[i])) {//삭제할 사람을 찾은 경우
				System.out.println(name + "을 삭제합니다.");
				
				//뒤에 인덱스를 하나씩 당겨오기
				for(int j = i; j < count-1; i++) {
					arr[j] = arr[j+1];
				}
				
				//삭제의 의미
				count--;
				flag = true;
			}
		}
		
		//결과
		if(flag) {//삭제가 됨
			for(int i = 0; i < count; i++) {
				System.out.println("======삭제 후 정보======");
				System.out.print(arr[i] + " ");
			}
			System.out.println("\n=======================");
		}
		else {
			System.out.println("삭제 할 별명이 없습니다.");
		}
	}
}
