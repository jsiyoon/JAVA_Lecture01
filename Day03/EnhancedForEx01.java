package Day03;

public class EnhancedForEx01 {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		
//		for(int i = 0; i <= arr.length; i++ ) {
//			
//			System.out.println(arr[i]);
//		}
		
		for(int i : arr) {
			System.out.println(i);
		}
		System.out.println("---------------------------------");
		
		String[] arr2 = {"월", "화", "수", "목", "금", "토", "일"};
		
		for(String s : arr2) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("---------------------------------");
		
		
		int[] arr3 = {10,20,30,40,54}; //합계, 평균
		
		int sum = 0;
		for(int a : arr3) {
			sum += a;
		}
		
		double avg = sum / (double)arr.length;
		System.out.println("합계:" + sum);
		System.out.println("평균:" + avg);
	}
}
