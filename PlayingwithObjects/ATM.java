package PlayingwithObjects;

public class ATM {
	
	public static void main(String[] args) {
		
		BankAccount b  = new BankAccount();
		b.deposit(100).withdraw(50).withdraw(20).deposit(90).checkBalance();

	}

}
