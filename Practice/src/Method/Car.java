package Method;

public class Car {
	//필드
	//필드의 선언
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed; //현재속도. 따로 초기화 하지 않아서 0인 생태
	//Constructor 생성자 : 클래스 이름과 같아야 함.
	//클래스의 필드를 사용 할 수 있음
	Car() {
		speed = 10; // 필드명만 가지고 값을 변경 할 수 있음
		System.out.println(company);//출력변문을 작성 해서 필드값 출력 가능
	}
	//Method 
	void method() {
		speed = 30; // 필드명만 가지고 값을 변경 할 수 있음
		System.out.println(company);//출력변문을 작성 해서 필드값 출력 가능
		
	}

}
