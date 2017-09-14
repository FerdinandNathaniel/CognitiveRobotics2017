package CogRob;

public class LightRobotStrategy_Fear extends Hub implements Strategy {
	/*****LIGHTROBOTSTRATEGY*****
	 * The strategy our lightRobot will have to use, it's as follows:
	 * - Let lightRobot drive in semi circles
	 * - If light sensor readings come above a certain threshold let the wheel on the same side turn faster
	 * 
	 * Has a Robot object so it can use everything a Robot has whilst keeping strategy-specific functions contained in this class.
	 */
	
	public LightRobotStrategy_Fear () {
	}

	@Override
	public void startStrategy(Robot r) {
		if(r.getClass() == LightRobot.class) {
			LightRobot robot = (LightRobot) r;
			System.out.println("Starting LightRobotStrategy - Fear");
			
			/*****START OF STRATEGY*****/
			utils.setMotorSpeed(robot.getLeftMotor(), 720, robot.getRightMotor(), 360); //Turn robot in circles to the right
			utils.driveForward(robot.getLeftMotor(), robot.getRightMotor());
		}
		else {System.out.println("Pairing non-LightRobot class Robot with LightRobotStrategy");}
	}

}
