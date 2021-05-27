package singleton;

public class BankAccount {
	private int num;
	private double balance;

	public BankAccount(){}
	public BankAccount(int num, double balance) {
		this.num = num;
		this.balance = balance;
	}

	public void addBalance(double amount){
		balance += amount;
		Singleton.getUniqueInstance().addLog("added " + amount + "\n");
	}

	public void DrawBalance(double amount){
		balance += amount;
		Singleton.getUniqueInstance().addLog("retired " + amount + "\n");
	}

}
