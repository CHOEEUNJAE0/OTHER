package Practice01;

import java.util.Scanner;

public class Array {
	
	public static void ex1() {
		int[] iArr = new int[5];   //�迭�� �Ҵ� //�ڷ���int[] �迭��iArr = new�ڷ���int[�迭�� ũ��];
		int num = (int)(Math.random() * 5); //������ �� 
		
		System.out.println(num);
		
		String str = num % 2 == 0  ? "¦��":"Ȧ��";
		
		System.out.println(str);
		
	}
	static Scanner sc =new Scanner (System.in);
	public static void ex2() {
	//���� ���� 10���� �Է� �޾� �迭�� �����ϰ�, �迭�� �ִ� ���� �߿��� 3�� ����� ����غ���
	
		System.out.println("���� ���� 10�� �Է� : "); //��ĳ�ʷ� �Է� �ޱ� ���� ��¹� �ۼ�
		int[] arr = new int[10]; //�迭 �Ҵ�
		
		for(int i = 0; i <arr.length; i++) { //for���� �̿��ؼ� �迭 �ʱ�ȭ
			arr[i]=sc.nextInt();
		}
		System.out.println("3�� ��� : "); //��ĳ�� �Է� �ޱ� ���� ��¹� �ۼ�
		for(int i = 0; i <arr.length; i++) { //for�� �̿��ؼ� �ʱ�ȭ
			if (arr[i] % 3 == 0) {                   //���ǹ� �Է�
				System.out.println(arr[i] + " ");  //��� ����
			}
		}
	sc.close();                   //��ĳ�� ����
	}
	
	public static void ex3() {
		//���� �̸��� �Է¹޾� �ش� ���� ������ ������ִ� ���α׷��� �ۼ��غ���. 
	    //���ѹݺ��� �ϴٰ� "�׸�"�� �Է¹�����, ���α׷��� ����ȴ�.

		}


	public static void main(String[] args) {
		//ex1();
		//ex2();
		ex3();
	}

}
