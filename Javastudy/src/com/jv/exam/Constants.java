package com.jv.exam;

public class Constants {

	public static void main(String[] args) {
		//��� final Ű���带 ���ؼ� �����Ѵ�.
		
		final int MAX_SIZE = 100; //���� �̷��� ����� ���ÿ� �ʱ�ȭ
		final char CONST_CHAR='��';
		final int CONST_ASSIGNED; //�̷��� �ʱ�ȭ ���� ���� ���� �ڵ��ѹ��� �ʱ�ȭ ����
		
		CONST_ASSIGNED = 1;//�̷��� �ʱ�ȭ ���ָ� �ȴ�.
		
		System.out.println("���1 : " + MAX_SIZE);
		System.out.println("���2 : " + CONST_CHAR);
		System.out.println("���3 : " + CONST_ASSIGNED);
		
		System.out.println("-------------------------------------");
		
		System.out.println("������ ���ͷ�");
		int num1=123;  //10���� ǥ��
		int num2=0123; //8���� ǥ��
		int num3=0x123; //16���� ǥ��
		
		System.out.println("num1 : "  + num1);
		System.out.println("num2 : "  + num2);
		System.out.println("num3 : "  + num3);
		
		System.out.println("11+22+33 = "+(11+22+33));
		System.out.println("011+022+033 = "+(011+022+033));
		System.out.println("0x11+0x22+0x33 = "+(0x11+0x22+0x33));
	}

}
