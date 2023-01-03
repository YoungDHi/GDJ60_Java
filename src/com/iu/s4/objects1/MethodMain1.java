package com.iu.s4.objects1;

public class MethodMain1 {

	public static void main(String[] args) {
		System.out.println("Main Method 실행");
		MethodTest mt = new MethodTest();
		MethodTest3 mt3 = new MethodTest3();
		int salary = 3000000;
		//호출시 매개변수로 보내는 값 : 인자값
		mt3.t3(salary,0.95);
		
		Sword sword = new Sword();
		sword.name = "집행검";
		sword.damage = 50;
		sword.life = 10;
		sword.price = 100;
		sword.level = 5;
		
		mt3.info(sword);
		System.out.println(sword.name);
		
		
		System.out.println("main : " + salary);
		
		
		
		//메서드를 호출한다
		
		
		//mt.t1();
		
		
	
		
		System.out.println("Main Method 종료");
	}

}
