package mediator;

public interface Mediator {

	void send(String message, Colleague originator);
	
	void addColleague(Colleague colleague);
	
}
