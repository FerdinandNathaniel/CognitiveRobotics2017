package CogRob;

public class Main {
	/**
	 * Main only used to initialize needed objects, throw these into Hub and start the programme from there.
	 * @param args
	 */

	public static void main(String[] args) {
		//Make objects to put in Hub
		Strategy lightRobotStrategy = new LightRobotStrategy();
		Utils utils = new Utils();
		Robot lightRobot = new LightRobot();
		
		//Make Hub object and fill it with above objects
		Hub hub = new Hub(lightRobotStrategy, utils, lightRobot);
		
		//Run programme
		hub.runProgramme();
	}

}
