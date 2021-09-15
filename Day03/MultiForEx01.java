package Day03;

public class MultiForEx01 {
	public static void main(String[] args) {
		
//		for(int i = 1 ; i <= 9; i++) {
//			for(int j = 1; j <= 9; j++) {
//				System.out.println(i + "-" + j);
//			}
//		}
		System.out.println("-------------------------");
		
		//구구단 1단 ~ 9단
		for(int i = 1; i <= 9; i++) {//단수
			
			System.out.println("구구단" + i + "단");
			
			for(int j = 1; j <=9; j++) {//행수
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		
		//바깥 반복문 회전수에 따라 안쪽 반복문의 회전이 변경되는 형태
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.println(i + "-" + j);
			}
		}
	}
}
