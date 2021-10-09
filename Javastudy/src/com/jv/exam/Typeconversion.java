package com.jv.exam;

public class Typeconversion {

	public static void main(String[] args) {
		int num1 = 50;
		long num2 = 3147483647L;
		//long타입을 int로 바꿔버리면 long타입의 데이터 손실이 생기게 된다.
		//그래서 num1에 저장 된 값이 long타입으로 형변환 되어 연산된다.(자동형변환)
		System.out.println(num1+num2);
		System.out.println("-------------------------------");
		double dnum1 =  34.5;
		long lnum1 = 345678916L;
		System.out.println("dnum1 + lnum1: " + dnum1+lnum1);
		
		System.out.println("-------------------------------");
		System.out.println("강제형변환");
		int i = 65;
		char c = (char)i;
		System.out.println("65의 유니코드 문자값 : " + c);
		
		double d = 3.14;
		int j = (int)d;
		System.out.println(j); //int는 정수이기때문에 소숫점 제외한 3을 출력
		
		/*
		 * 강제 형변환을 사용 할 때 주의 할 점은 
		 * 해당 데이터 타입을 받아 들일 수 없는 범위의 값이 들어오면
		 * 임의의 값을 저장하게 된다.
		 */
		int k = 1000;
		byte b = (byte)k;
		System.out.println(b);

	}

}
