package com.jv.exam;

public class Operator {

	public static void main(String[] args) {
		//https://slow-magnolia-307.notion.site/Operator-6a9304eae595414fb8bff87b035b9b20
		
		/*
		 *  ���� �����ڿ� ��� ������
		 *  = : ������ �����ʿ� �ִ� ���� ���ʿ� �ִ� ������ ����
		 *  + : �� �ǿ������� ���� ����
		 *  - : ���� �ǿ������� ������ ������ �ǿ������� ���� ����
		 *  * : �� �ǿ������� ���� ���Ѵ�
		 *  / : ������ �ǿ����ڰ��� �������� �ǿ����� ������ ������
		 *  % : ������ �ǿ����� ���� ������ �ǿ����� ������ ���� ���� ������ ��
		 */
		int num1 = 7;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1+num2));
		System.out.println("num1 + num2 = " + (num1-num2));
		System.out.println("num1 + num2 = " + (num1*num2));
		System.out.println("num1 + num2 = " + (num1/num2));
		System.out.println("num1 + num2 = " + (num1%num2));
		
		double d1 = 7.0;
		double d2 = 3.0;
		System.out.println("d1 + d2 = " + (d1/d2));
		
		System.out.println("-----------------------------");
		System.out.println("���� ���� ������ ����");
		short s1 = 10;
		s1 = (short)(s1 + 77L); // ����ȯ ���ϸ� ������ ������ �߻��Ѵ�.
		int i = 3;
		i = (int)(i *  3.5); //����ȯ ���ϸ� ������ ������ �߻��Ѵ�.
		System.out.println(s1);
		System.out.println(i);
		System.out.println("------ ���մ��Կ����ڸ� ����Ѵٸ� ------");
		int s = 10;
		s += 77L;
		int j = 3;
		j *= 3.5;
		System.out.println(s);
		System.out.println(j);
		System.out.println("���մ��Կ����ڸ� ����ϸ� ����ȯ�� ���� �ʾƵ� ����ȯ �������� ���� ���� ��� �ȴ�.");
		System.out.println("-------------------------------------------------------------");
		System.out.println("���迬����");
		/*
		 * < : n1 < n2 (n1�� n2 ���� ������)
		 * > : n1 > n2 (n1�� n2 ���� ū��)
		 * <= : n1 <= n2 (n1�� n2 ���� ���ų� ������)
		 * => : n1 => n2 (n1�� n2 ���� ���ų� ū��)
		 * == : n1 == n2 (n1�̶� n2�� ������)
		 * != : n1 != n2 (n1�̶� n2�� �ٸ���)
		 */
		System.out.println("3 >= 2 :" + (3 >=2));
		System.out.println("3 <= 2 :" + (3 <=2));
		System.out.println("7.0 == 7 :" + (7.0 == 7));
		System.out.println("7.0 != 7 :" + (7.0 != 7));
		
		System.out.println("-----------------------------------");
		System.out.println("�������� ����");
		int i1 = 11;
		int i2 = 22;
		boolean result;
		System.out.println("���� i1�� ���� �� ���� 1�� 100 ������ ���ΰ�?");
		result = (1 < i1) && (i1 <100);
		System.out.println(result);
		
		System.out.println("���� i2�� ���� �� ���� 2 �Ǵ� 3�� ����ΰ�?");
		result = ((i2 % 2) == 0 || (i2 % 3 == 0));
		System.out.println(result);
		
		System.out.println("���� i1�� 0�ΰ�?");
		result = !(i1 !=0);
		System.out.println(result);
		
		
		/*
		 * ���� ���� ������ : ++, --
		 * �ǿ������� ���� 1�� ���ϰų� ���� �����ڷ� ��ġ�� ���� ��� ���� �ٸ��� ��Ÿ����.
		 * ���������� : ���� ���� �� �ٸ� ������ ���� ++i
		 * (i�� ���� ��Ų �� ���� Ȱ��)
		 * ���������� : �ٸ� ���� �켱 ���� �� ������ ���� i++
		 * (i�� ������ �ִ� ���� ���忡�� ���� Ȱ���� �ϰ� �Ŀ� �������Ѷ�)
		 */
		
		int val = 7;
		System.out.println(++val);
		System.out.println(++val);
		System.out.println(val);
		
		int val1 =5;
		System.out.print((val1++) + " ");//��� �� ���� ����
		System.out.print((val1++) + " ");//��� �� ���� ����
		System.out.print(val1 + "\n"); // ���� �� ���� ���� �������� �Ѿ�� Ȯ�� �� �� �ִ�.
		
		System.out.print((val1--) + " ");//��� �� ���� ����
		System.out.print((val1-- ) + " ");//��� �� ���� ����
		System.out.print(val1 + "\n"); // ���Ҥ��� ���� ���� �������� �Ѿ�� Ȯ�� �� 

	}

}
