package com.jv.exam;

public class ArrayExam2 {

	public static void main(String[] args) {
		//String[] classGroup = {"�ֿ´�", "�ֹݴ�", "�´�","���"};
		//���� ���� ����� ���ÿ� �ʱ�ȭ�� ���������� �켱 �迭�� ���̴� ���� ��
		//�ʱ�ȭ �� �� ���� �ִ�.
		
		// new ������+������Ÿ��+[���ϴ� ���Ұ���]�� ���� �����ϴ�.
		String[] classGroup = new String[4];
		classGroup[0] = "�ֿ´�"; //0���� �ε����� ���� �ʱ�ȭ �ϴ� ���
		System.out.println(classGroup.length);
		classGroup[1] = "�ֹݴ�"; //1���� �ε����� ���� �ʱ�ȭ �ϴ� ���
		System.out.println(classGroup.length);
		classGroup[2] = "�´�"; //2���� �ε����� ���� �ʱ�ȭ �ϴ� ���
		System.out.println(classGroup.length);
		classGroup[3] = "�ݴ�"; //3���� �ε����� ���� �ʱ�ȭ �ϴ� ���
		System.out.println(classGroup.length);
		System.out.println(classGroup);
		

	}

}
