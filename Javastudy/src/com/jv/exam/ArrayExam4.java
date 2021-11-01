package com.jv.exam;

public class ArrayExam4 {

	public static void main(String[] args) {
		//배열은 하나의 새로운 캐비넷을 주문하는 것이라고 생각하자.
		// 데이터타입[] 변수명 = new 데이터타입[배열의 크기];
		// 변수명에는 캐비넷의 이름을 넣어주고 배열의 크기에는 사용하고 하는 길이 만큼 작성 해 주면 된다.
		//아래와 같이 선언과 동시에 초기화도 가능하지만 선언 먼저 한 후 초기화를 하려고 하면
		//변수명[인덱스번호]=초기화 값 으로 해 주면 된다.
		String[] subjects = {"국어","영어","수학","사회","과학"};
		int[] scores = new int[5];
		scores[0] = 80;
		scores[1] = 67;
		scores[2] = 88;
		scores[3] = 92;
		scores[4] = 65;
		System.out.println(scores);
		System.out.println(scores[3]);
		
		//배열은 일반적으로 반복문과 같이 사용하는데 반복하는 횟수를
		//배열의 길이만큼이라는 의미로 변수.length 로 해 주면 된다.
		//출력 할 때에는 변수명[반복문의 변수]를 넣어주면 된다.
		//반복문만으로 완벽 하지 않을 경우에는 조건문을 같이 사용해주면 된다.
		for(int i=0; i <scores.length; i++) {
			for(int j =0; j<subjects.length; j++)
			System.out.println(subjects[j]+"점수는"+scores[i]+"점 입니다.");
		}
		for(int k=0; k<subjects.length; k++) {
			System.out.println("*"+subjects[k]+"*");
		}
		for(int h=0; h<scores.length; h++) {
			
			if(h<scores.length-1) {
				System.out.println(scores[h]+",");
			}else {
				System.out.println(scores[h]+".");
			}
		}

	}

}
