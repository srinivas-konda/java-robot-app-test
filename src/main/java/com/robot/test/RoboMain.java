package com.robot.test;

import com.robot.test.impl.help.PrototypeRobo;
import com.robot.test.service.RoboService;

/*
 * Main class
 * @Author.
 */
public class RoboMain {
	
	/*
	 * Main method for run Robot App
	 * @param args, may be null.
	 */
	public static void main(String[] args) {
		RoboService obj = new PrototypeRobo();
		obj.walk(3.5);
		obj.carry(5);
		obj.walkAndCarry(1,13);
		obj.setCharging(70);
		obj.walkAndCarry(3,2);
		obj.displayPrice(18);

	}
	

}
