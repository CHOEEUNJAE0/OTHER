package Practice01;

import java.util.Scanner;

public class IfPractice {

	static Scanner sc = new Scanner(System.in);
	public static void ex1()  {
       System.out.println("Ű�� ���̸� �Է� �ϼ��� ");
		
		double tall = 0;
		int age = 0;
		
		System.out.println("Ű : ");
		sc.nextInt(); sc.nextLine();
		System.out.println("���� : ");
		sc.nextInt(); sc.nextLine();
		
		System.out.println("==================");
		
		if(tall < 140 && age< 8) {
			System.out.println("���̱ⱸ ž�°���");
		}else {
			System.out.println("���̱ⱸ ž�ºҰ�");
		}
	}
	
	public static void ex2()  {
        
		System.out.println("������ �Է��ϼ���");
		System.out.println(">");
		sc.nextLine(); 
		
		int integer = 0;
		sc.nextInt(); sc.nextLine();
		
		if(integer%2 == 0) {
			System.out.println(integer + "��(��) ¦�� �Դϴ�.");
		}else if (integer%2 == 1) {
			System.out.println(integer +"��(��) Ȧ�� �Դϴ�.");
		}else if ( integer == 0 ) {
			System.out.println(integer + "��(��) 0�Դϴ�.");
		}else if ( integer < 0) {
			System.out.println(integer + "�� ���� �����Դϴ�.");
		}
		
	}

	public static void ex3()  {
		
	    //Math.random()�� �̿��ؼ� 0~3���� �������� �߻���Ų �� , 
	    //�ش� �������� �迭�� �����Ͽ�
	    //���õ� �ܾ �ѱ��� ����, ���� ����, �߱������� �б��ϴ� ����ġ���� ��������
		
		String[] greetings = {"�ȳ�", "���", "���Ͽ�", "@#$%^&"};
   
		 int num = (int)(Math.random() * 4); 
		 
		 switch(num) {
		 
		 case 0 : 
			 System.out.println(greetings[0] +  " ��(��) �ѱ��� �Դϴ�.");
			 break;
		 case 1 : 
			 System.out.println(greetings[1] +  " ��(��) ���� �Դϴ�.");
			 break;
		 case 2 : 
			 System.out.println(greetings[2] +  " ��(��) �߱��� �Դϴ�.");
			 break;
		 case 3 : 
			 System.out.println(greetings[3] +  " ��(��) �� �ƴմϴ�.");
			 break;
		 }

	}

	
	public static void main(String[] args) {
		ex1();
		//ex2();
		//ex3();
   
	}

}
