package bridge;

public abstract class RemoteControl implements Tv {

	protected Tv tv;
	
	@Override
	public void on() {
		tv.on();
	}
	
	@Override
	public void off() {
		tv.off();
	}
	
	@Override
	public void setChannel(int channel) {
		tv.setChannel(channel);
	}
	
}
