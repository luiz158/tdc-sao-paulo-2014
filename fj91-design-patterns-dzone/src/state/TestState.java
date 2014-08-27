package state;

public class TestState {

	public static void main(String[] args) {
		String tvOption = "pause"; //use can select tv on or off
		
		TvContext tvContext = new TvContext();
		if (tvOption.equals("on")) {
			tvContext.setState(new TvStartState());
		} else if (tvOption.equals("off")) {
			tvContext.setState(new TvStopState());
		} else if (tvOption.equals("pause")) {
			tvContext.setState(new TvPauseState());
		}
		tvContext.doAction();
	}
	
}
