package Method;

public class CarExam {

	public static void main(String[] args) {
		//car Ŭ������ �����ϱ� ���� ��ü�� ����� ��.
		//car��� Ÿ���� ���� my car ����. new �����ڷ� car��� ��ü ����
		//�ʵ�� ��ü�� �������̱⶧���� ��ü ���� ������ �ؾ��Ѵ�!
		Car myCar = new Car(); 
		                  //���� �ڿ� .�� ���̴°� myCar�� ���� �ϴ� ��ü�� �����ϰڴٴ� ��
		System.out.println("���� ȸ�� : " + myCar.company);
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("���� : " + myCar.color);
		System.out.println("�ִ� �ӵ� : " + myCar.maxSpeed);
		myCar.speed = 60; //�ܺ� Ŭ�������� �ʵ尪 ���� �ϴ� ���
		System.out.println("���� �ӵ� : " + myCar.speed);
		
	}

}
