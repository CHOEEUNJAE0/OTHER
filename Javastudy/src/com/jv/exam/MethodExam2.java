package com.jv.exam;

public class MethodExam2 {
	
	                   //()안에 매개변수를 넣어준다
	public static void numbering(int init, int limit) {
		//int limit = 5; 라고 지젇 해 주는 것과 마찬가지이지만
		//이렇게 되면 필요에 따라서 계속 이 메소드 안에서 값을 바꿔줘야한다.
		//그래서 int limit를 메서드에 매개 변수로 주고
		//main메서드에서 numbering메서드를 호출 할 때 괄호 안에 
		//원하는 값만 작성 해 주면 보다 효율적으로 고쳐서 출력 할 수 있다.
		//numbering(int limit) <- 매개변수, Paramiter
		
		int i = init;
		//i는 매개변수보다 적게 반복이 되는 것
		while(i < limit) { //<- 0~limit인데 원하는 값~limit으로 풀력 하고자 한다면
			
			System.out.println(i);
			i++;
		} 
	}
	
	
	public static void main(String[] args) {
		//입력값을 직접 주고 그 입력값에 따라서 출력값이 달라지는 것
		//numbering(5) <- 인자, argument
		numbering(3,5);
		
		
		}
		
	}


