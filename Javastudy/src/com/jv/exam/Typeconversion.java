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
		double pi = 3.14;
		int wholeNumber = (int)pi;
		System.out.println(wholeNumber);
		
		long lnum2 = 3000000000007L;
		int num3 = (int)lnum2;
		System.out.println(num3);
		
		short snum1 = 1;
		short snum2 = 2;
		short snum3 = (short)(snum1+snum2);
		System.out.println(snum3);

	}

}
