package CogRob;

public class LightRobotStrategy implements Strategy {
	/*****LIGHTROBOTSTRATEGY*****
	 * The strategy our lightRobot will have to use, it's as follows:
	 * - Let one wheel keep turning whilst the other stays still
	 * - If light sensor readings come above a certain threshold let the still wheel turn as fast as the other wheel
	 * 
	 * Has a Robot object so it can use everything a Robot has whilst keeping strategy-specific functions contained in this class.
	 */
	
	private Robot robot;

	@Override
	public void startStrategy(Robot robot) {
		this.robot = robot;
		System.out.println("Starting LightRobotStrategy");
	}

}
