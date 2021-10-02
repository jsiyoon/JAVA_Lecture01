package Day12.constant;

public class constant_EX {
	public static void main(String[] args) {
		//상수 사용법
		System.out.println(Table.PI);
		System.out.println(Table.O2);
		System.out.println(Table.EARTH_RADIUS);
	}
	
	class Table{
		public static final double PI = 3.14;
		public static final int O2 = 32;
		public static final long EARTH_RADIUS = 6400L;
	}
}
