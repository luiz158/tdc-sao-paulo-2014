package bridge;

public class ConcreteRemoteControl extends RemoteControl {

	private int currentChannel = 0;
	
	public ConcreteRemoteControl(Tv tv) {
		this.tv = tv;
	}
	
	public void nextChannel() {
		currentChannel++;
		setChannel(currentChannel);
	}
	
	public void prevChannel() {
		currentChannel--;
		setChannel(currentChannel);
	}
	
}
