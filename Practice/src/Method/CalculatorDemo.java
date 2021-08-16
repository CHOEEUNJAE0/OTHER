package Method;

	class Calculator  {
		int left, right;
	
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum () {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}
    //새로운 class를 만들어 줌            //확장하다 //부모클래스까지
	class SubstractionableCalculator extends Calculator {
		//새롭게 만들어 준 메소드
		public void substract() {
			System.out.println(this.left - this.right);
		}
	}
	class MultiplicationableCalculator extends Calculator {
		public void multiplicate () {
			System.out.println(this.left * this.right);
		}
	}
	
	class DevisionableCalculator extends MultiplicationableCalculator {
		public void devision () {
			System.out.println(this.left / this.right);
			//자식클래스를 또 다른 자식이 받게 되면 그 자식클래스가 가지고 있던 메소드까지 상속 받게 된다.
			//따라서 이 devision메소드는 muultiplicate도 상속 받을 수 있다. 단 substraction은 상속 못 받음.다른 자식이기때문에 
		}
	}
	
	public class CalculatorDemo {
	
	public static void main(String[] args) {
		
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
        c1.substract();
        MultiplicationableCalculator c2 = new MultiplicationableCalculator();
        c2.setOprands(10, 20);
		c2.sum();
		c2.avg();
        c2.multiplicate ();
        DevisionableCalculator c3= new DevisionableCalculator();
        c3.setOprands(30, 5);
        c3.sum();
		c3.avg();
        c3.multiplicate ();
        c3.devision();
        
	}

}
