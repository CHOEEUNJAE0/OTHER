package Practice01;

class Calculator { //지금부터 calculator라는 객체의 설계도를 알려주겠다는 키워드
	int left,  right; //변수 선언
	
	//setOprands(매개변수) this.매개변수 를 해서 매개변수 값을 대입하는 과정
	public void setOprands(int left, int right)  {
	    this.left = left;
	    this.right = right;
	    
	}
	public void sum() {
		System.out.println(this.left + this.right);
		
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}
public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator(); //인스턴스 화 
		// c1은 Calculator를 담을 수 있는 컨테이너 
		c1.setOprands(10,20);
		c1.sum();
		c1.avg();
		
		System.out.println("=======");
		
		Calculator c2 = new Calculator(); //객체의 재활용
		c1.setOprands(30,40);
		c1.sum();
		c1.avg();
		
		
	}

}
