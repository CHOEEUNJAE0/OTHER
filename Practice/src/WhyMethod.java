
public class WhyMethod {


	public static void main(String[] args) {

		             //����, arguments=�Լ� ������ ���� �� ��ü�� �� 
		printTwoTimes("A","+");
		//�Ұ�ȣ�� ���ϴ� �ؽ�Ʈ ���� �Է� �� �ָ� �Ǵ� ��.
		
		printTwoTimes("b","*");
		
		printTwoTimes("d","-");

	}
	                              //�Ű�����, parameter = �޼ҵ� ������ �־� �ִ� ��
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
		
		
		
		//{}�߰�ȣ �ȿ��� ��� �� ������ �Ұ�ȣ()�ȿ� ���Ǹ� �����ش�.
		//���� string txet�� ���� �߱� ������ 
		//printTwoTimes�� �����߰�, �׸��� �� �޼ҵ��� ��ȣ ù ���� �ݵ�� ��Ʈ���̰�
		//{}�߰�ȣ �ȿ��� �ؽ�Ʈ��� �̸��� ������ ���� �ȴٰ� ������.
	}
	
	
}
