package com.iu.s3.array;

public class Array5 {

	public static void main(String[] args) {
		int [] ar1 = {1, 2, 3};
		for(int i = 0;i < ar1.length;i++) {
			System.out.println(ar1[i]);
			}
		System.out.println("================");
		//ar1에서 마지막을 지우고 1,2만표시
		int [] copy = new int[ar1.length - 1];
		for(int i = 0;i < copy.length;i++) {
			copy [i] = ar1[i];
		}
		
		ar1 = copy;
		for(int i = 0;i < ar1.length;i++) {
		System.out.println(ar1[i]);
		}
		
	}

}
