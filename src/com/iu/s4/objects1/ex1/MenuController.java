package com.iu.s4.objects1.ex1;

import java.util.Scanner;

public class MenuController {
	
	//start
	//1. 등록
	//2. 수정
	//3. 삭제
	//4. 종료
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check= true;
		
		System.out.println("학생수를 입력하세요");
		int count = sc.nextInt();
		Student [] sts = new Student[count];
		StudentInput si = new StudentInput();
		StudentView sv = new StudentView();
		
		while(check) {
			System.out.println("1. 학생정보를 입력");
			System.out.println("2. 학생 검색 정보 출력");
			System.out.println("3. 학생의 전체 정보를 출력");
			System.out.println("4. 학생 추가");
			System.out.println("5. 종료");
			int select = sc.nextInt();
			if(select == 5) {
				System.out.println("종료입니다");
				break;
			} else if(select == 1) {
				System.out.println("학생정보를 입력합니다");
				
				si.setAllStudents(sts);
				
				check = true;
			
			} else if(select == 2) {
				
				System.out.println("학생 정보 검색후 출력합니다");
				Student st = si.findStudent(sts);
				if(st != null) {
					sv.view(st);
				} else {
					System.out.println("학생 정보가 없습니다");
				}
				check = true;
				
			} else if(select == 3){
				System.out.println("전체 정보를 출력합니다");
				sv.view(sts);
				check = true;
				
			} else {
				System.out.println("학생정보를 추가합니다");
				sts = si.setStudent(sts);
				check = true;
			}
//			switch(select) {
//			case 1:
//				System.out.println("등록입니다");
//				break;
//			case 2:
//				System.out.println("수정입니다");
//				break;
//			case 3:
//				System.out.println("삭제입니다");
//				break;
//			default:
//				System.out.println("종료입니다");
//				check = false;
//				break;
//			}
			
			
		}
	}
	
	
	
}
