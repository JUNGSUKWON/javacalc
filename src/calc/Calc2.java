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
	//���ڸ� üũ ���
	public boolean checkNumber() {
		
		//���ϰ�
		boolean isCheck = false;
		//������ �� üũ(ù��° ���� �ι�° ������ Ŀ��)
		if(this.op.equals("-")) {
			if(this.num1<this.num2) {
				System.out.println("ù��° ���� �ι�° ������ Ŀ���մϴ�! �ٽ� �Է����ּ���!");
			}else {
				isCheck=true;
			}
		}
		//������ �Ҷ�(ù��° ���� �ι�° ������ Ŀ���Ѵ�.������ ���ڰ� 0�� �ƴϾ�� �Ѵ�)
		else if(this.op.equals("/")) {
			if(this.num1<this.num2) {//�ι�°���ڰ� 0�϶� �� Ŭ��������.
				System.out.println("ù���� ���� �ι�° ������ Ŀ���մϴ�! �ٽ� �Է����ּ���!");
				
			}else if(this.num2==0) {
				System.out.println("�ι�° ���� 0�̿����� �ȵǿ�! �ٽ� �Է����ּ���!" );

			}else {
				isCheck=true;
			}
		}else {
			isCheck = true;
		}
		return isCheck;
	}
	
	//����� ������ִ� ���
	public void printResult() {
		if(this.op.equals("+")) {
			System.out.println(this.num1+" "+this.op+" "+this.num2+" = "+plus());
		}else if(this.op.equals("-")) {
			System.out.println(this.num1+" "+this.op+" "+this.num2+" = "+minus());
		}else if(this.op.equals("*")) {
			System.out.println(this.num1+" "+this.op+" "+this.num2+" = "+mul());
		}else if(this.op.equals("/")) {
			System.out.println(this.num1+" "+this.op+" "+this.num2+" = "+div());
		}else {
			System.out.println("�߸��� ������");
		}
	}

	//���ϱ�
	public int plus() {
		return this.num1+this.num2;
	}
	//����
	public int minus() {
		return this.num1-this.num2;
	}
	//���ϱ�
	public int mul() {
		
		return this.num1*this.num2;
	}
	//������
	public int div() {
		return this.num1/this.num2;
	}

}
