package calc;

import java.util.Random;

public class Test {
	
	public static void method() {
		System.out.println("나는 method()");
	}
	
	//리턴값과 관계없이 매개변수로 구분한다.
//	public String method() {
//		return "나는 method()";
//	}
	
	//메소드 오버로딩(이름은 같지만 매개변수로 구분이 가능한것이 오버로딩)
	public static void method(int number) {
		System.out.println("나는 숫자를 받을 수 있는 method()");
	}
	public void method(int number1,int number2) {
		System.out.println("나는 숫자를 받을 수 있는 method()");
	}
	public void method(String str) {
		System.out.println("나는 문자열을 받을 수 있는 method()");
	}
	
	
	//오징어게임
	private static int money = 0;
	//경마장에서 돈따는 과정
	public void setA(int money) {
		System.out.println(money+"만원을 걸어야겠군");
		Random rd = new Random();
		this.money = (rd.nextInt(10)+1)*money;
		
	}
	public int getA() {
		return this.money;
	}
	
	public static void gongYou(int a) {
		System.out.println("[공유]선생님 저랑 딱지치기 한번 하시겠습니까? ");
		
		while(a>0) {
			System.out.println("짝!!");
			a-=10;
		}
		System.out.println("오징어게임에 참가하시겠습니까?");
	}
	
	
	
	

}
