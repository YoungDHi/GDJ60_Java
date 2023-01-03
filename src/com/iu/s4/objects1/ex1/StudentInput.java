package com.iu.s4.objects1.ex1;

import java.util.Scanner;

public class StudentInput {
	
	//findStudent
	//학생배열을 받아서
	//학생의 번호를 입력받아서 일치하는 학생을 리턴 없으면 null
	public Student findStudent(Student [] sts) {
		Scanner sc = new Scanner(System.in);
		System.out.println("찾으려는 학생의 번호를 입력해주세요");
		int num = sc.nextInt();
		
		for(int i = 0;i < sts.length;i++) {
			if(num == sts[i].num) {
				return sts[i];
			}
			
		}
		return null;
		
		
		
			
		
		
		
	}
	//setStudent
	//학생한명 객체를 생성해서, 이름, 번호, 국어, 영어, 수학 입력
	//총점 평균
	public Student [] setStudent(Student [] sts) {
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		System.out.println("학생의 이름을 입력해주세요");
		st.name  = sc.next();
		System.out.println("학생의 번호를 입력해주세요");
		st.num = sc.nextInt();
		System.out.println("학생의 국어점수를 입력해주세요");
		st.kor = sc.nextInt();
		System.out.println("학생의 영어점수를 입력해주세요");
		st.eng = sc.nextInt();
		System.out.println("학생의 수학점수를 입력해주세요");
		st.math = sc.nextInt();
		st.total = st.kor + st.eng + st.math;
		st.avg = st.total/3.0;
		System.out.println("Name : " + st.name);
		System.out.println("Num : " + st.num);
		System.out.println("Kor : " + st.kor);
		System.out.println("Eng : " + st.eng);
		System.out.println("Math : " + st.math);
		System.out.println("Total : " + st.total);
		System.out.println("Avg : " + st.avg);
		Student [] nsts = new Student [sts.length + 1];
		for(int i =0;i < sts.length;i++) {
			nsts [i] = sts [i];
		}
		nsts [sts.length] = st;
		return nsts;
		
		
	}	
	//setAllStudents
	//매개변수로 학생배열을 받아서
	//배열의 수만큼 학생 객체를 생성해서 이름, 번호, 국어, 영어, 수학 입력
	//총점 평균
	//학생 객체를 배열에 대입
	public void setAllStudents(Student [] students) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i < students.length;i++) {
			Student st = new Student();
			System.out.println("학생의 이름을 입력해주세요");
			st.name  = sc.next();
			System.out.println("학생의 번호를 입력해주세요");
			st.num = sc.nextInt();
			System.out.println("학생의 국어점수를 입력해주세요");
			st.kor = sc.nextInt();
			System.out.println("학생의 영어점수를 입력해주세요");
			st.eng = sc.nextInt();
			System.out.println("학생의 수학점수를 입력해주세요");
			st.math = sc.nextInt();
			st.total = st.kor + st.eng + st.math;
			st.avg = st.total/3.0;
			System.out.println("Name : " + st.name);
			System.out.println("Num : " + st.num);
			System.out.println("Kor : " + st.kor);
			System.out.println("Eng : " + st.eng);
			System.out.println("Math : " + st.math);
			System.out.println("Total : " + st.total);
			System.out.println("Avg : " + st.avg);
			students[i] = st;
		}
	}

}
