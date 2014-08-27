package mediator;

public class MobileColleague extends Colleague {

	public MobileColleague(Mediator mediator) {
		super(mediator);
	}

	@Override
	protected void receive(String message) {
		System.out.println("Message Mobile received: " + message);
	}

}
