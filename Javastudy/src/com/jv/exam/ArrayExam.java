package com.jv.exam;

public class ArrayExam {

	public static void main(String[] args) {
		// 변수에 담아준다 . 변수의 이름은 classgroup로 줬다.
		//변수 앞에는 변수를 나타내는 데이터 타입이 와야한다.
		//                      베열을 정의
		// 담겨 있는 각각의 값을 원소, element라고 한다.
		String[] classGroup = {"최온달", "최반달", "온달","빈딜"};
		System.out.println(classGroup);
		//배열 안의 특정 데이터 값을 가져 오고 싶으면 해당 인덱스의 번호를
		//[] 안에 넣어준다. 인덱스는 0번부터 시작한다.
		System.out.println(classGroup[0]);
		System.out.println(classGroup[1]);
		System.out.println(classGroup[2]);
		System.out.println(classGroup[3]);
		//배열의 길이를 알아보는 법
		System.out.println(classGroup.length);
		
		
	}

}
