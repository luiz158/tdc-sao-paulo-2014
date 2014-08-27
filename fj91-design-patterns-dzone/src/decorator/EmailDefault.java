package decorator;

public class EmailDefault implements Email {

	private String content;

	public EmailDefault(String content) {
		this.content = content;
	}

	@Override
	public String getContent() {
		return content;
	}

}
