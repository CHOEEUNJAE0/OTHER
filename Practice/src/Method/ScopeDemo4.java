package Method;

public class ScopeDemo4 {

	public static void main(String[] args, char[] i) {
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
			//�� �߰�ȣ �ȿ����� int i�� ����� �� �־
		}
	
		//System.out.println(i);
		//�߰�ȣ �ۿ� �ִ� �� i�� ������ ���� ��.

	}

}
