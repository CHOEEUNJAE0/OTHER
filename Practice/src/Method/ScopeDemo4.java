package Method;

public class ScopeDemo4 {

	public static void main(String[] args, char[] i) {
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
			//이 중괄호 안에서만 int i를 사용할 수 있어서
		}
	
		//System.out.println(i);
		//중괄호 밖에 있는 이 i는 에러가 나는 것.

	}

}
