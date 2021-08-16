package Method;

class C {
	int v = 10;
	
	void m() {
		int v =20;// 지역변수 v가 생기면 지역변수 v를 출력
		System.out.println(v);//전역변수 v, 지역변수가 없으면 전역변수를 출력
		System.out.println(this.v);
		//같은 v이지만 전역변수와 지역변수를 나눠서 출력 하고 싶을 때 사용하는 것이 this이다
		//인스턴스를 생성 했을 때, 그 인스턴스 자체를 나타내는 값이 this 값이다.
		//this가 붙게 되면 전역의 의미를 가지게 된다.
	}
	/*
	 * 전역변수와 지역변수를 중첩 할 때 지역변수가 우선순위로 출력이 된다.
	 * 변수중첩의 장점은, 전역 변수는 기본값으로 깔아두고
	 * 동명의 변수를 해당 메소드 안에서만 바꾸고 싶을 때 장점이 된다.
	 * 지역변수가 구체적일수록 더욱 우선순위가 된다.
	 */
}

public class ScopeDemo6 {

	public static void main(String[] args) {
		C c1 = new C(); //c라는 클래스는 c1이라는 인스턴스에 담는다
		c1.m(); //c1이라는 인스턴스에 있는 m이라는 메소드를 호출한다.
		

	}

}
