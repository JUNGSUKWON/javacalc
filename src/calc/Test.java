package calc;

import java.util.Random;

public class Test {
	
	public static void method() {
		System.out.println("���� method()");
	}
	
	//���ϰ��� ������� �Ű������� �����Ѵ�.
//	public String method() {
//		return "���� method()";
//	}
	
	//�޼ҵ� �����ε�(�̸��� ������ �Ű������� ������ �����Ѱ��� �����ε�)
	public static void method(int number) {
		System.out.println("���� ���ڸ� ���� �� �ִ� method()");
	}
	public void method(int number1,int number2) {
		System.out.println("���� ���ڸ� ���� �� �ִ� method()");
	}
	public void method(String str) {
		System.out.println("���� ���ڿ��� ���� �� �ִ� method()");
	}
	
	
	//��¡�����
	private static int money = 0;
	//�渶�忡�� ������ ����
	public void setA(int money) {
		System.out.println(money+"������ �ɾ�߰ڱ�");
		Random rd = new Random();
		this.money = (rd.nextInt(10)+1)*money;
		
	}
	public int getA() {
		return this.money;
	}
	
	public static void gongYou(int a) {
		System.out.println("[����]������ ���� ����ġ�� �ѹ� �Ͻðڽ��ϱ�? ");
		
		while(a>0) {
			System.out.println("¦!!");
			a-=10;
		}
		System.out.println("��¡����ӿ� �����Ͻðڽ��ϱ�?");
	}
	
	
	
	

}
