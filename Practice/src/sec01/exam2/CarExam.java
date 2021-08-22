package sec01.exam2;

public class CarExam {

	public static void main(String[] args) {
		//car 클래스의 생성자를 이용해서 객체 생성
		   //car1선언//객체 생성 위해 new 연산자 사용
		Car car1 = new Car();
		//확인을 위한 출력 변수;
		System.out.println("car1.company :" + car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println();
		
		Car car3 = new Car("버스","파란색"); 
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.company : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car car4 = new Car("버스","초록색",500);
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.maxSpeed);
	}
	}