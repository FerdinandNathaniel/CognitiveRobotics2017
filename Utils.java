package CogRob;

import lejos.hardware.sensor.SensorModes;
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
	
	public void driveForward (RegulatedMotor motor) {
		motor.forward();
	}
	
	public void driveForward (RegulatedMotor motor1, RegulatedMotor motor2) {
		motor1.forward();
		motor2.forward();
	}
	
	public void driveBackward (RegulatedMotor motor) {
		motor.backward();
	}
	
	public void driveBackward (RegulatedMotor motor1, RegulatedMotor motor2) {
		motor1.backward();
		motor2.backward();
	}
	
	public void stopDriving(RegulatedMotor motor) {
		motor.stop();
	}
	
	public void stopDriving(RegulatedMotor motor1, RegulatedMotor motor2) {
		motor1.stop();
		motor2.stop();
	}
	
	public void lightSensorRedMode(SensorModes lightSensor) {
		lightSensor.setCurrentMode("Red");
	}
	
	public void lightSensorRedMode(SensorModes lightSensor1, SensorModes lightSensor2) {
		lightSensor1.setCurrentMode("Red");
		lightSensor2.setCurrentMode("Red");
	}
}
