package com.iu.s3.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		//1. 학생수 입력
		//2. 학생수 만큼 이름을 입력 iu, winter
		//3. 학생수 만큼 학생의 번호, 국어, 영어, 수학 입력
		//	 iu 학생의 번호:
		//	 iu 학생의 국어:
		//	 iu 학생의 영어:
		//	 iu 학생의 수학:
		//	 총점 평균 계산
		//모든 학생의 정보 출력
		// 이름	번호	국어	영어	수학	총점	평균
		// iu	1	53	64	52
		//...
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력해 주세요");
		int count = sc.nextInt();
		String [] names = new String[count];
		int [] num = new int[count];
		int [] kor = new int[count];
		int [] eng = new int[count];
		int [] math = new int[count];
		int [] sum = new int[count];
		double [] avg = new double[count];
		for(int i = 0;i<names.length;i++) {
			System.out.println((i + 1) + "번째 이름을 입력하세요");
			names[i] = sc.next();
			System.out.println(names[i] + "의 번호를 입력하세요");
			num[i] = sc.nextInt();
			System.out.println(names[i] + "의 국어를 입력하세요");
			kor[i] = sc.nextInt();
			System.out.println(names[i] + "의 영어를 입력하세요");
			eng[i] = sc.nextInt();
			System.out.println(names[i] + "의 수학을 입력하세요");
			math[i] = sc.nextInt();
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = sum[i]/3.0;
		}
		System.out.println("이름 \t 번호 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
		for(int i = 0;i < names.length;i++) {
				System.out.print(names[i]+" \t ");
				System.out.print(num[i]+" \t ");
				System.out.print(kor[i]+" \t ");
				System.out.print(eng[i]+" \t ");
				System.out.print(math[i]+" \t ");
				System.out.print(sum[i]+" \t ");
				System.out.println(avg[i]+" \t ");
		}
	}

	
			

}
