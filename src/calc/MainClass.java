package calc;

import com.jsw.util.Util;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("���� ���α׷�");
		//���� Ŭ������ ����(��ü����,�ν��Ͻ� ����)
		Calc2 cc2 = new Calc2();

		do {
			//�ΰ��� ���ڸ� �Է��Ͻÿ�
			System.out.println("�ΰ��� ���ڸ� �Է��Ͻÿ�");
			cc2.inputNumber();
			//�����ڸ� �Է��Ͻÿ�
			System.out.print("�����ڸ� �Է��Ͻÿ�:");
			cc2.inputOper();
		}while(!cc2.checkNumber());


		//���
		cc2.printResult();



	}
}
