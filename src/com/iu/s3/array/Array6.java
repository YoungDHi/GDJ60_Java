package com.iu.s3.array;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar = {8, 5, 13, 9, 6};
		
		//키보드로부터 삭제하고 싶은 값을 입력 받기
		System.out.println("삭제할 값을 입력해주세요");
		int del = sc.nextInt();
		int [] copy = new int[ar.length - 1];
		int idx = 0;
		for(int i = 0;i < ar.length;i++) {
			
			if(del == ar[i]) {
				continue;
			}
			copy [idx] = ar[i];
			idx++;
		}
		ar = copy;
		
		for(int i = 0;i < ar.length;i++) {
			System.out.println(ar);
		}
	}

}
