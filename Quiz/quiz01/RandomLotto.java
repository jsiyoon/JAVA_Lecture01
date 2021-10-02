package quiz01;

import java.util.Arrays;

public class RandomLotto {
	public static void main(String[] args) {
		/*
		 * 무작위로 생성된 로또번호를 이용하여 당첨되기 까지 금액을 알아보는
		 * 프로그램 입니다.
		 */ 
		
		System.out.println(run());
		
	}
	/* 1. 입력-x, 
	 * 2. 출력-길이가 6인 배열
	 * lotto함수는 1~45까지의 중복되지 않는 랜덤수를 배열에 넣어 반환하는 메서드 입니다.
	 * 이 메서드의 실행 결과는 당첨번호가 됩니다. 
	 */  
	static int[] lotto() {
		int[] arr = new int[6];
		
		int index = 0;
		
	wh: while(true) {
			
			int num = (int)(Math.random() * 45) + 1;
			
			for(int i = 0; i < index; i++) {
				if(arr[i]==num) {
					continue wh;
				}
			}
			arr[index] = num;
			index++;
			if(index==6) {
				break;
			}
		}
		return arr;
		
	}
	
	/* 2. 입력-당첨배열
	 * 3. 출력-long(당첨되기까지의 금액)
	 *  
	 * run함수는 당첨배열을 받아서 당첨되기까지 랜덤한 금액을 계산 하는 메서드입니다
	 * ***당첨의 조건***
	 * 당첨번호-[10,9,8,7,6,5]  //sorting(배열 비교)
	 * ex) [5,6,8,7,9,10] 당첨
	 * ex) [10,9,8,7,6,45] 당첨x
	 */
	static long run() {
		long price = 0;
		int index = 0;
		int[] arr2 = new int[6];
		
	wh: while(true) {
			
			int num = (int)(Math.random() * 45) + 1;
			
			for(int i = 0; i < index; i++) {
				if(arr2[i]==num) {
					continue wh;
				}
			}
			arr2[index] = num;
			index++;
			if(index==6) {
				System.out.println("당첨 번호 :" + Arrays.toString(arr2));
				break;
			}
		}
		
		Arrays.sort(arr2);
		
		while (true) {
			int[] arr3 = lotto();
			
			System.out.println("뽑으신 숫자:" + Arrays.toString(arr3));
			Arrays.sort(arr3);
			int count = 0;
			price += 1000;
			for(int i = 0; i < 6; i++) {
				if(arr2[i] == arr3[i]) {
					count++;
				}
				if(count == 6) {
					System.out.println("당첨되셨습니다!!");
					System.out.print("당첨을 위해 쓴 금액은:");
					return price;
				}
			}
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}

