package com.iu.s4.objects4;

public class God {
	
	private String name;
	
	private static God god;
		
	
	private God() {}
	
	public static God getInscance() {
		
		if(God.god == null) {
			god = new God();
		}
		
		return God.god ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
