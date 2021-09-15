package quiz01;

public class Quiz17 {
	public static void main(String[] args) {
		//큐브 구구단
		for(int i = 1; i <= 9; i += 3) {
			for(int k = 1; k <= 9; k++) {
				for(int j = 1; j <= i+3 ; j++) {
					System.out.printf("%d x %d = %d\t", i, k, i*k );
				}
				System.out.println();
			}
			System.out.println("\n");
		}
	}

}
