package sec01.exam2;

public class CarExam {

	public static void main(String[] args) {
		//car Ŭ������ �����ڸ� �̿��ؼ� ��ü ����
		   //car1����//��ü ���� ���� new ������ ���
		Car car1 = new Car();
		//Ȯ���� ���� ��� ����;
		System.out.println("car1.company :" + car1.company);
		System.out.println();
		
		Car car2 = new Car("�ڰ���");
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println();
		
		Car car3 = new Car("����","�Ķ���"); 
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.company : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car car4 = new Car("����","�ʷϻ�",500);
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.maxSpeed);
	}
	}