package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex2 {

	public static void main(String[] args) {
		//배그
		//총알 30발 -> 1탄창
		//캐릭터당  -> 3탄창
		
		//1. 단발
		//2. 점사
		
		//1번이면 "탕" 30번 반복 출력
		//2번이면 "타타탕" 10번 반복 출력
		Scanner sc = new Scanner(System.in);
		for(int r = 1;r < 4;r++) {
			System.out.println("공격 방식을 선택해주세요 1. 단발 2. 연사");
			int num = sc.nextInt();
			int count = 10;
			String sound = "타타탕";
			
			if(num == 1) {
				sound = "탕";
				count = 30;
			} 
			for(int i = 1;i <= count;i++) {
				System.out.println(i +"번째 소리 : " + sound);
			}
//			if(r == 3 ) {
//				break;
//			} else {
//				System.out.println("재장전필요!!");
//			}
			
			
		}
		System.out.println("탄창 다씀");
		
		
	}

}
