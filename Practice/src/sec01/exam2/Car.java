package sec01.exam2;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	//생성자
	Car() {
			//매개변수 없고 중괄호 안에 내용이 없음
		    //이 생성자로 객체를 만들면 기본 값으로 초기화 된 객체가 만들어짐
	}
	Car(String model) {
//		 //필드의model//매개변수의 model
//		this.model = model;
		this(model,null,0);
	}
	
	Car(String model, String color) {
		this(model, color, 0);
	}
	Car(String model, String color, int maxSpeed) {
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	
	}
	
	
}
