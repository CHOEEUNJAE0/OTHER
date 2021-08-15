
public class WhyMethod {

	public static void main(String[] args) {
		
		A();
		
		A();
		
		A();
		
		//이렇게 많은 코드들을 하나의 그룹으로 만들어주면 
		//그룹네임만 입력 해도 똑같은 코드들이 출력 된다.
	}
    //이렇게 A라는 메소드를 자동으로 생성 해 주고 메인 메소드에 A만 입력 해도 똑같은 결과물이 출력이 된다.
	public static void A() {
		System.out.println('A');
		System.out.println('-');
		System.out.println('-');
	}

}
