package bridge;

public class Phillips implements Tv {

	@Override
	public void on() {
		System.out.println("Turning on Phillips");
	}

	@Override
	public void off() {
		System.out.println("Turning off Phillips");
	}

	@Override
	public void setChannel(int channel) {
		System.out.println("Set channel Phillips to " + channel);
	}

}
