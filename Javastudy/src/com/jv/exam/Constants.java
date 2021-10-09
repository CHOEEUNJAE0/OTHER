package com.jv.exam;

public class Constants {

	public static void main(String[] args) {
		//상수 final 키워드를 통해서 선언한다.
		
		final int MAX_SIZE = 100; //보통 이렇게 선언과 동시에 초기화
		final char CONST_CHAR='상';
		final int CONST_ASSIGNED; //이렇게 초기화 하지 않은 것은 ★딱한번★ 초기화 가능
		
		CONST_ASSIGNED = 1;//이렇게 초기화 해주면 된다.
		
		System.out.println("상수1 : " + MAX_SIZE);
		System.out.println("상수2 : " + CONST_CHAR);
		System.out.println("상수3 : " + CONST_ASSIGNED);
		
		System.out.println("-------------------------------------");
		
		System.out.println("정수형 리터럴");
		int num1=123;  //10진수 표헌
		int num2=0123; //8진수 표현
		int num3=0x123; //16진수 표현
		
		System.out.println("num1 : "  + num1);
		System.out.println("num2 : "  + num2);
		System.out.println("num3 : "  + num3);
		
		System.out.println("11+22+33 = "+(11+22+33));
		System.out.println("011+022+033 = "+(011+022+033));
		System.out.println("0x11+0x22+0x33 = "+(0x11+0x22+0x33));
	}

}
