package com.iu.s4.objects1;

public class ObjectMain2 {

	public static void main(String[] args) {
		//Sword의 Instance 생성
		Sword sd = new Sword();
		sd.name = "집행검";
		sd.damage = 50;
		sd.life = 200;
		sd.price = 50000;
		sd.level = 3;
		
		Knight kn = new Knight();
		kn.name = "기사";
		kn.str = 8;
		kn.dex = 10;
		kn.wiz = 4;
		kn.hp = 30;
		kn.che = 10;
		
		kn.sd1 = sd;
		System.out.println(kn.sd1.name);
		
		//변수 선언
		Sword s2 = null;
				
		System.out.println(s2.damage);

	}

}
