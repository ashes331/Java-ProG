package ch05;

public class LengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "9506241230123";
		int length = ssn.length();
		if(length == 13 ) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		}
		
		//=======================================================
		String oldStr = "Java 문자열은 불변입니다. Java 문자열은 String 입니다.";
		String newStr = oldStr.replace("Java", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);

	}

}
