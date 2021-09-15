package Quiz06;

public class MainClass {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		String[] arr2 = {"Apple", "Banana", "Peach", "Grape"};
		char[] arr3 = {'a', 'b', 'c', 'd', 'e'};
		
		ArrayPrint ap = new ArrayPrint();
		
		System.out.println(ap.arr(arr));
		System.out.println(ap.arr(arr2));
		System.out.println(ap.arr(arr3));
	}
}
