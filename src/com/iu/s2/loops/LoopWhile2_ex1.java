package com.iu.s2.loops;

import java.util.Scanner;

public class LoopWhile2_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		boolean check = true;
		int suc = 0;
		// mmorpg게임
		//1. 로그인
		//2. 로그인 한 사용자만 게임 가능
		
		//--------------로그인 파트-------------------
		//1. 로그인 2. 종료
		//  1: id, pw 입력 후 호그인 판단
		//  2: 종료
		while(check) {
			System.out.println("선택해주세요 1. 로그인 2. 종료");
			int select = sc.nextInt();
			if(select == 1) {
				System.out.println("ID를 입력해주세요");
				int yid = sc.nextInt();
				System.out.println("PW를 입력해주세요");
				int ypw = sc.nextInt();
				if(yid == id && ypw == pw ) {
				System.out.println("로그인 성공");
				suc = 1;
				check = false;
				} else {
				System.out.println("로그인 실패");
				}
			} else {
			System.out.println("게임 종료");
			check = false;
			}
		}
		
		//--------------게임 진행 파트----------------
		//1. 로그인 성공 했을 때 진행
		//레벨은 1로 시작
		//모든 몬스터의 경험치는 동일
		//몬스터 처치시 몬스터 사냥 성공 출력
		//레벨업 할 때마다 축 레벨업 출력
		//GOLD는 0
		//5렙 달성시 1000GOLD 지급
		//10렙 달성시 2000GOLD 지급
		//15렙 달성시 3000GOLD 지급
		//1 -> 2 : 3마리
		//2 -> 3 : 6마리
		//3 -> 4 : 9마리
		//4 -> 5 : 12마리
		//...
		//14 -> 15 : 42마리
		//만렙 달성 축하, 현재 GOLD 출력
		if(suc == 1) {
			System.out.println("게임 진행");
			int lv = 1;
			int gold = 0;
			System.out.println("현재 레벨 : " + lv);
			for(;lv < 15;lv++) {
				for(int i = 1;i < 43;i++) {
					System.out.println("몬스터 사냥 성공 " + i + "마리");
					if(i == 3*lv ) {
						break;
					}
				}
				System.out.println("축! 레벨 업! 현재 레벨 : " + (lv + 1));
				switch(lv) {
				case 4:
					System.out.println((lv + 1) + "레벨 달성 1000GOLD 지급");
					gold = gold + 1000;
					break;
				case 9:
					System.out.println((lv + 1) + "레벨 달성 2000GOLD 지급");
					gold = gold + 2000;
					break;
				case 14:
					System.out.println((lv + 1) + "레벨 달성 3000GOLD 지급");
					gold = gold + 3000;
					break;
				default:
					break;
				}
			}
			if(lv == 15) {
				System.out.println("만렙 달성 축하!");
			}
			System.out.println("GOLD : "+ gold);

		}

	}
}