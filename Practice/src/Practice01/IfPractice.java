package Practice01;

import java.util.Scanner;

public class IfPractice {

	static Scanner sc = new Scanner(System.in);
	public static void ex1()  {
       System.out.println("키와 나이를 입력 하세요 ");
		
		double tall = 0;
		int age = 0;
		
		System.out.println("키 : ");
		sc.nextInt(); sc.nextLine();
		System.out.println("나이 : ");
		sc.nextInt(); sc.nextLine();
		
		System.out.println("==================");
		
		if(tall < 140 && age< 8) {
			System.out.println("놀이기구 탑승가능");
		}else {
			System.out.println("놀이기구 탑승불가");
		}
	}
	
	public static void ex2()  {
        
		System.out.println("정수를 입력하세요");
		System.out.println(">");
		sc.nextLine(); 
		
		int integer = 0;
		sc.nextInt(); sc.nextLine();
		
		if(integer%2 == 0) {
			System.out.println(integer + "는(은) 짝수 입니다.");
		}else if (integer%2 == 1) {
			System.out.println(integer +"는(은) 홀수 입니다.");
		}else if ( integer == 0 ) {
			System.out.println(integer + "는(은) 0입니다.");
		}else if ( integer < 0) {
			System.out.println(integer + "는 음의 정수입니다.");
		}
		
	}

	public static void ex3()  {
		
	    //Math.random()을 이용해서 0~3까지 랜덤수를 발생시킨 후 , 
	    //해당 랜덤수를 배열에 적용하여
	    //선택된 단어가 한국어 인지, 영어 인지, 중국어인지 분기하는 스위치문을 만들어보세요
		
		String[] greetings = {"안녕", "헬로", "니하오", "@#$%^&"};
   
		 int num = (int)(Math.random() * 4); 
		 
		 switch(num) {
		 
		 case 0 : 
			 System.out.println(greetings[0] +  " 은(는) 한국어 입니다.");
			 break;
		 case 1 : 
			 System.out.println(greetings[1] +  " 은(는) 영어 입니다.");
			 break;
		 case 2 : 
			 System.out.println(greetings[2] +  " 은(는) 중국어 입니다.");
			 break;
		 case 3 : 
			 System.out.println(greetings[3] +  " 은(는) 언어가 아닙니다.");
			 break;
		 }

	}

	
	public static void main(String[] args) {
		ex1();
		//ex2();
		//ex3();
   
	}

}
