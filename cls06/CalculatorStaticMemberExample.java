package cls06;

public class CalculatorStaticMemberExample {

	public static void main(String[] args) {
		
		double result1 = 10 * 10 * CalculatorStaticMember.pi;
		int result2 = CalculatorStaticMember.plus(10, 5);
		int result3 = CalculatorStaticMember.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	

	}

}
