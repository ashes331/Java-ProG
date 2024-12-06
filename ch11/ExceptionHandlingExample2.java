package ch11;

public class ExceptionHandlingExample2 {
	public static void printLength(String data)  {
		try {
			int result = data.length();
			System.out.println("���ڼ�: " + result);
		} catch(NullPointerException e) {
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			e.printStackTrace();
		} finally {
			System.out.println("[������ ����]\n");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("[���α׷� ����]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[���α׷� ����]");
	}
}
