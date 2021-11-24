package calc;

import com.jsw.util.Util;

public class MainClass {
	
	public static void main(String[] args) {
			
		System.out.println("계산기 프로그램");
		//계산기 클래스를 선언(객체생성,인스턴스 생성)
		Calc2 cc2 = new Calc2();
		//두개의 숫자를 입력하시오
		System.out.println("두개의 숫자를 입력하시오");
		cc2.inputNumber();
		//연산자를 입력하시오
		System.out.print("연산자를 입력하시오:");
		cc2.inputOper();
		
		cc2.printResult();
		
		
		
	}
}
