package com.jv.exam;

public class Variable {

	public static void main(String[] args) {
		int num1; //������ ����. ���ʿ� ���� ���� ����� ������ �뵵�� �������� �˷��ִ� ��.
		num1 = 10; // �ڹٿ��� =�� ���ٰ� �ƴ� ������ �ǹ�. �ʱ�ȭ��� �Ѵ�.
		           // �������� ���� ���ʿ� ���� ���� �ְڴٴ� �ǹ��̴�.
		int num2 = 20; // ������ ����� �ʱ�ȭ�� ���ÿ� �� ���� �ִ�.
		int num3 = num1+num2; //���������� ������ ���� ������ �� ���� �ִ�.
		System.out.println(num1+"+"+num2+"="+num3);
		
		/* ������ : 
		 * byte(1byte)
		 * short(2byte)
		 * int(4byte)
		 * long(8byte)
		 * long<int<short<byte ���̴�.
		 * ū ������ ���� ������ ��ȯ �Ϸ��� �ϸ� �������� �ս��� ���� �� �ִ�.
		 * �����ϸ� int�� �ַ� ��� �ϴ� ��찡 ����.
		 */
		
		/* �Ǽ��� : 
		 * double(8byte) 
		 * float(4byte)
		 * �Ǽ��� ���̿��� �ڷ��� ������ ������ ���е��̴�.
		 * double�� float���� ���� ������ �� ���� ������
		 * double ���� �ַ� ����Ѵ�. 
		 * ���� ����ȯ�� �����ϴ�.
		 */
		
		/* ������ : 
		 * char 
		 * �ڹٴ� ���ڸ� 2byte �����ڵ�� ǥ��
		 * ���� ����ǥ�� ��� �ϳ��� ���ڸ� ǥ��, ������ ������ �����ڵ尪�� �������� �̾���
		 */
	
		char ch1 = '��';
		char ch2 = 'Ȯ';
		char ch3 = 54736; //���� '��'�� �����ڵ� ��
		char ch4 = 54869; //���� 'Ȯ'�� �����ڵ� ��
		char ch5 = 0xD5D0; //���� '��'�� 10���� ǥ�� ��
		char ch6 = 0xD655; //���� 'Ȯ'�� 16������ ǥ�� ��
		System.out.println(ch1+" "+ch2);
		System.out.println(ch3+" "+ch4);
		System.out.println(ch5+" "+ch6);
		
		// boolean ���� ������ �����θ� ���
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1); //b1�� ���� ���� ���
		System.out.println(b2); //b2�� ���� ���� ���
		
		int num7 = 10;
		int num8 = 20;
		System.out.println(num1 < num2); // ���갪�� ����� ��µȴ�. ture�� ���
		System.out.println(num1 > num2); //false �� ���
		
		
		
	}

}
