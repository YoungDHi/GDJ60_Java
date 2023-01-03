package com.iu.s4.objects2;

public class Monster {
	
	//멤버변수, instance 변수
	int power;
	int hp;
	
	//멤버메서드, instance 메서드
	
	
	
	public boolean checkValue(Monster monster) {
		//나의 power와 같고, 나의 hp가 같다면 true 리턴, false 리턴
		
		if((monster.power == this.power) && (monster.hp == this.hp)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void info(int a) {
		
	}
	
	//공격
	//어슬렁
	public void info() {
		System.out.println(this);
		
		//참조변수 this : class 내에서만 사용 가능, 생성된 객체주소를 담음
		System.out.println(this.power);
		//this는 생략 가능
		System.out. println(this.hp);
		
		this.attack();
		
	}
	
	public void attack() {
		System.out.println("공격합니다");
		//this.info();
		
	}
	
	public void setHp(int hp) {
		
		this.hp = hp;
		
	}
	
	
	

}
