package Method;

public class ScopeDemo5 {

	static int i =5; //전역변수
	
	static void a() {
		int i = 10; //a안에서만 사용 가능한 지역변수
		b();//메소드 b를 호출함
	}
	static void b() {
		//int i = 30; 이렇게하면 출력 결과는 30으로 바뀜.
	    //근데 이런 지역 변수가 없다면  syso의 i는 전역변수를 호출하게 된다.
		System.out.println(i);
		//전역 변수 5 를 호출 함
		//전역/지역변수 모두 사라지면 에러가 발생하고 출력 되지 않음.
		
	}
	public static void main(String[] args) {
		a();//메소드 a를 호출, a 안에 i는 지역변수 
	
	}

}
