package com.kakao;

public class Test5 {
	
	public static void main(String [] args) {
		
		System.out.println("==== TEST5 START ====");
		
		int num1 = 3;
		long num2 = 9L;
		
		System.out.println("NUM : "+num1);
			
		num1 = (int)num2;
		
		System.out.println("NUM : "+num1);
		
		num1 = 3;
		
		// num2 = (long)num1; 자동형변환
		num2 = num1;
		System.out.println("NUM : "+num2);
		
		char ch = 'a';
		
		// 자동형변환 int는 4byte, char는 2byte
		int num3 = ch;
		System.out.println("NUM : "+num3);
		
		//강제형변환
		ch = (char)num3;
		System.out.println("CHAR : "+ch);
		
		long num4 = 10L; //8byte
		float f1 = num4; //4byte
		//float이 숫자를 표현할 때 더 다양하게 표현가능
		//소숫점 표현이 가능하기 때문에!
		//그래서 long 보다 float이 더 큰 수
		
		
	}

}
