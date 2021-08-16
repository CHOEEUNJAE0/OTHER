package Method;

public class ScopeDemo3 {
	
	static void a() { //a라는 메소드 
		String title = "coding everybody";
		//title이라는 변수 선언
	}

	public static void main(String[] args) {
		a();
		//System.out.println(title);
		//title이 a라는 지역메소드 안에 있기 때문에 이클립스한테는 
		//안보이는것과 마찬가지.

	}

}
