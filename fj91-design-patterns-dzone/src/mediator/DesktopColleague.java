package mediator;

public class DesktopColleague extends Colleague {

	public DesktopColleague(Mediator mediator) {
		super(mediator);
	}

	@Override
	protected void receive(String message) {
		System.out.println("Message Desktop received: " + message);
	}

}
