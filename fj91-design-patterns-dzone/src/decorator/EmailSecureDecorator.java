package decorator;

public class EmailSecureDecorator extends EmailDecorator {

	public EmailSecureDecorator(Email originalEmail) {
		this.originalEmail = originalEmail;
	}

	@Override
	public String getContent() {
		return this.originalEmail.getContent() + " with security"; //decoring
	}

}
