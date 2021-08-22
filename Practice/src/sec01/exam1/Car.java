package sec01.exam1;

public class Car {
	//필드 선언
	
//생성자 선언(클래스이름과 동일하게 줌    //매개변수
	Car(String color, int cc) { // 자동차 객체를 초기화 할 떄 사용
		//외부로부터 색상과 배기량을 받아서 이 색상,배기량의 자동차 객체를 만드는  생성자
		System.out.println(color);
		System.out.println(cc);
		System.out.println(color + "색의" + cc + "cc의 자동차가 생성 됨.");
		//생성자의 블록이 성공적으로 생성이 되어야 객체도 만들어짐.
		
		
	}
	
	


}
