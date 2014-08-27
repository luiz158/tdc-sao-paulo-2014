package chain;

public class TestChain {

	public static void main(String[] args) {
		EmailClient client = new EmailClient();
		client.handle(new Email("alexandre@hotmail.com"));
	}
	
}
