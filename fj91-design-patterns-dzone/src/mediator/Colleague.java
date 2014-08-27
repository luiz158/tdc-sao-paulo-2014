package mediator;

public abstract class Colleague {

	private Mediator mediator;
	
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void send(String message) {
		this.mediator.send(message, this);
	}
	
	protected abstract void receive(String message);
	
}
