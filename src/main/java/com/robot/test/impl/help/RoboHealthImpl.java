package com.robot.test.impl.help;

import com.robot.test.model.Roboti;
import com.robot.test.model.Roboti.Color;
import com.robot.test.service.RoboAbstractHealth;

public class RoboHealthImpl extends RoboAbstractHealth{
	
	public boolean canCarry(int weight) {
		if(weight > 10){
			System.out.println("Over weight");
			System.out.println("-------------------------------------------------");
			return false;
		}
		return true;
	}
	
	public boolean powerCheck(Roboti r, int requiredCharging){
		int availbleCharging = r.getChargingStatus();
		if(availbleCharging < requiredCharging){
			System.out.println("Insufficient Charging For Task");
			System.out.println("************************************************");
			return false;
		}else{
			int remaining = availbleCharging - requiredCharging;
			r.setChargingStatus(remaining);
			if(remaining < 15){
				r.setHeadLightColor(Color.RED);
				System.out.println("*********************************************");
			}
			return true;
		}
		
		
	}


	
}
