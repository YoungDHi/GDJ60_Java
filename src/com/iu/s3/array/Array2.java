package com.iu.s3.array;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar = new int [3];
		int [] ar2 = new int [2];
		
		
		//키보드로 부터 숫자를 입력 받아서 해당 숫자 만큼 배열을 생성
		System.out.println("숫자를 입력해 주세요");
		int num = sc.nextInt();
		int [] ar3 = new int[num];
		
		
		//배열에 값을 키보드로부터 입력 받고
		for(int i = 0;i < ar3.length;i++) {
			System.out.println((i + 1) + " 번째 숫자를 입력");
			ar3[i] = sc.nextInt();
			
		}
		
		
		for(int i = 0;i < num;i++) {
			System.out.println(ar3[i]);
		}
		
		//값들을 출력
		
		
//		System.out.println(ar[4]);
		
		
	}

}
