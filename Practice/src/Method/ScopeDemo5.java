package Method;

public class ScopeDemo5 {

	static int i =5; //��������
	
	static void a() {
		int i = 10; //a�ȿ����� ��� ������ ��������
		b();//�޼ҵ� b�� ȣ����
	}
	static void b() {
		//int i = 30; �̷����ϸ� ��� ����� 30���� �ٲ�.
	    //�ٵ� �̷� ���� ������ ���ٸ�  syso�� i�� ���������� ȣ���ϰ� �ȴ�.
		System.out.println(i);
		//���� ���� 5 �� ȣ�� ��
		//����/�������� ��� ������� ������ �߻��ϰ� ��� ���� ����.
		
	}
	public static void main(String[] args) {
		a();//�޼ҵ� a�� ȣ��, a �ȿ� i�� �������� 
	
	}

}
