package com.jv.exam;

public class ArrayExam2 {

	public static void main(String[] args) {
		//String[] classGroup = {"최온달", "최반달", "온달","빈딜"};
		//위와 같이 선언과 동시에 초기화도 가능하지만 우선 배열의 길이는 선언 후
		//초기화 해 줄 수도 있다.
		
		// new 연산자+데이터타입+[원하는 원소개수]로 선언 가능하다.
		String[] classGroup = new String[4];
		classGroup[0] = "최온달"; //0번재 인덱스에 값을 초기화 하는 방법
		System.out.println(classGroup.length);
		classGroup[1] = "최반달"; //1번재 인덱스에 값을 초기화 하는 방법
		System.out.println(classGroup.length);
		classGroup[2] = "온달"; //2번재 인덱스에 값을 초기화 하는 방법
		System.out.println(classGroup.length);
		classGroup[3] = "반달"; //3번재 인덱스에 값을 초기화 하는 방법
		System.out.println(classGroup.length);
		System.out.println(classGroup);
		

	}

}
