package com.jv.exam2;

public class OutputMethod {
	
	
	//void�� return���� ���ٴ� ��
	
	public static String a() {
		//...
		//������ ���� �� return���� �༭ A�� ��ȯ�ϰ� �� �ִ� ���̴�.
		//return���� ���ڿ��̱⶧���� void�� string���� �ٲپ� �ش�.
		return "A";
	}
	
	//�̰��� ������ ��ȯ�ϱ� ������ void�� �ƴ� int�� ��������Ѵ�.
	public static int one() {
	//...
		return 1;
		
	}
	
	public static String twoTimes(String text, String delimeter) {
		//out�̶�� �ؽ�Ʈ�� ������ش�.
		String out="";
		//out���ٰ� �Ʒ��� ���� ���� �־��ش�.
		out = out + delimeter +"\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
		
		
		
	}

	public static void main(String[] args) {
		//a�� ��� �ǵ���
		System.out.println(a());
		//����2�� ��� �ǵ��� ����� �޼ҵ带 ������
		System.out.println(one());
		System.out.println(twoTimes("a","-"));

	}

}
