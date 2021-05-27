package facade;

public class FacadeMain {
	public static void main(String[] args) {
		var service = new NotificationService();
		service.send("hi", "target");
	}
}
