package calc;

import java.util.Scanner;

public class Calc2 {
	
	//�� ���� ������ ����(�Ʒ� �޼ҵ忡 �� ���� ���� �ϰ�)
	private int num1;
	private int num2;
	private String op; //������ ����
	
	
	
	//�ΰ��� ���� �Է�
	public void inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�:");
		this.num1 = sc.nextInt();
		System.out.print("�Է�:");
		this.num2 = sc.nextInt();
	}
	
	//�����ڸ� �Է�
	public void inputOper() {
		Scanner sc = new Scanner(System.in);
//		System.out.print("�Է�:");
		this.op = sc.next();
	}
	//����� ������ִ� ���
	public void printResult() {
		if(this.op.equals("+")) {
			System.out.println(this.num1+" "+this.op+" "+this.num2+" = "+plus());
			
		}
		
	}
	
	//���ϱ�
	public int plus() {
		return this.num1+this.num2;
	}
	//����
	//���ϱ�
	//������

}
