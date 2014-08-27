package bridge;

public class Sony implements Tv {

	@Override
	public void on() {
		System.out.println("Tunring on Sony");
	}

	@Override
	public void off() {
		System.out.println("Tunring off Sony");
	}

	@Override
	public void setChannel(int channel) {
		System.out.println("Set channel Sony to " + channel);
	}

}
