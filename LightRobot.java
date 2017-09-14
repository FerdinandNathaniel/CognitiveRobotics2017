package CogRob;

import lejos.hardware.motor.*;
import lejos.hardware.port.*;
import lejos.hardware.sensor.*;
import lejos.robotics.RegulatedMotor;

public class LightRobot extends Hub implements Robot{
	/*****LIGHTROBOT*****
	 * Our lovely little doom device that wants to interact with light. Has:
	 * - Two motors, left and right
	 * - Two light sensors, left and right
	 * - A strategy to perform (in super class Hub)
	 * - Access to the Hub's utilities (in super class Hub)
	 */
	
	private RegulatedMotor leftMotor;
	private RegulatedMotor rightMotor; 
	private SensorModes leftLightSensor; 
	private SensorModes rightLightSensor;
	
	public LightRobot() {
		super();
		this.leftMotor = new EV3LargeRegulatedMotor(MotorPort.B);  //EDIT: ADD CORRECT PORT
		this.rightMotor = new EV3LargeRegulatedMotor(MotorPort.C); //EDIT: ADD CORRECT PORT
		this.leftLightSensor = new EV3UltrasonicSensor(SensorPort.S1); //EDIT: ADD CORRECT PORT
		this.rightLightSensor = new EV3UltrasonicSensor(SensorPort.S4); //EDIT: ADD CORRECT PORT
	}
	

	/************************************************INTERFACE FUNCTIONS*****************************************/

	@Override
	public void runStrategy() {
		strategy.startStrategy(this);
	}
	
	
	/*************************************************CLASS FUNCTIONS*******************************************/
	
	public RegulatedMotor getLeftMotor() {
		return leftMotor;
	}


	public void setLeftMotor(RegulatedMotor leftMotor) {
		this.leftMotor = leftMotor;
	}


	public RegulatedMotor getRightMotor() {
		return rightMotor;
	}


	public void setRightMotor(RegulatedMotor rightMotor) {
		this.rightMotor = rightMotor;
	}


	public SensorModes getLeftLightSensor() {
		return leftLightSensor;
	}


	public void setLeftLightSensor(SensorModes leftLightSensor) {
		this.leftLightSensor = leftLightSensor;
	}


	public SensorModes getRightLightSensor() {
		return rightLightSensor;
	}


	public void setRightLightSensor(SensorModes rightLightSensor) {
		this.rightLightSensor = rightLightSensor;
	}
}
