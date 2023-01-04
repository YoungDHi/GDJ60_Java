package com.iu.s4.objects5.characters;

public class Archer extends Character implements AttackAble {
	//private String name
	
	private int dex;
	
	public Archer() {
		//부모의 생성자를 상속받는다
		super("");
		
	}
	
	@Override
	public void attack() {
		System.out.println("활 공격");
		
	}
	
	public void move() {
		System.out.println("이동~");
	}
	
	
	
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	

}
