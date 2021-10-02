package poly.person;

public class MainClass {
	
	public static void main(String[] args) {
		/*다형성 적용하지 않은 경우
		 * 
		Student hong = new Student("홍길동", 15, "13");
		Student lee = new Student("이순신", 17, "21");
		Student park = new Student("박찬호", 13, "34");
		Teacher son = new Teacher("손흥민", 23, "체육");
		Teacher lim = new Teacher("임혁재", 43, "음악");
		Employee kim = new Employee("김유신", 50, "행정");

		
		Student[] arr1 = {hong, lee, park};
		Teacher[] arr2 = {son, lim};
		Employee[] arr3 = {kim};
		*/
		
		
		//다형성 적용한 경우
		Student hong = new Student("홍길동", 15, "13");
		Student lee = new Student("이순신", 17, "21");
		Student park = new Student("박찬호", 13, "34");
		Teacher son = new Teacher("손흥민", 23, "체육");
		Teacher lim = new Teacher("임혁재", 43, "음악");
		Employee kim = new Employee("김유신", 50, "행정");

		Person[] arr = {hong, lee, park, son, lim, kim};
		
		for(Person p: arr) {
			System.out.println(p.info());
		}
		
		System.out.println("------------------------------");
		
		House h = new House();
		h.print(hong);
		
		h.print(lim);
		h.print(kim);
	}
}
