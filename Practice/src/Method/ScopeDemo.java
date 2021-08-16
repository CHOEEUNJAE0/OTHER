package Method;

public class ScopeDemo {
	//유효범위
 static void a() {
	 int i = 0;
 }
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			a();// a라는 메소드 안에서만 동작 하기 떄문에
			   //for문의 로직에는 영향을 주지 않는다.
			System.out.println(i);
		}
	}
}
