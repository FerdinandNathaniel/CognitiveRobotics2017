package CogRob;

public class Hub {
	/*****HUB*****
	 * Starting point of the programme, contains at least:
	 * - A strategy for the robot to use
	 * - Utility functions for ease of use
	 * - A robot
	 */
	
	/************************************************SINGULAR ROBOT************************************************/
	protected Strategy strategy;
	protected Utils utils;
	private Robot robot; //Without the Robot interface this would have needed to be redefined every new robot we make
	
	public Hub () {
	}
	
	public Hub (Strategy strategy, Utils utils, Robot robot) {
		this.strategy = strategy;
		this.utils = utils;
		this.robot = robot;
	}
	
	
	/************************************************MULTIPLE ROBOTS***********************************************/
	/**Multiple robots:
	public static Strategy currentStrategy1 = null;
	public static Strategy currentStrategy2 = null;
	private Robot robot1;
	private Robot robot2;
	private Utils utils;
	
	public Hub (Robot robot1, Robot robot2, Strategy strategy1, Strategy strategy2) {
		this.currentStrategy1 = strategy1;
		this.currentStrategy2 = strategy2;
		this.utils = utils;
		this.robot1 = utils.addRobot(strategy1, utils, robot);
		this.robot2 = utils.addRobot(strategy2, utils, robot);
	}
	 */
	
	
	public void runProgramme() {
		robot.runStrategy();
	}

}
