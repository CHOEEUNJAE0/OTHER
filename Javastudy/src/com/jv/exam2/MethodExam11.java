package com.jv.exam2;

public class MethodExam11 {
	
	//�޼ҵ�� main �޼��� �ۿ� �ۼ� �� �ش�.
	//���� �޼��� �� ��ȣ�� �Ű������� ���� �� �ڿ� 
	//���θ޼��忡�� �޼��带 ��� �� �� 
	//�Ű������ڸ��� �׶��׶� ���ϴ� ���� �־��ָ� �״�� ����� �ȴ�.
	//���� �Ű������� ������ ���� �� �Ѱ��� ������ ������ �ִ�.
	//���ϴ� ������ŭ ������ ��� �� �� �ִ�.
	public static void printTwoTimesA(String delimeter, String text){
		System.out.println(delimeter);
		System.out.println(text);
		System.out.println(text);
	}

	//main�̶�� �̸��� ���� method
	public static void main(String[] args) {
		// ��� �޼ҵ�
		//System.out.println("Hello Method");
		// ���а� ���õ� ����� ��Ƴ��� Ŭ���� Math
		//System.out.println(Math.floor(1.1));
		
		//������ ���������� �̰͵��� 1�����̶���ϸ� ��� �����ϱ⵵ ��ư�
		//�Ȱ����� ���⵵ ���������.
		//�׸��� �� ��� ������ ���� �Ϸ��� 1������ �����ؾ��ϴµ� �װ� �ʹ� �����ϰ� ��ƴ�
		//�׶� �ʿ��Ѱ��� �޼ҵ��̴�.
		
		//���� ���� �� �ڵ���� �׷��� �� �̸��� �ٿ� �ִ� ��.
		
	
		
		//�޼ҵ� ��� ��
		// �̷��� �޼ҵ常 �Է� �ص� �ϴ��� �ڵ�� ���� �����Ѵ�.
		//���� ���� ���������� �ڵ�� �ξ� ���� �� ���� ���̴�.
		//�̷��� ���� ���ϴ� ��ȣ�� ���ڸ� �Է¸� ���ָ� �ٷιٷ� �ٲ� ��� �Ǵ� ���̴�.
		printTwoTimesA("*","B");
		System.out.println("------");
		printTwoTimesA("&","C");
		System.out.println("------");
		printTwoTimesA("/","D");
		
		/*
		System.out.println("-");
		System.out.println("A");
		System.out.println("A");
		
		System.out.println("-");
		System.out.println("B");
		System.out.println("B");
        */
	}

}
