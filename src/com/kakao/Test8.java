package com.kakao;

public class Test8 {
	
	public static void main(String [] args) {
		
		System.out.println("==== TEST8 START ====");
		
		// 물건 값의 합계
		int price;
		// 손님이 낸 돈
		int money;
		// 거스름돈
		int don;
		
		/* 물건 값의 합계보다 손님이 낸 돈이 더 많다라는 가정!!
		1. 물건 값의 합계, 손님이 낸 돈, 거스름돈을 출력하기 */
		price = 56920;
		money = 92560;
		don = money-price;
		System.out.println("물건 값 = "+price+"원");
		System.out.println("손님이 낸 돈 = "+money+"원");
		System.out.println("거스름돈 = "+don+"원");
		System.out.println("------------------------------------");
		//만원짜리 개수를 담을 변수
		int man;
		//천원짜리 개수를 담을 변수
		int cheon;
		//백원짜리 개수를 담을 변수 
		int back;
		//십원짜리 개수를 담을 변수
		int sib;
		
		//2. 만원 ??장, 천원 ??장, 백원 ??개, 십원 ??개 출력하기
		//강사님 방법
		
		man = don/10000;
		cheon = (don-(man*10000))/1000;
		back = (don-(man*10000)-(cheon*1000))/100;
		sib = (don-(man*10000)-(cheon*1000)-(back*100))/10;
		
		System.out.println("만원짜리 개수 = "+man+"장");
		System.out.println("천원짜리 개수 = "+cheon+"장");
		System.out.println("백원짜리 개수 = "+back+"개");
		System.out.println("십원짜리 개수 = "+sib+"개");
		
		System.out.println("------------------------------------");
		//내가 푼 방법
		man = don/10000;
		System.out.println("만원짜리 개수 = "+man+"장");
		
		cheon = don/1000%10;
		System.out.println("천원짜리 개수 = "+cheon+"장");
	
		back = don/100%10;
		System.out.println("백원짜리 개수 = "+back+"개");
	
		sib = don/10%10;
		System.out.println("십원짜리 개수 = "+sib+"개");

		
	}

}
