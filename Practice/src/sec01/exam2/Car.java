package sec01.exam2;

public class Car {
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	//������
	Car() {
			//�Ű����� ���� �߰�ȣ �ȿ� ������ ����
		    //�� �����ڷ� ��ü�� ����� �⺻ ������ �ʱ�ȭ �� ��ü�� �������
	}
	Car(String model) {
//		 //�ʵ���model//�Ű������� model
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
