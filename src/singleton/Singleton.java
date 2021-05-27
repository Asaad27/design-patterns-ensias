package singleton;

public class Singleton {
	private static Singleton uniqueInstance;
	private String log;

	private Singleton() {
		log = "";
	}

	public static synchronized Singleton getUniqueInstance() {
		if (uniqueInstance == null){
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

	public String getLog() {
		return log;
	}

	public void addLog(String log){
		this.log += log;
	}
}
