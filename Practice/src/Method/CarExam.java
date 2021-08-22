package Method;

public class CarExam {

	public static void main(String[] args) {
		//car 클래스에 접근하기 위해 객체를 만들어 줌.
		//car라는 타입의 변수 my car 선언. new 연산자로 car라는 객체 생성
		//필드는 객체의 데이터이기때문에 객체 먼저 생성을 해야한다!
		Car myCar = new Car(); 
		                  //변수 뒤에 .을 붙이는건 myCar가 참조 하는 객체에 접근하겠다는 뜻
		System.out.println("제작 회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최대 속도 : " + myCar.maxSpeed);
		myCar.speed = 60; //외부 클래스에서 필드값 변경 하는 모습
		System.out.println("현재 속도 : " + myCar.speed);
		
	}

}
