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
		double pi = 3.14;
		int wholeNumber = (int)pi;
		System.out.println(wholeNumber);
		
		long lnum2 = 3000000000007L;
		int num3 = (int)lnum2;
		System.out.println(num3);
		
		short snum1 = 1;
		short snum2 = 2;
		short snum3 = (short)(snum1+snum2);
		System.out.println(snum3);

	}

}
