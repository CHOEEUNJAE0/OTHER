package com.jv.exam;

public class Variable {

	public static void main(String[] args) {
		int num1; //변수의 선언. 왼쪽에 오는 것은 선언된 변수의 용도가 무엇인지 알려주는 것.
		num1 = 10; // 자바에서 =은 같다가 아닌 대입의 의미. 초기화라고 한다.
		           // 오른쪽의 값을 왼쪽에 대입 시켜 주겠다는 의미이다.
		int num2 = 20; // 변수의 선언과 초기화를 동시에 할 수도 있다.
		int num3 = num1+num2; //변수끼리의 연산이 대입 값으로 올 수도 있다.
		System.out.println(num1+"+"+num2+"="+num3);
		
		/* 정수형 : 
		 * byte(1byte)
		 * short(2byte)
		 * int(4byte)
		 * long(8byte)
		 * long<int<short<byte 순이다.
		 * 큰 값으로 작은 값으로 변환 하려고 하면 데이터의 손실이 생길 수 있다.
		 * 웬만하면 int를 주로 사용 하는 경우가 많다.
		 */
		
		/* 실수형 : 
		 * double(8byte) 
		 * float(4byte)
		 * 실수형 사이에서 자료형 선택의 기준은 정밀도이다.
		 * double이 float보다 오차 범위가 더 적기 때문에
		 * double 형을 주로 사용한다. 
		 * 물론 형변환도 가능하다.
		 */
		
		/* 문자형 : 
		 * char 
		 * 자바는 문자를 2byte 유니코드로 표현
		 * 작은 따옴표로 묶어서 하나의 문자를 표시, 문자의 저장은 유니코드값의 저장으로 이어짐
		 */
	
		char ch1 = '헐';
		char ch2 = '확';
		char ch3 = 54736; //문자 '헐'의 유니코드 값
		char ch4 = 54869; //문자 '확'의 유니코드 값
		char ch5 = 0xD5D0; //문자 '헐'의 10진수 표현 값
		char ch6 = 0xD655; //문자 '확'의 16진수의 표현 값
		System.out.println(ch1+" "+ch2);
		System.out.println(ch3+" "+ch4);
		System.out.println(ch5+" "+ch6);
		
		// boolean 참과 거짓의 값으로만 출력
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1); //b1이 지닌 값을 출력
		System.out.println(b2); //b2가 지닌 값을 출력
		
		int num7 = 10;
		int num8 = 20;
		System.out.println(num1 < num2); // 연산값의 결과가 출력된다. ture값 출력
		System.out.println(num1 > num2); //false 값 출력
		
		
		
	}

}
