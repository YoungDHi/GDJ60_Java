package com.iu.s4.objects1;

import java.util.Scanner;

public class ObjectMind3 {

	public static void main(String[] args) {
		//n명의 학생 개체 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력하세요");
		int count = sc.nextInt();//2
		Student student = null;
		
		Student [] students = new Student[count];
		Student [] students2 = new Student[count];
		
		student = new Student();
		for(int i = 0;i < students.length;i++) {
			
			System.out.println(i + 1 + " 번째 학생의 이름 입력");
			student.name = sc.next();
			students [i] = student;
		}
		
		
		for(int i = 0;i < students.length;i++) {
			System.out.println(students[i]);
			System.out.println(students[i].name);
			//System.out.println(students2[i].name);
			
		}
		
		System.out.println("종료");
		
	}

}
