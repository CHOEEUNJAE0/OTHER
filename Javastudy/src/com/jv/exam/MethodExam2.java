package com.jv.exam;

public class MethodExam2 {
	
	                   //()�ȿ� �Ű������� �־��ش�
	public static void numbering(int init, int limit) {
		//int limit = 5; ��� ���� �� �ִ� �Ͱ� ��������������
		//�̷��� �Ǹ� �ʿ信 ���� ��� �� �޼ҵ� �ȿ��� ���� �ٲ�����Ѵ�.
		//�׷��� int limit�� �޼��忡 �Ű� ������ �ְ�
		//main�޼��忡�� numbering�޼��带 ȣ�� �� �� ��ȣ �ȿ� 
		//���ϴ� ���� �ۼ� �� �ָ� ���� ȿ�������� ���ļ� ��� �� �� �ִ�.
		//numbering(int limit) <- �Ű�����, Paramiter
		
		int i = init;
		//i�� �Ű��������� ���� �ݺ��� �Ǵ� ��
		while(i < limit) { //<- 0~limit�ε� ���ϴ� ��~limit���� Ǯ�� �ϰ��� �Ѵٸ�
			
			System.out.println(i);
			i++;
		} 
	}
	
	
	public static void main(String[] args) {
		//�Է°��� ���� �ְ� �� �Է°��� ���� ��°��� �޶����� ��
		//numbering(5) <- ����, argument
		numbering(3,5);
		
		
		}
		
	}


