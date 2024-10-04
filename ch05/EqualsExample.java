package ch05;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Var1 = "홍길동";
		String Var2 = "횽길동";
		
		if(Var1 == Var2) {
			System.out.println("Var1과  Var2는 참조가 같음");
		} else {
			System.out.println("Var1과  Var2는 참조가 다름");
		}
		
		if(Var1.equals(Var2)) {
			System.out.println("Var1과  Var2는 문자열이 같음");
		}

	}

}
