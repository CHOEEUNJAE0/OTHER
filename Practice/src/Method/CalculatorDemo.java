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
    //���ο� class�� ����� ��            //Ȯ���ϴ� //�θ�Ŭ��������
	class SubstractionableCalculator extends Calculator {
		//���Ӱ� ����� �� �޼ҵ�
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
			//�ڽ�Ŭ������ �� �ٸ� �ڽ��� �ް� �Ǹ� �� �ڽ�Ŭ������ ������ �ִ� �޼ҵ���� ��� �ް� �ȴ�.
			//���� �� devision�޼ҵ�� muultiplicate�� ��� ���� �� �ִ�. �� substraction�� ��� �� ����.�ٸ� �ڽ��̱⶧���� 
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
