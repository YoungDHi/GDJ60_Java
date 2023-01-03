package com.iu.s2.loops;

import java.util.Random;
import java.util.Scanner;

public class LoopWhile1 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int num = random.nextInt(15);
		
		while(check) {
			System.out.println("숫자를 입력하세요");
			int a = sc.nextInt();
			
			if(a == num) {
				System.out.println("번호가 일치합니다");
				break;
			} else {
				System.out.println("틀렸습니다");
			}
		}
		
	}

}
