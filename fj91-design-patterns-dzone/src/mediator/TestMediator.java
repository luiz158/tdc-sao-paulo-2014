package mediator;

public class TestMediator {

	public static void main(String[] args) {
		Mediator mediator = new ApplicationMediator();
		
		DesktopColleague desktopColleague = new DesktopColleague(mediator);
		mediator.addColleague(desktopColleague);
		
		MobileColleague mobileColleague = new MobileColleague(mediator);
		mediator.addColleague(mobileColleague);
		
		mobileColleague.send("Message from Mobile");
		desktopColleague.send("Message from Desktop");
		
	}
	
}
