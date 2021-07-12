package com.kakao;

public class Test6 {
	
	public static void main (String [] args) {
		
		System.out.println("==== TEST6 START ====");
		
		// 5는 int
		// 3.12는 double
		// 5 + 3.12는 double
		int num = 5;
		double num2 = 3.12;
		//double타입으로 num이 자동형변환
		//num+num2 는  double타입으로 계산된거기때문에 double타입인 num2로 값을 불러옴 
		num2 = num+num2;
		num = (int)num2;
		// num = num+(int)num2;
		// num = (int)(num+num2);
		System.out.println("NUM : "+num);
		
		//국영수 - = 0 ~ 100
		int kor = 63;
		int eng = 35;
		int mat = 53;
		
		//총점을 계산해서 총점을 출력
		int sum = kor+eng+mat;
		
		System.out.println("SUM = "+sum);
		
		//평균을 계산해서 평균을 출력
		//double avg = sum/3; 답은 50.0
		//50.0이 나온 이유 = 연산자 / 는 계산할 때부터 나머지는 안나오고 몫만 나오기 때문에
		//내가 생각한 답은 아님ㅋㅋ 28번째 줄 보면 이미 sum을 int로 계산했기 때문에,, 
		//sum이나 3을 double로 바꿔주면 알아서 자동형변환 후 double로 계산이 됨
		
		double avg = (double)sum/3; //자동형변환
		//또는 double avg = sum/3.0;
		System.out.println("AVG = "+avg);
		
		double num3 = 5.124;
		int result = (int)num3; //소숫점 버려버려
		
		System.out.println("RESULT = "+result);
		
	}

}
