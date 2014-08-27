package state;

public class TvStartState implements State {

	@Override
	public void doAction() {
		System.out.println("Turning TV on");
	}

}
