package calc;
/*
 *��Ģ���� Ŭ����
 *
 *
 *
 */

public class Calc {

	
	//���ϱ� �޼ҵ�
	public int plus(int num1, int num2) {
		return num1+num2;
	}
	
	//���� �޼ҵ�
	public int minus(int num1,int num2) {
		int result = num1-num2;
		return result;
		
	}
	//���ϱ� �޼ҵ�
	public int muti(int num1,int num2) {
		int result = num1*num2;
		return result;
		
	}
	//������ �޼ҵ�
	public int divide(int num1,int num2) {
		int result = num1/num2;
		return result;
	}
	
	//�� ����� �޼ҵ�(3��� ��Ƣ��)
	public int pung(int m) {
		System.out.println("m= "+m);
		return m*3;
	}
}
