package Quiz03;

public class Student {
	String name;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String pname, int pno, int pkor, int peng, int pmath){
		name = pname;
		no = pno;
		kor = pkor;
		eng = peng;
		math = pmath;
	}
	
	Student(int pno, int pkor, int peng, int pmath){
		name = "정국";
		no = pno;
		kor = pkor;
		eng = peng;
		math = pmath;
	}
	
	double getTotal() {
		return kor + eng + math;
	}
	
	double getAvg() {
		double avg = (int)(getTotal() / 3 * 100) / 100.0;
		return avg;
	}
}
