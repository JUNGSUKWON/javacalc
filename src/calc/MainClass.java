package calc;

public class MainClass {
	
	public static void main(String[] args) {
			
		Test test = new Test();
		System.out.println("���� �츮�� �����ε� �渶�忡�� �� ���� ������~~����");
		test.setA(30);
		int sung = test.getA();
		
		System.out.println("�� ���� "+ sung+" �����̳� ���� ���� �����ϰڱ� ����");
//		System.out.println(sung+" ����");
		
		test.gongYou(sung);
	
		
	}
}
