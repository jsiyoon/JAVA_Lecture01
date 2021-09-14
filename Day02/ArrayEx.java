package Day02;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		
		//1.배열의 선언
		int [] arr;
		
		//2.배열의 생성 - 배열을 생성시에 크기를 지정
		arr = new int[5];
		System.out.println(arr);//배열의 주소값(0번째 상자가 만들어진 위치)
		
		//3.배열의 초기화
		arr[0] = 34;
		arr[1] = 100;
		arr[2] = 300;
		arr[3] = 56;
		arr[4] = 1;
		
		//4.배열의 사용
		System.out.println("배열의 첫번째 값:" + arr[0]);
		arr[0] = 50;
		System.out.println("배열의 첫번째 값:" + arr[0]);
		
		//5.배열의 저장된 값을 한눈에 문자열의 형태로 확인.
		System.out.println(Arrays.toString(arr));
		 
		//6. 배열의 길이를 확인하는 명령 배열명 .length
		System.out.println("배열의 길이:" + arr.length);
		System.out.println("배열의 마지막:" +arr[arr.length-1]);
		
		
		//7.배열의 선언과 생성을 동시에
		byte[] arr2 = new byte[7];
		
		//8.배열의 선언과 생성, 초기화를 동시에
		int[] arr3 = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr3));
		
		//9.배열의 초기값을 지정하지 않으면 기본값으로 자동 초기화 0, 0.0, null
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("----------------------------------");
		
		//문자열 배열에 월요일, 화요일 수요일을 저장하고 출력
		String[] arr4 = {"월요일", "화요일", "수요일"};
		System.out.println(Arrays.toString(arr4));
		
		//3개의 크기, int배열 생성하고, 각각 랜덤값을 저장하고 출력
		int[] arr5 = new int[3];
		arr5[0] = (int)(Math.random() * 10) + 1;
		arr5[1] = (int)(Math.random() * 10) + 1;
		arr5[2] = (int)(Math.random() * 10) + 1;
		System.out.println(Arrays.toString(arr5));
	}
}
