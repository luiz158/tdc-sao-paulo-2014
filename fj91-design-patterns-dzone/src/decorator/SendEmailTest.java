package decorator;

public class SendEmailTest {

	public static void main(String[] args) {
		String emailType = "secure";
		
		if (emailType.equals("intranet")) {
			Email email = new EmailDefault("Sending email default");
			System.out.println("Content: " + email.getContent());
		}
		else if (emailType.equals("secure")) {
			EmailDecorator email = new EmailSecureDecorator(new EmailDefault("Sending email default"));
			System.out.println("Content: " + email.getContent());
		}
	}
	
}
