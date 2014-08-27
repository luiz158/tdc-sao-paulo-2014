package state;

public class TvContext {

	private State state;
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void doAction() {
		this.state.doAction();
	}
	
}
