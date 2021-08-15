package Practice01;

import java.util.Scanner;

public class Array {
	
	public static void ex1() {
		int[] iArr = new int[5];   //배열의 할당 //자료형int[] 배열명iArr = new자료형int[배열의 크기];
		int num = (int)(Math.random() * 5); //임의의 수 
		
		System.out.println(num);
		
		String str = num % 2 == 0  ? "짝수":"홀수";
		
		System.out.println(str);
		
	}
	static Scanner sc =new Scanner (System.in);
	public static void ex2() {
	//양의 정수 10개를 입력 받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자
	
		System.out.println("양의 정수 10개 입력 : "); //스캐너로 입력 받기 위해 출력문 작성
		int[] arr = new int[10]; //배열 할당
		
		for(int i = 0; i <arr.length; i++) { //for문을 이용해서 배열 초기화
			arr[i]=sc.nextInt();
		}
		System.out.println("3의 배수 : "); //스캐너 입력 받기 위한 출력문 작성
		for(int i = 0; i <arr.length; i++) { //for문 이용해서 초기화
			if (arr[i] % 3 == 0) {                   //조건문 입력
				System.out.println(arr[i] + " ");  //출력 공백
			}
		}
	sc.close();                   //스캐너 중지
	}
	
	public static void ex3() {
		//과목 이름을 입력받아 해당 과목 점수를 출력해주는 프로그램을 작성해보자. 
	    //무한반복을 하다가 "그만"을 입력받으면, 프로그램이 종료된다.

		}


	public static void main(String[] args) {
		//ex1();
		//ex2();
		ex3();
	}

}
