package calc;

public class MainClass {
	
	public static void main(String[] args) {
			
		Test test = new Test();
		System.out.println("오늘 우리딸 생일인데 경마장에서 돈 많이 따야지~~ㅎㅎ");
		test.setA(30);
		int sung = test.getA();
		
		System.out.println("와 오늘 "+ sung+" 만원이나 땄네 딸이 좋아하겠군 ㅎㅎ");
//		System.out.println(sung+" 만원");
		
		test.gongYou(sung);
	
		
	}
}
