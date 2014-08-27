package chain;

public interface EmailHandler {

	void setNext(EmailHandler handler);
	
	void handleRequest(Email email);
}
