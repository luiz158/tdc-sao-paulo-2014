package chain;

public class EmailProcessor {

	private EmailHandler prevHandler; //guardamos a referencia de um Handler para outro
	
	public void addHandler(EmailHandler handler) {
		if (this.prevHandler != null) {
			this.prevHandler.setNext(handler);
		}
		this.prevHandler = handler;
	}

	public void handle(Email email) {
		prevHandler.handleRequest(email);
	}
	
}
