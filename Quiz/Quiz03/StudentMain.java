package Quiz03;

public class StudentMain {
	public static void main(String[] args) {
		/*
		 * 멤버변수
		 * name - 학생리ㅡㅁ
		 * no 학생번호
		 * kor 국어점수
		 * eng 영어점수
		 * math 수학점수
		 *  
		 * 생성자
		 * 멤버변수 5개르 ㄹ초기화 하는 생성자
		 * getTotal() = 국어, 영어 수학점수를 모두 더해서 합계 반환
		 * getAvg() = 총점 나눈 평균 반환(소수점 2자리까지)
		 * 
		 * main에서는 학생의 2명을 각각 생성하고 두 학생의 평균 합 출력*/
		
		Student st1 = new Student("남준", 7, 90, 100, 85);
		Student st2 = new Student(1, 75, 65, 87);
		
		System.out.println("남준이의 성적 총합:" + st1.getTotal());
		System.out.println("정국이의 성적 총합:" + st2.getTotal());
		
		System.out.println("남준이의 성적 평균:" + st1.getAvg());
		System.out.println("정국이의 성적 평균:" + st2.getAvg());
		
		double AvgSum = st1.getAvg() + st2.getAvg();
		System.out.println("학생들의 평균 합:" + AvgSum);
		
		
	}
}
