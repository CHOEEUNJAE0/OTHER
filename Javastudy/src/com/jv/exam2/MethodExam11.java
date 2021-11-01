package com.jv.exam2;

public class MethodExam11 {
	
	//메소드는 main 메서드 밖에 작성 해 준다.
	//또한 메서드 뒤 괄호에 매개변수를 지정 한 뒤에 
	//메인메서드에서 메서드를 사용 할 때 
	//매개변수자리에 그때그때 원하는 값을 넣어주면 그대로 출력이 된다.
	//또한 매개변수가 여러개 있을 때 한개만 꺼내서 쓸수도 있다.
	//원하는 갯수만큼 꺼내서 사용 할 수 있다.
	public static void printTwoTimesA(String delimeter, String text){
		System.out.println(delimeter);
		System.out.println(text);
		System.out.println(text);
	}

	//main이라는 이름을 가진 method
	public static void main(String[] args) {
		// 출력 메소드
		//System.out.println("Hello Method");
		// 수학과 관련된 기능을 모아놓은 클래스 Math
		//System.out.println(Math.floor(1.1));
		
		//지금은 세줄이지만 이것들이 1억줄이라고하면 모두 수정하기도 어렵고
		//똑같은지 보기도 어려워진다.
		//그리고 이 모든 내용을 복붙 하려면 1억줄을 복붙해야하는데 그건 너무 복잡하고 어렵다
		//그때 필요한것이 메소드이다.
		
		//서로 연관 된 코드들을 그룹핑 후 이름을 붙여 주는 것.
		
	
		
		//메소드 사용 법
		// 이렇게 메소드만 입력 해도 하단의 코드와 같이 동작한다.
		//동작 법은 같아지지만 코드는 훨씬 간결 해 지는 것이다.
		//이렇게 내가 원하는 기호랑 문자를 입력만 해주면 바로바로 바뀌어서 출력 되는 것이다.
		printTwoTimesA("*","B");
		System.out.println("------");
		printTwoTimesA("&","C");
		System.out.println("------");
		printTwoTimesA("/","D");
		
		/*
		System.out.println("-");
		System.out.println("A");
		System.out.println("A");
		
		System.out.println("-");
		System.out.println("B");
		System.out.println("B");
        */
	}

}
