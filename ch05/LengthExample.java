package ch05;

public class LengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "9506241230123";
		int length = ssn.length();
		if(length == 13 ) {
			System.out.println("�ֹε�Ϲ�ȣ �ڸ����� �½��ϴ�.");
		} else {
			System.out.println("�ֹε�Ϲ�ȣ �ڸ����� Ʋ���ϴ�.");
		}
		
		//=======================================================
		String oldStr = "Java ���ڿ��� �Һ��Դϴ�. Java ���ڿ��� String �Դϴ�.";
		String newStr = oldStr.replace("Java", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);

	}

}
