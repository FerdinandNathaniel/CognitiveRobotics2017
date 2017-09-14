package CogRob;

public class LightRobotStrategy_Fear implements Strategy {
	/*****LIGHTROBOTSTRATEGY*****
	 * The strategy our lightRobot will have to use, it's as follows:
	 * - Let one wheel keep turning whilst the other stays still
	 * - If light sensor readings come above a certain threshold let the still wheel turn as fast as the other wheel
	 * 
	 * Has a Robot object so it can use everything a Robot has whilst keeping strategy-specific functions contained in this class.
	 */
	
	public LightRobotStrategy_Fear () {
	}

	@Override
	public void startStrategy(Robot robot) {
		if(robot.getClass() == LightRobot.class) {
			LightRobot robott = (LightRobot) robot;
			System.out.println("Starting LightRobotStrategy - Fear");
		}
		else {
			System.out.println("Pairing non-LightRobot class Robot with LightRobotStrategy");
		}
	}

}
