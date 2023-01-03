package com.iu.s2.ex;

import java.util.Scanner;

public class LoopWhile2_ex1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		// MMORPG 게임
		// 1.로그인
		// 2.로그인 한 사용자만 게임 가능
		
		// ----------------------- 로그인 파트 -----------------------------
		// 1. 로그인	2. 종료
		// 1: ID, PW 입력 후 로그인 판단
		// 2: 종료
		int id = 1234;
		int pw = 123; 
		
		while(check) {
			System.out.println("1.로그인  2.종료");
			int select = sc.nextInt();
			if(select==1) {
				System.out.println("ID를 입력해주세요 : ");
				int yId = sc.nextInt();
				System.out.println("PW를 입력해주세요 : ");
				int yPw = sc.nextInt();
				
				if(yId==id && yPw==pw) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("로그인 실패");
				}					
				
			} else {
				System.out.println("종료합니다.");
				check =! check; // check = false;랑 같음
			}
			
			
		}
		
//		로그인 후 게임진행		
		if(check) {
			System.out.println("게임을 진행");
			
			int level = 1;
			int gold = 0;
			
			for(level=1;level<15;level++) {
				System.out.println("현재 레벨 : "+level);
				
				if(level%5==0) {
					System.out.println(level +" 렙 달성 축하금 지급");
					gold = gold + level/5*1000;
				}
				
//				if(level==5) {
//					System.out.println("5렙 달성 축하금");
//					gold = gold+1000;;
//				}//				
//				if(level==10) {
//					System.out.println("10렙 달성 축하금");
//					gold = gold+2000;
//				}
				
				for(int m=0;m<level*3;m++) {
					System.out.println(m+1+" 마리 사냥 성공");
				}
				
				System.out.println("레벨업이 되었습니다. 축하합니다.");				
			}
			System.out.println(level + "렙 만렙 달성 축하드립니다. 지원금이 지급되었습니다.");
			gold = gold+level/5*1000;
			System.out.println("Gold : "+gold);
		}
		
		
		// ---------------------- 게임 진행 파트 ----------------------------
		// 1. 로그인 성공 했을 때 진행
		// 레벨은 1로 시작
		// 초기 GOLD는 0
		// 5렙 달성시 1000GOLD
		// 10렙 달성시 2000GOLD
		// 15렙 달성시 3000GOLD
		// 모든 몬스터의 경험치는 동일
		// 레벨 1 -> 2 3마리
		// 레벨 2 -> 3 6마리
		// 레벨 3 -> 4 9마리
		// 레벨 4 -> 5 12마리
		// ...
		// 레벨 14 -> 15 52마리
		// 레벨업 할 때마다 경축 메세지(만렙 찍고 축하, 현재 GOLD 출력)
		
		
	}

}
