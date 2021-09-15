package encap.obj;

public class MainClass {
	public static void main(String[] args) {
		//Hotel안에 있는 chef와 emp의 사용
		Hotel h = new Hotel();
		
		//getter사용
		Chef chef = h.getChef();
		chef.cooking();
		
//		Employee emp = h.getEmp();
//		emp.working();
//		↓ 줄여서 쓴것
		h.getEmp().working();
		
		//setter의 사용
//		Chef c = new Chef();
//		h.setChef(c);
		h.setChef(new Chef());
	}
}
