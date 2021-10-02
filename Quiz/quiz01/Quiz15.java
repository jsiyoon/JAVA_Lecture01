package quiz01;

import java.util.Arrays;

public class Quiz15 {
	public static void main(String[] args) {
		
//		int x = 50;
//		int y = 100;
//		int z = x;
//		
//		x = y;
//		y = z;
//		System.out.println(x + " " + y + " " + z);
		
		
		//아래 배열에서 절대 중복되지 않는 값을 3개 추출해서 새로운 배열을 만드는 과정.
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		//1. 랜덤수를 생성하고 랜덤 index번째 값과 위치를 변경
		
		for(int i = 0; i < arr.length ; i++) {
			int num = (int)(Math.random() * arr.length);
			
			int temp = arr[i];
			arr[i] = arr[num];
			arr[num] = temp;
			
		}
		
		//2. 0~2번째 까지 값을 길이가 3인 배열에 담아주기
		int[] arr2 = new int[3];
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(arr2));
	}
}
