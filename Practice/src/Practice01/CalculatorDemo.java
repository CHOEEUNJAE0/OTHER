package Practice01;

class Calculator { //���ݺ��� calculator��� ��ü�� ���赵�� �˷��ְڴٴ� Ű����
	int left,  right; //���� ����
	
	//setOprands(�Ű�����) this.�Ű����� �� �ؼ� �Ű����� ���� �����ϴ� ����
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
		Calculator c1 = new Calculator(); //�ν��Ͻ� ȭ 
		// c1�� Calculator�� ���� �� �ִ� �����̳� 
		c1.setOprands(10,20);
		c1.sum();
		c1.avg();
		
		System.out.println("=======");
		
		Calculator c2 = new Calculator(); //��ü�� ��Ȱ��
		c1.setOprands(30,40);
		c1.sum();
		c1.avg();
		
		
	}

}
