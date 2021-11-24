package calc;

import java.util.Scanner;

public class Calc2 {
	
	//두 수의 변수를 선언(아래 메소드에 다 접근 가능 하게)
	private int num1;
	private int num2;
	private String op; //연산자 변수
	
	
	
	//두개의 수를 입력
	public void inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력:");
		this.num1 = sc.nextInt();
		System.out.print("입력:");
		this.num2 = sc.nextInt();
	}
	
	//연산자를 입력
	public void inputOper() {
		Scanner sc = new Scanner(System.in);
//		System.out.print("입력:");
		this.op = sc.next();
	}
	//결과를 출력해주는 기능
	public void printResult() {
		if(this.op.equals("+")) {
			System.out.println(this.num1+" "+this.op+" "+this.num2+" = "+plus());
			
		}
		
	}
	
	//더하기
	public int plus() {
		return this.num1+this.num2;
	}
	//빼기
	//곱하기
	//나누기

}
