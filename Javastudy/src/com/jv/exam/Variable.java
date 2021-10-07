package com.jv.exam;

public class Variable {

	public static void main(String[] args) {
		int num1; //변수의 선언. 왼쪽에 오는 것은 선언된 변수의 용도가 무엇인지 알려주는 것.
		num1 = 10; // 자바에서 =은 같다가 아닌 대입의 의미. 초기화라고 한다.
		           // 오른쪽의 값을 왼쪽에 대입 시켜 주겠다는 의미이다.
		int num2 = 20; // 변수의 선언과 초기화를 동시에 할 수도 있다.
		int num3 = num1+num2; //변수끼리의 연산이 대입 값으로 올 수도 있다.
		System.out.println(num1+"+"+num2+"="+num3);

	}

}
