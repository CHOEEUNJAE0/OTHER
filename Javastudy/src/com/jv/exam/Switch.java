package com.jv.exam;

import java.util.Scanner;

public class Switch {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n ;
		System.out.println("단어를 입력하시오 : ");
		n =  sc.nextInt();
		
		switch(n) {
		case 1 :
			System.out.println("Say Hi");
			break;
		case 2 : 
			System.out.println("Say Yes");
			break;
		case 3 : 
			System.out.println("Say No");
			break;
		case 4 :
			System.out.println("Say Ho");
			break;
		default : 
			System.out.println("No Have");
	
		}

	}

}
