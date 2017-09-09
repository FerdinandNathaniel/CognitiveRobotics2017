package CogRob;

public class Main {

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
