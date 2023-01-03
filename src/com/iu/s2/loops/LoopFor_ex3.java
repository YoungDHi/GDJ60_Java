package com.iu.s2.loops;
import java.util.Scanner;

public class LoopFor_ex3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		boolean check = false;
		//로그인 시도 총 5번 시도 가능
		
		//반복문 종료 후
		//로그인이 성공 했으면 "환영합니다" 메세지 출력
		//로그인이 실패 했으면 "은행방문하세요" 메세지 출력
		int yid = 0;
		int ypw = 0;
		
		for(int i = 0;i < 5;i++) {
			System.out.println("ID를 입력해주세요");
			yid = sc.nextInt();
			System.out.println("PW를 입력해주세요");
			ypw = sc.nextInt();	
			if((yid == id) && (ypw == pw)) {
				check = true;
				i = 4;
			} else {
				System.out.println("다시 입력해주세요");
				
			}
		}
		if(check) {
			System.out.println("환영합니다");
		} else {
			System.out.println("은행방문하세요");
			
		}
//		for(int i = 0;i < 5; i++) {
//			System.out.println("ID를 입력");
//			int yid = sc.nextInt();
//			System.out.println("PW를 입력");
//			int ypw = sc.nextInt();
//			
//			if(yid == id && ypw == pw) {
//				System.out.println("로그인 성공");
//				i = 5;
//				check = true;
//			} else {
//				System.out.println("로그인 실패");
//			}
//		}
//		if(check) {
//			System.out.println("환영합니다");
//		} else {
//		
//		System.out.println("은행을 방문하세요");
//		}
//		
//		
//		System.out.println("반복문 종료");
		
		
		
		
		
	}

}
