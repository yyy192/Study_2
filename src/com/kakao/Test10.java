package com.kakao;

import java.util.Scanner;

public class Test10 {
	
	public static void main(String [] args) {
		
		System.out.println("==== TEST10 START ====");
		
		// 941223-1234567 like 주민등록번호 
		
		/* num     ->       result
		   0       ->         0
		   1       ->         1
		   2       ->         2
		   3       ->         3
		   4       ->         10
		   5       ->         11
		   7       ->         13
		   8       ->         20
		   12      ->         30
		   13      ->         31
		   17      ->         41
		   숫자 4개씩 건너 뛸 때마다 10씩 증가 */
		// 변수 설정 변수 선언하기
		// java는 필요할 때 중간에서 변수 선언이 가능
		
		//program 실행 중에 데이터를 키보드로부터 입력 받을 준비
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int result = 0;
		
		System.out.println("숫자를 입력하세요");
		input = sc.nextInt(); //숫자 입력받기를 기다리는 상태
		//4와 관련된 방법
		//6과 관련된 방법 한 번 생각해보기
		result = input/4*10+input%4;
		
		System.out.println("INPUT : "+input);
		System.out.println("RESULT : "+result);
		
		//GitHub use
		//code add
		
		//new code add
		
	}

}
