package com.iu.s1.contrals;

import java.util.Scanner;

public class Control2_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//회원가입 할 때 입력한 ID, PW
		int id = 1234;
		int pw = 5678;
		//키보드로부터 id, pw를 입력 받아서 로그인 처리		
		System.out.println("ID를 입력해주세요");
		int id1 = sc.nextInt();
		System.out.println("PW를 입력해주세요");
		int pw1 = sc.nextInt();
		
		boolean check = false;//false = 로그인 X, true = 로그인 O
		
		if(id1==id && pw1==pw) {
			System.out.println("로그인 성공");
			check = true;
		}else {
			System.out.println("로그인 실패");
			check = false;
		}
		
		//로그인이 성공했을 때만 실행
		//급여를 입력
		//정규직이면 1을, 계약직이면 2를 입력
		//실급여 계산
		//정규직 : 고용보험 2%, 의료보험 3%, 국민연금 1%, 산재보험 1%
		//계약직 : 원천징수 3.3%
		//실급여 출력
		if(check) {
			System.out.println("급여를 입력해주세요");
			int price = sc.nextInt();
			System.out.println("정규직이면 1을, 계약직이면 2를 입력해주세요");
			int work = sc.nextInt();
			if(work == 1) {
				int tax = 0;
				tax = tax +(int)(price*0.02);
				
				tax = tax + (int)(price*0.03);
				
				tax = tax + (int)(price*0.01);
				
				tax = tax + (int)(price*0.01);
				
				price = price - tax;
//				int tax1 = (int)(price*0.02);
//				int tax2 = (int)(price*0.03);
//				int tax3 = (int)(price*0.01);
//				int tax4 = (int)(price*0.01);
//				price = price - (tax1+tax2+tax3+tax4);
			} else {
//				price = (int)(price*0.97);
			}
			System.out.println("실급여 : " + price);
		} else {
			System.out.println("로그인 한 사용자만 가능");
		}
		
		
		
		
	}

}
