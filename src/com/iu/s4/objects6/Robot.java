package com.iu.s4.objects6;

public class Robot {
	
	
	
	private ArmLeft armLeft;
	private ArmRight armRight = new ArmRight();
	
	public Robot() {
		this.armRight = new ArmRight();
		
	}
	public Robot(ArmRight armRight) {
		
		this.armRight = armRight;
		
	}
	
	public ArmLeft getArmLeft() {
		return armLeft;
	}
	public void setArmLeft(ArmLeft armLeft) {
		this.armLeft = armLeft;
	}
	public ArmRight getArmRight() {
		return armRight;
	}
	
	

}
