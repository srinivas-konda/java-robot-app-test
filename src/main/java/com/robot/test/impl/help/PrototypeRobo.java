package com.robot.test.impl.help;

import com.robot.test.model.Roboti;
import com.robot.test.service.RoboService;

public class PrototypeRobo  implements RoboService {
	private Roboti robo;
	private RoboHealthImpl roboHealth;
	static int chargingAvailble;
	
	public PrototypeRobo() {
		this.robo = new Roboti();
		this.roboHealth = new RoboHealthImpl();
	}
	
	
	public void setCharging(int percentage){
		int currentCharging = robo.getChargingStatus();
		if(currentCharging + percentage > 100)
			robo.setChargingStatus(100);
		else{
			robo.setChargingStatus(currentCharging+percentage);
		}
	}
	
	
	
	public boolean walk(double km){
		   chargingAvailble = robo.getChargingStatus();
		   int requiredCharging = (int)(km*1000/50);
		   if(roboHealth.powerCheck(robo, requiredCharging)){
			   System.out.println("Walked "+km+"km | Charging Used "+ requiredCharging +"% | Remaining  "+ robo.getChargingStatus() +"%");
			   System.out.println("Robot HeadLight Color "+ robo.getHeadLightColor());
			   System.out.println("-----------------------------walk returns T r F------------------------------");
			   return true;
		   }
		   return false;
	}

	public boolean carry(int weight) {
			if(roboHealth.canCarry(weight)){
				int requiredCharging = 2*weight;
				chargingAvailble = robo.getChargingStatus();
				if(roboHealth.powerCheck(robo, requiredCharging)){
					System.out.println("Carried "+ weight+"kg | Charging Used "+ requiredCharging +"% | Remaining  "+ robo.getChargingStatus() +"%");
					System.out.println("Robot HeadLight Color "+ robo.getHeadLightColor());
					System.out.println("------------------------carry method -------------------------------");
					return true;
				}
			}
			return false;
	}
	
	public boolean walkAndCarry(double dist, int weight) {
		if(roboHealth.canCarry(weight)){
			int requiredCharging = (int)(dist*1000/50) + 2*weight ;
			chargingAvailble = robo.getChargingStatus();
			if(roboHealth.powerCheck(robo, requiredCharging)){
				System.out.println("Walked "+ dist + "km and Carried "+ weight+"kg | Charging Used "+ requiredCharging +"% | Remaining  "+ robo.getChargingStatus() +"%");
				System.out.println("Robot HeadLight Color "+ robo.getHeadLightColor());
				System.out.println("************************************************");
				return true;
			}
		}
		return false;
	}
	
	public void displayPrice(int barCode){
		if(barCode % 2 == 0){
			System.out.println("Price is "+ new Random().nextInt(100));
		}else{
			System.out.println("Scan Failure");
		}
	}
}
