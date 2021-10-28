package com.jv.exam;

public class ArrayExam3 {

	public static void main(String[] args) {
		//members라는 배열은 문자열로 구성 되어 있는 배열이다.
		String[] members = {"최온달", "최반달", "온달","반달"};
		     //초기화; 반복조건(배열의 길이만큼); //반복실행
		for(int i = 0; i < members.length; i++) {
			String member = members[i];
			System.out.println(member + "이 상담 받았습니다.");
		}
		

	}

}
