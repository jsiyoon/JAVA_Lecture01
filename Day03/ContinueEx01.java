package Day03;


public class ContinueEx01 {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			
			if(i % 2 == 0) continue;
			System.out.print(i);
		}
		System.out.println();
		System.out.println("------------------------");
		
		int i = 1;
		while(i <= 10) {
			
			if(i % 2 == 0) {
				i++;
				continue;
			}
			System.out.print(i);
			i++;
		}
	}
}
