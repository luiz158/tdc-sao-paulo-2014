package state;

public class TvPauseState implements State {

	@Override
	public void doAction() {
		System.out.println("Turning TV pause");
	}

}
