package com.jv.exam2;

public class OutputMethod {
	
	
	//void는 return값이 없다는 뜻
	
	public static String a() {
		//...
		//실행이 끝날 때 return값을 줘서 A를 반환하게 해 주는 것이다.
		//return값이 문자열이기때문에 void를 string으로 바꾸어 준다.
		return "A";
	}
	
	//이것은 정수를 반환하기 때문에 void가 아닌 int로 적어줘야한다.
	public static int one() {
	//...
		return 1;
		
	}
	
	public static String twoTimes(String text, String delimeter) {
		//out이라는 텍스트를 만들어준다.
		String out="";
		//out에다가 아래의 연산 값을 넣어준다.
		out = out + delimeter +"\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
		
		
		
	}

	public static void main(String[] args) {
		//a가 출력 되도록
		System.out.println(a());
		//정수2이 출력 되도록 만들어 메소드를 만들어보자
		System.out.println(one());
		System.out.println(twoTimes("a","-"));

	}

}
