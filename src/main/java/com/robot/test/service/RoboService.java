package com.robot.test.service;

/*
 * Robo interface for service
 * 
 */
public interface RoboService {
	/** Method walk */
	boolean walk(double distance);
	
	/** Method carry */
	boolean carry(int weight);
	
	/** Method walkAndCarry */
	boolean walkAndCarry(double distance, int weight);
	
	/** Method setCharging */
	void setCharging(int percentage);
	
	/** Method displayPrice */
	void displayPrice(int barcode);
}
