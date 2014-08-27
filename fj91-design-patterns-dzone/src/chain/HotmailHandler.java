package chain;

public class HotmailHandler implements EmailHandler {

	private EmailHandler next;

	@Override
	public void setNext(EmailHandler handler) {
		this.next = handler;
	}

	@Override
	public void handleRequest(Email email) {
		if (!email.getEmail().endsWith("hotmail.com") && next != null) {
			if (next != null) {
				next.handleRequest(email);
			} else {
				throw new RuntimeException("Tipo nao suportado");
			}
		} else {
			System.out.println("Hotmail recebido!");
		}
	}

}
