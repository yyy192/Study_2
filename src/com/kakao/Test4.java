package com.kakao;

public class Test4 {
	
	public static void main (String [] args) {
		System.out.println("==== TEST4 STRAT ====");
		String name = "BAEKHYUN";
		int num = 56;
		//연결연산자로 작동, 여기서 int는 문자열이 됨. 숫자 더이상 아냐
		name = name + num;
		
		System.out.println("NAME = "+name);
	}

}
