package com.iu.s1.contrals;

import java.util.Scanner;

public class Control1_ex1 {

	public static void main(String[] args) {
		//키보드로부터 국어, 영어, 수학 점수 입력받음
		//총점과 평균 계산
		
		//평균이 90점이상이면 A를 출력
		//평균이 80점이상이면 B를 출력
		//평균이 70점이상이면 C를 출력
		//그외 나머지면 F를 출력
		//단일 if문 여러개 사용
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0;
		System.out.println("국어점수를 입력하세요");
		kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요");
		math = sc.nextInt();
		total = kor + eng + math;
		avg = total/3.0;
		
		String level = "F";
		if(avg>=90) {
			//System.out.println("A");
			level ="A";
		}
		if(avg>=80 && avg<90) {
			//System.out.println("B");
			level ="B";
		}
		if(avg>=70 && avg<80) {
			//System.out.println("C");
			level ="C";
		}
		//if(avg<70) {
			//System.out.println("F");
			//level = "F"
		//}
		//출력문은 딱 한번만 사용
		System.out.println(level);
		
	}

}
