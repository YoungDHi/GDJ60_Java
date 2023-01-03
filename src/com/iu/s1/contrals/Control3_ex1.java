package com.iu.s1.contrals;

import java.util.Random;
import java.util.Scanner;

public class Control3_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		//Game : tRPG
		//법사
		String name = "핫팩";
		int hp = 20;
		int mp = 20;
		
		String monsterName = "오크";
		int monsterHp = 10;
		
		//1. HP보충(포션) 2. MP(보충) 3. 마법1 4. 마법2 5. 턴을 넘기기
		//HP는 보충시 최대 40이 끝
		//보충시 랜덤하게 0~40사이의 숫자를 받아서  HP에 더하기
		//MP도 같다
		
//		int test = random.nextInt(5);//0~5미만의 정수 하나를 리턴
//		int test2 = random.nextInt(30);
//		System.out.println("test : " + test);
//		System.out.println("test2 : " + test2);
		//System.out.println("행동을 입력해주세요 1. HP보충(포션) 2. MP보충 3. 마법1 4. 마법2 5. 턴 넘기기");
		System.out.println("1. HP 보충");
		System.out.println("2. MP 보충");
		System.out.println("3. 마법 1 사용");
		System.out.println("4. 마법 2 사용");
		System.out.println("5. 턴 종료");
		int choice = sc.nextInt();
		if(choice == 1) {
			int potion = random.nextInt(41);
			hp = hp + potion;
			if(hp > 40) {
				hp = 40;
			}
			System.out.println("HP가 회복되었습니다 현재 HP : " + hp);
		} else if(choice == 2) {
			int heal = random.nextInt(41);
			mp = mp + heal;			
			if(mp > 40) {
				mp = 40;
			}
			System.out.println("MP가 회복되었습니다 현재 MP : " + mp);
		} else if(choice == 3) {
			//주문을 외우기
			//3씩 MP 감소
			//0~5이하의 수치를 공격
			System.out.println("아브라카다브라!!");
			mp = mp - 3;
			int attack = random.nextInt(6);
			if(attack ==5 ) {
				System.out.println("Critical!!");
			}
			System.out.println(attack + "만큼의 데미지를 입혔다");
			monsterHp = monsterHp - attack;
		} else if(choice == 4) {
			//주문을 외우기
			//5씩 MP 감소
			//0~10이하의 수치를 공격
			System.out.println("페트로누스!!");
			mp = mp - 5;
			int attack = random.nextInt(11);
			if(attack == 10) {
				System.out.println("Critical!!");
			}
			System.out.println(attack + "만큼의 데미지를 입혔다");
			monsterHp = monsterHp - attack;
		} else {
			System.out.println("턴을 넘긴다");
		}
		
		
		System.out.println(name + " HP : " + hp +" MP : " + mp);
		System.out.println(monsterName + " HP : " + monsterHp);
		
		
		//유저의 이름과 HP, MP
		//몬스터의 이름과 HP
		
		

	}

}
