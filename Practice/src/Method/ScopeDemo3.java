package Method;

public class ScopeDemo3 {
	
	static void a() { //a��� �޼ҵ� 
		String title = "coding everybody";
		//title�̶�� ���� ����
	}

	public static void main(String[] args) {
		a();
		//System.out.println(title);
		//title�� a��� �����޼ҵ� �ȿ� �ֱ� ������ ��Ŭ�������״� 
		//�Ⱥ��̴°Ͱ� ��������.

	}

}
