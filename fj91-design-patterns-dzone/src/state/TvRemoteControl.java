package state;

public class TvRemoteControl {

	private String state;
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void doAction() {
		if (state.equals("ON")) { //internal state
			System.out.println("Turning TV on");
		} else if (state.equals("OFF")) {
			System.out.println("Turning TV off");
		}
	}
	
}
