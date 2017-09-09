package CogRob;

import lejos.hardware.motor.*;
import lejos.hardware.port.*;
import lejos.hardware.sensor.*;
import lejos.robotics.RegulatedMotor;

public class LightRobot implements Robot{
	/*****LIGHTROBOT*****
	 * Our lovely little doom device that wants to hug light. Has:
	 * - Two motors, left and right
	 * - One light sensor
	 * - A strategy to perform
	 * - Access to the Hub's utilities (help functions)
	 */
	
	private RegulatedMotor leftMotor;
	private RegulatedMotor rightMotor; 
	private SensorModes lightSensor; 
	private Strategy strategy;
	private Utils utils;
	
	public LightRobot() {
		this.leftMotor = new EV3LargeRegulatedMotor(MotorPort.A);  //EDIT: ADD CORRECT PORT
		this.rightMotor = new EV3LargeRegulatedMotor(MotorPort.A); //EDIT: ADD CORRECT PORT
		this.lightSensor = new EV3UltrasonicSensor(SensorPort.S1); //EDIT: ADD CORRECT PORT
	}
	

	/************************************************INTERFACE FUNCTIONS*****************************************/
	
	@Override
	public void addUtils(Utils utils) {
		this.utils = utils;
	}

	@Override
	public void addStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	@Override
	public void runStrategy() {
		strategy.startStrategy(this);
	}
	
	
	/*************************************************CLASS FUNCTIONS*******************************************/
	

}
