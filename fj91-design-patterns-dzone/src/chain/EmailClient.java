package chain;

public class EmailClient {

	private EmailProcessor processor;
	
	public EmailClient() {
		processor = new EmailProcessor();
		processor.addHandler(new HotmailHandler());
		processor.addHandler(new GmailHandler());
	}

	public void handle(Email email) {
		processor.handle(email);
	}
	
}
