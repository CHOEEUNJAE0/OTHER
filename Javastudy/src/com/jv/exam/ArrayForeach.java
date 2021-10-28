package com.jv.exam;

public class ArrayForeach {

	public static void main(String[] args) {
		//반복문 중에 while이 있는데 이건 좀 원시적 형태라서
		//while의 반복적으로 사용하는 패턴 : 초기화;반복조건;반복실행이라는 조건을 
		//발견하면 문법적으로 만든것이 for문이다.
		
		//for-each도 이러한 이치와 마찬가지.
		//for문과 배열을 결합해서 사용하다가 그 목적에만 주목하는 문법이
		//for-each문이다.
		
		String[] members = {"최온달","최반달","온달","반달"};
		// : 뒤에 오는 데이터에 담겨 있는 값들을 반복 할 떄 마다 e라는 변수에 담아주는 것
		for(String e : members) {
			System.out.println(e + "이 상담을 받았습니다.");
		}
		
		
		String[] books = {"개미", "혈의누","헤리포터", "헝거게임"};
		// 변수는 꼭 e가 아니더라도 임의로 설정 해 주면 된다. 여기에 e가 아닌 book으로 설정 해도 실행 되듯이 말이다.
		// 요소의 타입&변수 : 배열 또는 컬렉션
		for(String book : books) {
			System.out.println(book + "가 대여 되었습니다.");
		}
		for(int j =0; j <books.length; j++) {
			String book = books[j]; {
				System.out.println(book + "가 대여 되었습니다.");
			}
		}
	}

}
