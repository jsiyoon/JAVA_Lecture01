package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz13 {
	public static void main(String[] args) {
		//1.
		int[] arr = {1000, 500, 100, 50, 10}; //동전
		int money = 17520; //금액
		
		int i = 0;
		while(i < arr.length) {
			
			System.out.println(arr[i] + "원:" + money / arr[i]);
			money %= arr[i]; //money = money % arr[i]
			
			i++;
		}
		System.out.println();
		
		//2.양수를 입력받아, 입력 받은 수 크기의 배열을 생성하세요
		//배열에 1~입력 받은 수까지 차례대로 값을 넣으세요.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수를 입력하세요>");
		int num = scan.nextInt();
		
		int[] arr2 = new int[num];
		int j = 0;
		
		while(j < arr2.length) {
			arr2[j] = j+1;
			j++;
		}
		
		System.out.println("배열 arr2는 :" + Arrays.toString(arr2));
	}
}
