package ch05;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String board = "1,�ڹ� �н�,���� Ÿ�� String�� �н��մϴ�.,ȫ�浿";
		
		String[] tokens = board.split(",");
		
		System.out.println("��ȣ: " + tokens[0]);
		System.out.println("����: " + tokens[1]);
		System.out.println("����: " + tokens[2]);
		System.out.println("����: " + tokens[3]);
		System.out.println();
		
		for(int i=0; i<tokens.length; i++) {
			System.out.println(tokens[1]);	
		}

	}

}
