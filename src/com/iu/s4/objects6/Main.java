package com.iu.s4.objects6;

public class Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Robot robot = new Robot();
		ArmLeft armLeft = new ArmLeft();
		robot.setArmLeft(armLeft);
		
		
		System.out.println(robot.getArmLeft());
		System.out.println("right : " + robot.getArmRight());
		
		robot = null; //객체를 소멸시키는 과정
		
		System.out.println("AddRobot에서 작업");
		robot = new Robot();
		System.out.println(robot);
		
		System.out.println("프로그램 종료");
	}

}
