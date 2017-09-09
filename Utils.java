package CogRob;

public class Utils {
	/*****UTILS*****
	 * A class to put in functions that can be widely useful so there's no need for duplicate code.
	 */
	
	public Utils() {
	}
	
	public Robot addRobot(Strategy strategy, Utils utils, Robot robot) {
		robot.addStrategy(strategy);
		robot.addUtils(utils);
		return robot;
	}
	
}
