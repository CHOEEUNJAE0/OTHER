package com.jv.exam;

public class Operator {

	public static void main(String[] args) {
		/*
		 *  대입 연산자와 산술 연산자
		 *  = : 연산자 오른쪽에 있는 값을 왼쪽에 있는 변수에 대입
		 *  + : 두 피연산자의 값을 더함
		 *  - : 왼쪽 피연산자의 값에서 오른쪽 피연산자의 값을 뺀다
		 *  * : 두 피연산자의 값을 곱한다
		 *  / : 왼쪽의 피연산자값을 오픈쪽의 피연산자 값으로 나눈다
		 *  % : 왼쪽의 피연산자 값을 오른족 피연산자 값으로 나눈 후의 나머지 몫
		 */
		int num1 = 7;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1+num2));
		System.out.println("num1 + num2 = " + (num1-num2));
		System.out.println("num1 + num2 = " + (num1*num2));
		System.out.println("num1 + num2 = " + (num1/num2));
		System.out.println("num1 + num2 = " + (num1%num2));
		
		double d1 = 7.0;
		double d2 = 3.0;
		System.out.println("d1 + d2 = " + (d1/d2));
		
		System.out.println("-----------------------------");
		System.out.println("복합 대입 연산자 예제");
		short s1 = 10;
		s1 = (short)(s1 + 77L); // 형변환 안하면 컴파일 오류가 발생한다.
		int i = 3;
		i = (int)(i *  3.5); //형변환 안하면 컴파일 오류가 발생한다.
		System.out.println(s1);
		System.out.println(i);
		System.out.println("------ 복합대입연산자를 사용한다면 ------");
		int s = 10;
		s += 77L;
		int j = 3;
		j *= 3.5;
		System.out.println(s);
		System.out.println(j);
		System.out.println("복합대입연산자를 사용하면 형변환을 하지 않아도 형변환 했을때와 같은 값이 출력 된다.");
		System.out.println("-------------------------------------------------------------");
		System.out.println("관계연산자");
		/*
		 * < : n1 < n2 (n1이 n2 보다 작은지)
		 * > : n1 > n2 (n1이 n2 보다 큰지)
		 * <= : n1 <= n2 (n1이 n2 보다 같거나 작은지)
		 * => : n1 => n2 (n1이 n2 보다 같거나 큰지)
		 * == : n1 == n2 (n1이랑 n2은 같은지)
		 * != : n1 != n2 (n1이랑 n2는 다른가)
		 */
		System.out.println("3 >= 2 :" + (3 >=2));
		System.out.println("3 <= 2 :" + (3 <=2));
		System.out.println("7.0 == 7 :" + (7.0 == 7));
		System.out.println("7.0 != 7 :" + (7.0 != 7));
		
		System.out.println("-----------------------------------");
		System.out.println("논리연산자 예제");
		int i1 = 11;
		int i2 = 22;
		boolean result;
		System.out.println("변수 i1에 저장 된 값이 1과 100 사이의 수인가?");
		result = (1 < i1) && (i1 <100);
		System.out.println(result);
		
		System.out.println("변수 i2에 저장 된 값이 2 또는 3의 배수인가?");
		result = ((i2 % 2) == 0 || (i2 % 3 == 0));
		System.out.println(result);
		
		System.out.println("변수 i1은 0인가?");
		result = !(i1 !=0);
		System.out.println(result);
		
		
		

	}

}
