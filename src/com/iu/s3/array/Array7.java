package com.iu.s3.array;

import java.util.Scanner;

public class Array7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar = {5, 1, 3};
		//1. 데이터추가
			//0번 인덱스에 추가
		//2. 데이터삭제
			//0번 인덱스 삭제
		//3. 종료
		boolean check = true;
		while(check) {
			System.out.println("선택해주세요 1. 데이터추가 2. 데이터 삭제 3. 종료");
			int select = sc.nextInt();
			if(select == 1) {
				System.out.println("1번 데이터 추가");
				System.out.println("추가할 데이터를 입력해주세요");
				select = sc.nextInt();
				int [] copy = new int [ar.length+1];
				copy [0] = select;
				for(int i = 0;i < ar.length;i++) {
					copy[i+1] = ar[i];
				}
				ar = copy;
				
			}else if(select == 2) {
				System.out.println("2번 데이터 삭제");
				int [] copy = new int [ar.length-1];
				for(int i = 0;i < copy.length;i++) {
					copy[i] = ar[i+1];
				}
				ar = copy;
				
				
			} else {
				System.out.println("프로그램 종료");
				check = false;
			}
			for(int i = 0;i < ar.length;i++) {
				System.out.println(ar[i]);
			}
		}
		
		
		
	}
}
