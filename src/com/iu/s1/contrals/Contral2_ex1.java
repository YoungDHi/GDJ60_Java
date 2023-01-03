package com.iu.s1.contrals;

import java.util.Scanner;

public class Contral2_ex1 {

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
		if(id1==id && pw1==pw) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		

	}

}
