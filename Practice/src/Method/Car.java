package Method;

public class Car {
	//�ʵ�
	//�ʵ��� ����
	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "����";
	int maxSpeed = 350;
	int speed; //����ӵ�. ���� �ʱ�ȭ ���� �ʾƼ� 0�� ����
	//Constructor ������ : Ŭ���� �̸��� ���ƾ� ��.
	//Ŭ������ �ʵ带 ��� �� �� ����
	Car() {
		speed = 10; // �ʵ�� ������ ���� ���� �� �� ����
		System.out.println(company);//��º����� �ۼ� �ؼ� �ʵ尪 ��� ����
	}
	//Method 
	void method() {
		speed = 30; // �ʵ�� ������ ���� ���� �� �� ����
		System.out.println(company);//��º����� �ۼ� �ؼ� �ʵ尪 ��� ����
		
	}

}
