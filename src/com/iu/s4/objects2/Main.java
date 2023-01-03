package com.iu.s4.objects2;

public class Main {

	public static void main(String[] args) {
		ReturnTest rt = new ReturnTest();
		
		rt.t1();
		
		int num = rt.t2();
		
		System.out.println(num);
		
		int [] ar = rt.t3();
		
		System.out.println(ar);
		
	}

}
