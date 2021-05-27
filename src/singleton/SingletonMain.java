package singleton;

public class SingletonMain {
	public static void main(String[] args) {
		var bank = new BankAccount();
		bank.addBalance(25);
		bank.DrawBalance(11);
		String res = Singleton.getUniqueInstance().getLog();
		System.out.println(res);
	}
}
