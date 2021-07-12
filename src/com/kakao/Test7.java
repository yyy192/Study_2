package com.kakao;

public class Test7 {
	
	public static void main(String [] args) {
		
		System.out.println("==== TEST7 START ====");
		
		int kor = 56;
		int eng = 65;
		int mat = 49;
		
		int sum = kor+eng+mat;
		double avg = sum/3.0;
		
		System.out.println("SUM = "+sum);
		System.out.println("AVG = "+avg); // 56.6666664
		
		/**강사님 방법
		소숫점을 뒤로 두 번 보내고 나머지 버렸다가 다시 두 자리 앞으로 오기**/
		avg = avg*100;
		System.out.println(avg);
		int result = (int)avg;
		System.out.println(result);
		avg = result/100.0;
		System.out.println("AVG = "+avg);
		
		/**내 방법 100점짜리가 아닌 이유는 강사님은 avg변수 그대로 사용하길 바람 나는 다른 변수 이용.
		int a = (int)avg;
		double avg2 = a+0.66; //여기서 a는 int타입인데 자동형변환 된거임
		System.out.println("AVG = "+avg2); // 56.66
		**/
		
	}

}
