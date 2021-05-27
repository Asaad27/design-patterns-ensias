package facade;

public class NotificationServer {
	//connect
	//Authenticate
	//send
	//disconnect

	public Connection connect(String ipAdress){
		return new Connection();
	}
	public AuthToken authenticate(String appID, String Key){
		return new AuthToken();
	}

	public void send(AuthToken authToken, Message message, String target){
		System.out.println("sending a message to " + target);
	}
}
