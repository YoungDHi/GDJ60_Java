package com.iu.s2.loops;

import java.util.Scanner;

public class LoopWhile2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(check) {
			System.out.println("1. 짜장 2. 짬뽕 3. 탕수육 4. 프로그램종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("짜장 선택");
				break;
			case 2:
				System.out.println("짬뽕 선택");
				break;
			case 3:
				System.out.println("탕수육 선택");
				break;
			default:
				System.out.println("종료");
				check = false;
				break;
			
			}
			
			
			
		}
		System.out.println("프로그램 종료 합니다.");
		
		

	}

}
