package CogRob;

import lejos.robotics.RegulatedMotor;

public class Utils {
	/*****UTILS*****
	 * A class to put in functions that can be widely useful so there's no need for duplicate code.
	 */
	
	public Utils() {
	}
	
	public void setMotorSpeed(RegulatedMotor motor, int speed) {
		motor.setSpeed(speed);
	}
	
	public void setMotorSpeed(RegulatedMotor motor1, int speed1, RegulatedMotor motor2, int speed2) {
		motor1.setSpeed(speed1);
		motor2.setSpeed(speed2);
	}
	
}
