package com.jv.exam;

public class ArrayForeach {

	public static void main(String[] args) {
		//�ݺ��� �߿� while�� �ִµ� �̰� �� ������ ���¶�
		//while�� �ݺ������� ����ϴ� ���� : �ʱ�ȭ;�ݺ�����;�ݺ������̶�� ������ 
		//�߰��ϸ� ���������� ������� for���̴�.
		
		//for-each�� �̷��� ��ġ�� ��������.
		//for���� �迭�� �����ؼ� ����ϴٰ� �� �������� �ָ��ϴ� ������
		//for-each���̴�.
		
		String[] members = {"�ֿ´�","�ֹݴ�","�´�","�ݴ�"};
		// : �ڿ� ���� �����Ϳ� ��� �ִ� ������ �ݺ� �� �� ���� e��� ������ ����ִ� ��
		for(String e : members) {
			System.out.println(e + "�� ����� �޾ҽ��ϴ�.");
		}
		
		
		String[] books = {"����", "���Ǵ�","�츮����", "��Ű���"};
		// ������ �� e�� �ƴϴ��� ���Ƿ� ���� �� �ָ� �ȴ�. ���⿡ e�� �ƴ� book���� ���� �ص� ���� �ǵ��� ���̴�.
		// ����� Ÿ��&���� : �迭 �Ǵ� �÷���
		for(String book : books) {
			System.out.println(book + "�� �뿩 �Ǿ����ϴ�.");
		}
		for(int j =0; j <books.length; j++) {
			String book = books[j]; {
				System.out.println(book + "�� �뿩 �Ǿ����ϴ�.");
			}
		}
	}

}
