package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//분과 초를 입력받아서
		//해당 분 초가 되면 반복문을 모두 종료
		System.out.println("분을 입력해주세요");
		int min = sc.nextInt();
		System.out.println("초를 입력해주세요");
		int sec = sc.nextInt();
		for(int b = 0;b < 60;b++) {
			int s = 0;
			for(;s < 60;s++) {
				System.out.println(b + " 분 " + s + " 초 ");
				if(b == min && s== sec) {
//					s = 60;
					b = 60;
					break;
				}
			}
//			if(b == min && s == sec) {
//				break;
//			}
		}
		
		System.out.println("프로그램 종료");

	}

}
