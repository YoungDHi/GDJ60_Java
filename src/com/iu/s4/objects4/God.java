package com.iu.s4.objects4;

public final class God {
	
	private static final String MY_NAME="";
			//final은 변수앞에 붙으면 변수를 상수처럼 써라
	private static God god;
		
	
	private God() {
	//	this.name = "test";
		
	}
	
	public static God getInscance() {
		
		if(God.god == null) {
			god = new God();
		}
		
		return God.god ;
	}
			//final이 붙으면 오버라이딩 하지 말라는뜻
	//public final String getName() {
		//return name;
	

	public void setName(String name) {
		//this.name = name;
	}
	

}
