package com.iu.s4.objects3.p2;

import com.iu.s4.objects3.p1.Secret;
//클래스명은 *(와일드카드)를 사용 가능이지만 패키지명은 안된다

public class SecretMain {

	public static void main(String[] args) {
		
		Secret secret = new Secret();
		com.iu.s4.objects3.p2.Secret secret2 = new com.iu.s4.objects3.p2.Secret();
		
		secret.money = 1;
		
		secret.s1();
		//secret.s2();
		
		
		System.out.println(secret.point);
		//Test test = new Test();
		//System.out.println(test.point);
	}

}
