package com.robot.test.service;

import com.robot.test.model.Roboti;

public abstract class RoboAbstractHealth {
	/* weight check */
	abstract boolean canCarry(int weight);
	
	/* power Check */
	abstract boolean powerCheck(Roboti r, int charging);
}
