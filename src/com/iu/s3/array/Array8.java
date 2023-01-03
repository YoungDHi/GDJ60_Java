package com.iu.s3.array;

public class Array8 {

	public static void main(String[] args) {
		
		int [] ar = {5, 9, 8, 3, 6};
		
		
		//9,8,6,5,3 순으로 내림차순 정렬하기
		//3,5,6,8,9 순으로 오름차순 정렬하기
		//0 : 1,2,3,4랑 비교	95836
		//1 : 2,3,4랑 비교	98536
		//2 : 3,4랑 비교	98635
		//3 : 4랑 비교	98635
		//2중 for문써야함
		int num = 0;
		System.out.println("내림차순 정렬");
		for(int i = 0;i < ar.length;i++) {
//			for(int r = 0;r < ar.length -1;r++) {
//				if(ar [r] < ar[r + 1]) {
//					num = ar [r];
//					ar[r] = ar[r + 1];
//					ar[r+1] = num;
//				}
//			}
			for(int r = i+1;r < ar.length;r++) {
				if(ar[i] < ar[r]) {
					num = ar[i];
					ar[i] = ar[r];
					ar[r] = num;
				}
			}
		System.out.println(ar[i]);
			
		}
		System.out.println("===================");
		System.out.println("오름차순 정렬");
		for(int i = 0;i < ar.length;i++) {
			for(int r = i+1;r < ar.length;r++) {
				if(ar[i] > ar[r]) {
					num = ar[i];
					ar [i] = ar[r];
					ar [r] = num;
				}
			}
			System.out.println(ar[i]);
		}
		
	}

}
