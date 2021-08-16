
public class WhyMethod {


	public static void main(String[] args) {

		             //인자, arguments=함수 안으로 주입 한 구체적 것 
		printTwoTimes("A","+");
		//소괄호를 원하는 텍스트 값을 입력 해 주면 되는 것.
		
		printTwoTimes("b","*");
		
		printTwoTimes("d","-");

	}
	                              //매개변수, parameter = 메소드 안으로 넣어 주는 것
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
		
		
		
		//{}중괄호 안에서 사용 할 변수를 소괄호()안에 정의를 내려준다.
		//지금 string txet로 정의 했기 때문에 
		//printTwoTimes를 정의했고, 그리고 이 메소드의 괄호 첫 값은 반드시 스트링이고
		//{}중괄호 안에서 텍스트라는 이름의 변수의 값이 된다고 생각함.
	}
	
	
}
