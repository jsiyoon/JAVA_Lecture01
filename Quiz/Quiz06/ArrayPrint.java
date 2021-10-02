package Quiz06;

public class ArrayPrint {
	//Arrays.toString기능을 따라해보기(int배열, String배열, char배열)을 각각 받아서
	//배열 내부 요소를 문자열의형태로 가로로 반환해주는 메서드 오버로딩
	
	String arr(int[] a) {
		String str = "";
		for(int i = 0; i < a.length; i++) {
			str += a[i];
			if(i < a.length -1) str += ", ";
		}
		return "[" + str + "]";
	}
	String arr(String[] a) {
		String str = "";
		for(int i = 0; i < a.length; i++) {
			str += a[i];
			if(i < a.length -1) str += ", ";
		}
		return "[" + str + "]";	}
	String arr(char[] a) {
		String str = "";
		for(int i = 0; i < a.length; i++) {
			str += a[i];
			if(i < a.length -1) str += ", ";
		}
		return "[" + str + "]";
	}
}
	