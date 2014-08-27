package mediator;

import java.util.ArrayList;
import java.util.List;

public class ApplicationMediator implements Mediator {

	private List<Colleague> colleagues = new ArrayList<>();
	
	@Override
	public void addColleague(Colleague colleague) {
		this.colleagues.add(colleague);
	}

	@Override
	public void send(String message, Colleague originator) {
		for (Colleague colleague : this.colleagues) {
			if (colleague != originator) {
				colleague.receive(message);
			}
		}
	}

}
