package Method;

public class ScopeDemo {
	//��ȿ����
 static void a() {
	 int i = 0;
 }
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			a();// a��� �޼ҵ� �ȿ����� ���� �ϱ� ������
			   //for���� �������� ������ ���� �ʴ´�.
			System.out.println(i);
		}
	}
}
