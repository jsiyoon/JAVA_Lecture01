package Quiz03;

public class Account {
	String name;
	String password;
	int balance;
	
	Account(String pname, String ppassword, int pbalance){
		name = pname;
		password = ppassword;
		balance = pbalance ;
	}
	
	void deposit(int money) {
		balance += money;
	}
	
	void withDraw(int money) {
		balance -= money;
	}
	
	int getBalance() {
		
		return balance;
	}
}
