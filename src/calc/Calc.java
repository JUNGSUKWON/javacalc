package calc;
/*
 *사칙연산 클래스
 *
 *
 *
 */

public class Calc {

	
	//더하기 메소드
	public int plus(int num1, int num2) {
		return num1+num2;
	}
	
	//뺴기 메소드
	public int minus(int num1,int num2) {
		int result = num1-num2;
		return result;
		
	}
	//곱하기 메소드
	public int muti(int num1,int num2) {
		int result = num1*num2;
		return result;
		
	}
	//나누기 메소드
	public int divide(int num1,int num2) {
		int result = num1/num2;
		return result;
	}
	
	//돈 복사기 메소드(3배로 뻥튀기)
	public int pung(int m) {
		System.out.println("m= "+m);
		return m*3;
	}
}
