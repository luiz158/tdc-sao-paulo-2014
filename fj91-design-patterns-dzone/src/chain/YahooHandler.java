package chain;

public class YahooHandler implements EmailHandler {

	private EmailHandler next;

	@Override
	public void setNext(EmailHandler handler) {
		this.next = handler;
	}

	@Override
	public void handleRequest(Email email) {
		if (!email.getEmail().endsWith("yahoo.com")) {
			if (next != null) {
				next.handleRequest(email); 
			} else {
				throw new RuntimeException("Tipo nao suportado");
			}
		} else {
			System.out.println("Yahoo recebido!");
		}
	
	}

}
