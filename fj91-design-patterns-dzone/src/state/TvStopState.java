package state;

public class TvStopState implements State {

	@Override
	public void doAction() {
		System.out.println("Turning TV off");
	}
	
}
