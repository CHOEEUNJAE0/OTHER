package com.jv.exam;

public class ArrayExam4 {

	public static void main(String[] args) {
		//�迭�� �ϳ��� ���ο� ĳ����� �ֹ��ϴ� ���̶�� ��������.
		// ������Ÿ��[] ������ = new ������Ÿ��[�迭�� ũ��];
		// �������� ĳ����� �̸��� �־��ְ� �迭�� ũ�⿡�� ����ϰ� �ϴ� ���� ��ŭ �ۼ� �� �ָ� �ȴ�.
		//�Ʒ��� ���� ����� ���ÿ� �ʱ�ȭ�� ���������� ���� ���� �� �� �ʱ�ȭ�� �Ϸ��� �ϸ�
		//������[�ε�����ȣ]=�ʱ�ȭ �� ���� �� �ָ� �ȴ�.
		String[] subjects = {"����","����","����","��ȸ","����"};
		int[] scores = new int[5];
		scores[0] = 80;
		scores[1] = 67;
		scores[2] = 88;
		scores[3] = 92;
		scores[4] = 65;
		System.out.println(scores);
		System.out.println(scores[3]);
		
		//�迭�� �Ϲ������� �ݺ����� ���� ����ϴµ� �ݺ��ϴ� Ƚ����
		//�迭�� ���̸�ŭ�̶�� �ǹ̷� ����.length �� �� �ָ� �ȴ�.
		//��� �� ������ ������[�ݺ����� ����]�� �־��ָ� �ȴ�.
		//�ݺ��������� �Ϻ� ���� ���� ��쿡�� ���ǹ��� ���� ������ָ� �ȴ�.
		for(int i=0; i <scores.length; i++) {
			for(int j =0; j<subjects.length; j++)
			System.out.println(subjects[j]+"������"+scores[i]+"�� �Դϴ�.");
		}
		for(int k=0; k<subjects.length; k++) {
			System.out.println("*"+subjects[k]+"*");
		}
		for(int h=0; h<scores.length; h++) {
			
			if(h<scores.length-1) {
				System.out.println(scores[h]+",");
			}else {
				System.out.println(scores[h]+".");
			}
		}

	}

}
