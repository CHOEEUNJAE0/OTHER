package com.jv.exam;

public class Typeconversion {

	public static void main(String[] args) {
		int num1 = 50;
		long num2 = 3147483647L;
		//longŸ���� int�� �ٲ������ longŸ���� ������ �ս��� ����� �ȴ�.
		//�׷��� num1�� ���� �� ���� longŸ������ ����ȯ �Ǿ� ����ȴ�.(�ڵ�����ȯ)
		System.out.println(num1+num2);
		System.out.println("-------------------------------");
		double dnum1 =  34.5;
		long lnum1 = 345678916L;
		System.out.println("dnum1 + lnum1: " + dnum1+lnum1);
		
		System.out.println("-------------------------------");
		System.out.println("��������ȯ");
		int i = 65;
		char c = (char)i;
		System.out.println("65�� �����ڵ� ���ڰ� : " + c);
		
		double d = 3.14;
		int j = (int)d;
		System.out.println(j); //int�� �����̱⶧���� �Ҽ��� ������ 3�� ���
		
		/*
		 * ���� ����ȯ�� ��� �� �� ���� �� ���� 
		 * �ش� ������ Ÿ���� �޾� ���� �� ���� ������ ���� ������
		 * ������ ���� �����ϰ� �ȴ�.
		 */
		int k = 1000;
		byte b = (byte)k;
		System.out.println(b);

	}

}
