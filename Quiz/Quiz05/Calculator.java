package Quiz05;

public class Calculator {
	int result;
	double pi = 3.14;
	
	int add(int a) {
		result += a;
		return result;
	}
	
	int sub(int b) {
		result -= b;
		return result;
	}
	double circle(int r){
		return r * r * pi;
	}
}
