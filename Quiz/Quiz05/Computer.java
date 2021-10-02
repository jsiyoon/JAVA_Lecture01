package Quiz05;

public class Computer extends Calculator{
	double circle(int r) {
		return r * r * Math.PI;
	}
	double rect(double a) {
		return a * a;
	}
	int rect(int a, int b) {
		return a * b;
	}
	int rect(int a, int b, int c) {
		return a * b * c;
	}
}
